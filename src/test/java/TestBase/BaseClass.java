package TestBase;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class BaseClass<WebDriver> {

    public WebDriver driver;

    @BeforeTest
    @Parameters({"os", "osVersion", "browser", "browserVersion"})
    public void setUp(String os, String osVersion, String browser, String browserVersion) throws IOException {

        // Load BrowserStack credentials
        Properties props = new Properties();
        props.load(new FileInputStream("src/test/resources/browserstack.properties"));

        String username = props.getProperty("browserstack.username");
        String accessKey = props.getProperty("browserstack.accesskey");

        // Set BrowserStack capabilities
        DesiredCapabilities caps = new DesiredCapabilities();

     // BrowserStack W3C options
     Map<String, Object> bstackOptions = new HashMap<>();
     bstackOptions.put("os", "Windows");
     bstackOptions.put("osVersion", "11");
     bstackOptions.put("buildName", "Parallel Build");
     bstackOptions.put("sessionName", "Flipkart Filter Test - Chrome on Windows");
     bstackOptions.put("projectName", "Flipkart Automation");
     bstackOptions.put("local", "false");  // if using BrowserStack local testing

     // Set browser capabilities
     caps.setCapability("bstack:options", bstackOptions);
     caps.setCapability("browserName", "Chrome");
     caps.setCapability("browserVersion", "latest");
    
        // Launch BrowserStack session
        driver = new RemoteWebDriver(
                new URL("https://" + username + ":" + accessKey + "@hub-cloud.browserstack.com/wd/hub"),
                caps
        );

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.flipkart.com/");
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit(); // Close the browser session
        }
    }
}
