package com.pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ParaBankHomePage extends BasePage {

    @FindBy(xpath = "//img[@class='logo']")
    public WebElement logoPage;

    @FindBy(xpath = "//li[@class='home']")
    public WebElement homeIcon;

    @FindBy(xpath = "//p[@class='caption']")
    public WebElement ExperienceTheDifferenceMessageUnderLogo;

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement RegisterPage;

    public ParaBankHomePage(){
        PageFactory.initElements(driver,this);
    }

    public void getParaBankTitle(){
        String actualTitle = driver.getTitle();
        String expectedTitle = "ParaBank | Welcome | Online Banking";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    public void paraBankLogoDisplayed(){
        isElementVisible(logoPage);

    }
    public void homeIconIsDisplayed(){
        isElementVisible(homeIcon);
    }
    public void ExperienceTheDifferenceMessageUnderLogoIsDisplayed(){
        isElementVisible(ExperienceTheDifferenceMessageUnderLogo);
    }
    public RegisterPage navigateToRegisterPage(){

        clickOnElement(RegisterPage);

        return new RegisterPage();

    }





}
