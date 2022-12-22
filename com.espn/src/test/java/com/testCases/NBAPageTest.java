package com.testCases;

import base.BasePage;
import com.pages.NBAPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NBAPageTest extends BasePage {


    NBAPage nbaPage;

    public NBAPageTest() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        //  driverSetup("true", "chrome", "https://www.espn.com/");
        nbaPage = new NBAPage();
    }

    @Test(priority = 1)
    public void verifyKyrieIrvingStatusTest() {
        nbaPage.verifyKyrieIrvingStatus();
    }

    @Test(priority = 2)
    public void navigateToHomePage() {
        nbaPage.navigateToHomePage();
    }


}
