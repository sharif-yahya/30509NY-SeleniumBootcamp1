package com.testCases;

import base.BasePage;
import com.pages.FreeCrmHomePage;
import com.pages.LogInPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class logInPageTest extends BasePage {

    LogInPage loginPage;
   FreeCrmHomePage  homePage;

    public logInPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
       // driverSetup("true","chrome","https://freecrm.com/");
        loginPage = new LogInPage();

    }

	@Test(priority = 1)
	public void loginPageTitleTest() {
		 loginPage.validateLoginPageTitle();

	}

    @Test(priority = 2)
    public void loginTest() {
        loginPage.login();
    }



}
