package com.testCases;

import base.BasePage;
import com.pages.ContactsPage;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class ContactsPageTest extends BasePage {

    ContactsPage contactsPage;

    public ContactsPageTest() {
        super();

    }

    @BeforeMethod
    public void setUp() {
        // driverSetup("true", "chrome", "https://freecrm.com/");

        contactsPage = new ContactsPage();


    }

    @Test(priority = 1)
    public void selectContactsTest() {

        contactsPage.createNewContact();


    }

    @Test(priority = 2)
    public void navigateToDealsPageTest() {

        contactsPage.navigateToDealsPage();
    }


}
