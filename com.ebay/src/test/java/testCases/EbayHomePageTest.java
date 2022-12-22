package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.EbayHomepage;

public class EbayHomePageTest extends BasePage {

    EbayHomepage ebayHomepage;

    public EbayHomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
      //  driverSetup("true", "chrome", "https://www.ebay.com/");

        ebayHomepage = new EbayHomepage();
    }

    @Test(priority = 1)
    public void ebayTitleTest() {
        ebayHomepage.ebayHomePageTitle();
    }

    @Test(priority = 2)
    public void ebayLogoTest() {
        ebayHomepage.setEbayLogo();

    }

    @Test(priority = 3)
    public void BillIconTest() {
        ebayHomepage.setBillIcon();
    }

    @Test(priority = 4)
    public void CartIconTest() {
        ebayHomepage.setCartIcon();
    }

    @Test(priority = 5)
    public void navigateToSportingGoodsPageTest() {
        ebayHomepage.navigateToSportingGoodsPage();
    }


}
