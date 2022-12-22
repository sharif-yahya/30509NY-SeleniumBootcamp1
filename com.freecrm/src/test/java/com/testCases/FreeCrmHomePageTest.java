package com.testCases;

import base.BasePage;
import com.pages.DealsPage;
import com.pages.FreeCrmHomePage;
import com.pages.LogInPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FreeCrmHomePageTest extends BasePage {

    FreeCrmHomePage freeCrmHomePage;

    LogInPage logInPage;

    public FreeCrmHomePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
     // driverSetup("true","chrome","https://freecrm.com/");

      freeCrmHomePage = new FreeCrmHomePage();
      logInPage = new LogInPage();

      logInPage.login();


    }
    @Test(priority = 1)
    public void verifyHomePageTitleTest(){
        freeCrmHomePage.verifyHomePageTitle();

    }
    @Test(priority = 2)
    public void checkingLogoTest(){
        freeCrmHomePage.freeCrmLogo();
    }
    @Test(priority = 3)
    public void verifyuserNameLabelTest(){
       freeCrmHomePage.verifyCorrectUserName();
    }
    @Test(priority = 4)
    public void clickOnContactsLinkTest(){
        freeCrmHomePage.clickOnContactsLink();

    }


    @Test
    public void navigateToContactspage(){
        freeCrmHomePage.navigateToContactsPage();

    }








}
