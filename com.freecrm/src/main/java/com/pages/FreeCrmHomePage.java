package com.pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class FreeCrmHomePage extends BasePage {

    @FindBy(xpath = "//div[@class='header item']")
    public WebElement pageLogo;

    @FindBy(xpath = "//b[contains(text(),'ey')]")
    WebElement userNameLabel;

    @FindBy(xpath = "//*[contains(text(),'Contacts')]")
    WebElement contactsLink;

    @FindBy(xpath = "//*[contains(text(),'Deals')]")
    WebElement DealsLink;

    @FindBy(xpath = "//*[@id=\"main-nav\"]/div[3]/button")
    WebElement addContact;


    @FindBy(xpath = "//span[contains(text(),'Contacts')]")
    WebElement navigateToContactPage;


    public FreeCrmHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void verifyHomePageTitle() {

        String actualTitle = driver.getTitle();
        String expectedTitle = "Cogmento CRM";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    public void freeCrmLogo() {

        isElementVisible(pageLogo);
    }

    public void verifyCorrectUserName() {

        isElementVisible(userNameLabel);

    }

    public void clickOnContactsLink() {

        clickOnElement(contactsLink);

        clickOnElement(addContact);
    }


    public ContactsPage navigateToContactsPage() {

        clickOnElement(navigateToContactPage);
        return new ContactsPage();

    }


}
