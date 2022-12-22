package com.pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactsPage extends BasePage {


    LogInPage logInPage;
    FreeCrmHomePage freeCrmHomePage;


    @FindBy(id = "dashboard-toolbar")
    WebElement moveMose;


    @FindBy(xpath = "//*[contains(@name,'first_name')]")
    WebElement firstName;

    @FindBy(xpath = "//*[contains(@name,'last_name')]")
    WebElement lastName;

    @FindBy(xpath ="//*[@id='main-content']/div/div[2]/form/div[2]/div[2]/div/div/input")
    WebElement companyName;

    @FindBy(xpath = "//*[@id=\"dashboard-toolbar\"]/div[2]/div/button[2]")
    WebElement saveBtn;

    @FindBy(xpath = "//span[contains(text(),'Deals')]")
    public WebElement DealsPage;





    public ContactsPage() {
        PageFactory.initElements(driver, this);

        logInPage = new LogInPage();
        logInPage.login();
        freeCrmHomePage = new FreeCrmHomePage();

    }




    public void createNewContact(){


        freeCrmHomePage.clickOnContactsLink();


        hoverOverElement(moveMose);

        sendKeysToElement(firstName,"ali");
        sendKeysToElement(lastName,"hassan");
        sendKeysToElement(companyName,"ny_com");
        clickOnElement(saveBtn);

    }
    public DealsPage navigateToDealsPage(){
        clickOnElement(DealsPage);
        return new DealsPage();
    }



}
