package com.testCases;

import base.BasePage;
import com.pages.SoccerPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SoccerPageTest extends BasePage {

    SoccerPage soccerPage;


    public SoccerPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        // driverSetup("true","chrome","https://www.espn.com/");
        soccerPage = new SoccerPage();


    }

    @Test(priority = 1)
    public void verifyMohamedElNeNyPageTest() {
        soccerPage.verifyMohamedElNeNyPage();
        Assert.assertTrue(isElementVisible(soccerPage.assertMohamedName));
    }

    @Test(priority = 2)
    public void navigateToNbaPageTest() {
        soccerPage.navigateNbaPage();

    }


}
