package TestCases;

import org.testng.annotations.Test;

import PageObject.HomePage;
import PageObject.SearchPage;
import TestBase.BaseClass;

public class TC02_SearchFilterParallelTest extends BaseClass {

	@Test()
	public void testSearchAndFilter() throws Exception {
		HomePage hp = new HomePage(driver);
		hp.setSearchbar("Samsung Galaxy S10");

		Thread.sleep(2000);

		SearchPage sp = new SearchPage(driver);
		sp.clickMobile();

		Thread.sleep(2000);
		sp.selectCkdBoxSamsung();

		Thread.sleep(2000);
		sp.selectCkdBoxFassured();

		Thread.sleep(2000);
		sp.clickPriceLtoH();

		sp.printProductsOnPage();
		Thread.sleep(5000);
	}
}
