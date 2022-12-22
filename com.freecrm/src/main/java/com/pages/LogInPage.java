package com.pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class LogInPage extends BasePage {


    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement loginBtn1;

    @FindBy(xpath = "//input[contains(@type,'text')]")
    WebElement email;

    @FindBy(xpath = "//input[contains(@type,'password')]")
    WebElement password;

    @FindBy(xpath = "//div[contains(text(),'Login')]")
    WebElement loginBtn;

  /*  @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement homePage;*/

    // initializing the page objects
    public LogInPage() {
        PageFactory.initElements(driver, this);
    }

    // Action
    public String validateLoginPageTitle() {
        driver.getTitle();
        String actualTitle = driver.getTitle();
        String expectedTitle = "Free CRM software for any business with sales, support and customer relationship management";
        Assert.assertEquals(actualTitle,expectedTitle);

       return new String();


    }

    public FreeCrmHomePage login() {
         clickOnElement(loginBtn1);
       sendKeysToElement(email,"sharifyahya38@gmail.com");
       sendKeysToElement(password,"Eyblood22");
       jsClickOnElement(loginBtn);

       // clickOnElement(homePage);

        return new FreeCrmHomePage();
    }


}
