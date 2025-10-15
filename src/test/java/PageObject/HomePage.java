package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {
	
	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	
 @FindBy (xpath = "//input[@title=\"Search for Products, Brands and More\"]")	
 WebElement txtSearchBar;
 
 public void setSearchbar(String ProductName) {
	 txtSearchBar.clear();
	 txtSearchBar.sendKeys(ProductName);
	 txtSearchBar.sendKeys(Keys.ENTER);
 }
}
