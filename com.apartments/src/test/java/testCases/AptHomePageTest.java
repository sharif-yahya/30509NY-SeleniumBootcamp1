package testCases;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;
import pages.AptHomePage;

public class AptHomePageTest extends BasePage {

    AptHomePage aptHomePage;

    public AptHomePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
       // driverSetup("true","chrome","https://www.apartments.com/");


        aptHomePage = new AptHomePage();
    }


    @Test(priority = 3)
    public void setTextDiscoverYourNewHomeTest(){

        Assert.assertTrue(isElementVisible(aptHomePage.textDiscoverYourNewHome));
    }
    @Test(priority = 4)
    public void navigateToAptForRentPageTest(){
        aptHomePage.navigateToAptForRentPage();
    }
   /* @AfterMethod()
    public void tearDown(){
       // cleanUp("true");

     //   driver.quit();


    }*/
}
