package PageObject;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends BasePage {

	public SearchPage(WebDriver driver) {
		super(driver);
	}

	// Locators
	@FindBy(xpath = "//a[@title='Mobiles']")
	WebElement InkMobile;

	@FindBy(xpath = "//div[@title='Samsung']")
	WebElement ckdBoxSamsung;

	@FindBy(xpath = "//label[@class='tJjCVx cnLG4I']")
	WebElement ckdboxFassured;

	@FindBy(xpath = "//div[@class='zg-M3Z' and text()='Price -- Low to High']")
	WebElement filterPriceLowtoHigh;
	
	
	
	
	// Action Method
	public void clickMobile() {
		InkMobile.click();
	}

	public void selectCkdBoxSamsung() {
		ckdBoxSamsung.click();
	}

	public void selectCkdBoxFassured() {
		ckdboxFassured.click();
	}

	public void clickPriceLtoH() {
		filterPriceLowtoHigh.click();
	}
	
	@FindBy(xpath = "//div[@class='KzDlHZ']")
	List<WebElement> productNames ;

	@FindBy(xpath = "//div[@class='Nx9bqj _4b5DiR']")
	List<WebElement> prices;
	
	@FindBy(xpath = "//a[@class='CGtC98']")
	List<WebElement> buylinks;
	
	public void printProductsOnPage() throws InterruptedException {
		
		System.out.println("---- Page 1 Results ----");
		
		for (int i = 0; i < Math.min(productNames.size(), 5); i++) {
            System.out.println("Product: " + productNames.get(i).getText());
            System.out.println("Price: " + prices.get(i).getText());
            System.out.println("Link: " + buylinks.get(i).getAttribute("href"));
            System.out.println("-----------" +i+ "---------------");
            Thread.sleep(3000);
        }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
