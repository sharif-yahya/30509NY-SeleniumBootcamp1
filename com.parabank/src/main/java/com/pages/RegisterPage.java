package com.pages;

import base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Random;
import java.util.UUID;

public class RegisterPage extends BasePage {

    @FindBy(xpath = "//a[contains(text(),'Register')]")
    public WebElement clickOnRegister;

    @FindBy(id = "customer.firstName")
    public WebElement inputFirstName;

    @FindBy(id = "customer.lastName")
    public WebElement inputLastName;

    @FindBy(id = "customer.address.street")
    public WebElement inputAddress;

    @FindBy(id = "customer.address.city")
    public WebElement inputCity;

    @FindBy(id = "customer.address.state")
    public WebElement inputState;

    @FindBy(id = "customer.address.zipCode")
    public WebElement inputZipCode;

    @FindBy(id = "customer.phoneNumber")
    public WebElement inputPhoneNumber;

    @FindBy(id = "customer.ssn")
    public WebElement inputSSN;

    @FindBy(id = "customer.username")
    public WebElement inputUserName;

    @FindBy(id = "customer.password")
    public WebElement inputPassword;

    @FindBy(id = "repeatedPassword")
    public WebElement confirmPassword;

    @FindBy(xpath = "//input[@value='Register']")
    public WebElement registerBtn;

    @FindBy(xpath = "//*[contains(text(),'Account Services')]")
    public WebElement AccountServicesText;

    @FindBy(xpath = "//img[@class='logo']")
    public WebElement homePage;


    public RegisterPage(){
        PageFactory.initElements(driver,this);
    }

    public void createUserAccount() {
        String randomString = generateRandomString();

        clickOnElement(clickOnRegister);
        sendKeysToElement(inputFirstName, randomString);
        sendKeysToElement(inputLastName, randomString);
        sendKeysToElement(inputAddress, randomString);
        sendKeysToElement(inputCity, randomString);
        sendKeysToElement(inputState, randomString);
        sendKeysToElement(inputZipCode, randomString);
        sendKeysToElement(inputPhoneNumber, randomString);
        sendKeysToElement(inputSSN, randomString);
        sendKeysToElement(inputUserName ,randomString);
        sendKeysToElement(inputPassword, "Test123456");
        sendKeysToElement(confirmPassword, "Test123456");
        clickOnElement(registerBtn);

    }

    public ParaBankHomePage navigateToHomePage(){

        clickOnElement(homePage);

      return new ParaBankHomePage();
    }

    public static String generateRandomString() {
        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder(15);
        for (int i = 0; i < 15; i++) {
            stringBuilder.append(chars.charAt(random.nextInt(chars.length())));
        }
        return stringBuilder.toString();
    }

}
