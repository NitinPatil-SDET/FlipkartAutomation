package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

	WebDriver driver;
	static WebDriverWait wait;

	public BasePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

}

/*
 * initElements() method passing in the driver and the instance of the class,
 * which sets up the elements with the correct locators
 * 
 * Page Factory is an extension of POM in Selenium that uses annotations
 * like @FindBy to initialize web elements at runtime, simplifying the process
 * of object creation and improving test readability.
 * 
 * Benefits of POM and Page Factory
 * 
 * Improved Code Organization: Separates page-specific logic from test logic,
 * making code more readable and structured. Enhanced Reusability: Centralizes
 * locators and actions, enabling easy updates across tests when UI changes.
 * Reduced Code Duplication: Minimizes repetition by encapsulating page elements
 * and actions. Faster Test Development: Page Factory’s annotations reduce
 * boilerplate code, speeding up element initialization. Easier Maintenance:
 * Changes in UI require updates only in page classes, not in individual test
 * scripts.
 */