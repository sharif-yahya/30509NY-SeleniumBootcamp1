package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SportingGoodsPage;

public class SportingGoodsPageTest extends BasePage {


    SportingGoodsPage sportingGoodsPage;

    public SportingGoodsPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
       // driverSetup("true", "chrome", "https://www.ebay.com/");
        sportingGoodsPage = new SportingGoodsPage();
    }

    @Test(priority = 1)
    public void navigateToBrazilHomeJerseyInfoAndPriceTest() throws InterruptedException {
        sportingGoodsPage.getBrazilHomeJerseyInfoAndPrice();
    }

    @Test(priority = 2)
    public void navigateToHomePage() {
        sportingGoodsPage.navigateToHomePage();
    }


}
