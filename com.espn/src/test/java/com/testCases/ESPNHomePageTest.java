package com.testCases;

import base.BasePage;
import com.pages.ESPNHomePage;
import com.pages.NBAPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ESPNHomePageTest extends BasePage {

    ESPNHomePage homePage;
    NBAPage soccerPage;

    public ESPNHomePageTest() {
        super();


    }

    @BeforeMethod
    public void setUp() {
       // driverSetup("true","chrome","https://www.espn.com/");
        homePage = new ESPNHomePage();
        soccerPage = new NBAPage();


    }

    @Test(priority = 1)
    public void verifyEspnPageTitleTest() {
        homePage.verifyEspnPageTitle();
        // Assert.assertEquals(title, "ESPN: Serving sports fans. Anytime. Anywhere.");
    }

    @Test(priority = 2)
    public void verifyEspnPageLogoTest() {
      homePage.verifyEspnPageLogo();
    }

    @Test(priority = 3)
    public void verifyEspnPlusPageLogoTest() {
       homePage.verifyEspnPlusPageLogo();
    }

    @Test(priority = 4)
    public void navigateToSoccerPageTest() {
        homePage.navigateToSoccerPage();

    }




}


