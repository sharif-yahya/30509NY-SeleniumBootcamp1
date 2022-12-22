package com.testCases;

import base.BasePage;
import com.pages.ParaBankHomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ParaBankHomePageTest extends BasePage {

    ParaBankHomePage paraBankHomePage;

    public ParaBankHomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
        https://parabank.parasoft.com/

        paraBankHomePage = new ParaBankHomePage();
    }

    @Test(priority = 1)
    public void getParaBankTitleTest(){
        paraBankHomePage.getParaBankTitle();
    }

    @Test(priority = 2)
    public void  paraBankLogoDisplayed(){
        paraBankHomePage.paraBankLogoDisplayed();
    }
    @Test(priority = 3)
    public void homeIconIsDisplayed(){
        paraBankHomePage.homeIconIsDisplayed();
    }
    @Test(priority = 4)
    public void ExperienceTheDifferenceMessageUnderLogoIsDisplayedTest(){
        paraBankHomePage.ExperienceTheDifferenceMessageUnderLogoIsDisplayed();
    }
    @Test(priority = 5)
    public void navigateToRegisterPageTest(){
        paraBankHomePage.navigateToRegisterPage();
    }
}
