package testCases;

import base.BasePage;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BAHomePage;

public class BAHomePageTest extends BasePage {

    BAHomePage baHomePage;

    public BAHomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        //  driverSetup("true", "chrome", "https://www.bankofamerica.com/");

        baHomePage = new BAHomePage();
    }



    @Test(priority = 2)
    public void checkingBALogoTest() {

      baHomePage.checkingBALogo();
       Assert.assertTrue(isElementVisible(baHomePage.bALogo));


    }



}
