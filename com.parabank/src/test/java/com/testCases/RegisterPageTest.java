package com.testCases;

import base.BasePage;
import com.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends BasePage {

    RegisterPage registerPage;

    public RegisterPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        https://parabank.parasoft.com/
        registerPage = new RegisterPage();

    }


    @Test(priority = 1)
    public void createUserAccountTest() {
        registerPage.createUserAccount();
        Assert.assertTrue( isElementVisible(registerPage.AccountServicesText));
    }


    @Test(priority = 2)
    public void navigateToHomePageTest() {
        registerPage.navigateToHomePage();

    }

}
