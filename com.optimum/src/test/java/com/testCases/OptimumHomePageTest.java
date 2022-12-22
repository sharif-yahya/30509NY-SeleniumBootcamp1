package com.testCases;

import base.BasePage;
import com.pages.OptimumHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OptimumHomePageTest extends BasePage {

    OptimumHomePage optimumHomePage;

    public OptimumHomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
       // driverSetup("true","chrome","https://www.optimum.com/");
        optimumHomePage = new OptimumHomePage();
    }
    @Test(priority = 1)
    public void OptimumHomePageTitleTest(){
        optimumHomePage.OptimumHomePageTitle();
    }

    @Test(priority = 2)
    public void OptimumHomePageLogoTest(){
        optimumHomePage.OptimumHomePageLogo();
    }

    @Test(priority = 3)
    public void OptimumHomePageCheckAvailabilityTextTest(){
        optimumHomePage.OptimumHomePageCheckAvailabilityText();
    }

    @Test(priority = 4)
    public void OptimumPhoneNumberTest(){
        optimumHomePage.OptimumPhoneNumber();
    }

    @Test(priority = 5)
    public void navigateToTVPageTest(){
        optimumHomePage.navigateToTVPage();
    }


}
