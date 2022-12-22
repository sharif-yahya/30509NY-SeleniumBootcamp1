package com.testCases;

import base.BasePage;
import com.pages.TVPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TVPageTest extends BasePage {

    TVPage tvPage;

    public TVPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
      //  driverSetup("true","chrome","https://www.optimum.com/");

        tvPage = new TVPage();
    }

    @Test(priority = 1)
    public void navigateToPackagePrice(){
        tvPage.getPackagePrice();
    }

    @Test(priority = 2)
    public void navigateToHomePageTest(){
        tvPage.navigateToHomePage();
    }

}
