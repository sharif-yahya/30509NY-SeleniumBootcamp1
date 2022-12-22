package com.pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TVPage extends BasePage {


    @FindBy(xpath = "//li[@id='nav-item-3']")
    public WebElement hoverOnTv;

    @FindBy(xpath = "(//a[contains(text(),'Optimum TV')])[1]")
    public WebElement clickOnOptimumTV;

    @FindBy(xpath = "//input[@id='edit-add1']")
    public WebElement inputAddress;

    @FindBy(xpath = "//input[@id='edit-add2']")
    public WebElement inputApt;

    @FindBy(xpath = "//input[@id='edit-city']")
    public WebElement inputCity;

    @FindBy(xpath = "//select[@id='edit-state']")
    public WebElement selectState;

    @FindBy(xpath = "//input[@id='edit-zip']")
    public WebElement inputZipCode;

    @FindBy(xpath = "//input[@id='edit-actions-submit']")
    public WebElement CheckAvailabilityBtn;

    @FindBy(xpath = "//label[@for='address-0']")
    public WebElement confirmAddress;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement continueMonthlyPayment;




    @FindBy(xpath = "//a[@class='site-logo']")
    public WebElement homePage;



    public TVPage(){
        PageFactory.initElements(driver,this);
    }

    public void getPackagePrice(){
        hoverOverElement(hoverOnTv);

        clickOnElement(clickOnOptimumTV);

        sendKeysToElement(inputAddress , "5701 7th Ave");

        sendKeysToElement(inputApt ,"g");

        sendKeysToElement(inputCity ,"brooklyn");

        selectFromDropdownByValue(selectState,"NY");

        sendKeysToElement(inputZipCode ,"11220");

        clickOnElement(CheckAvailabilityBtn);

        clickOnElement(confirmAddress);

        clickOnElement(continueMonthlyPayment);




    }

    public OptimumHomePage navigateToHomePage(){
        clickOnElement(homePage);
        return new OptimumHomePage();
    }
}
