package com.pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MarketsPage extends BasePage {


    @FindBy(xpath = "//nav[@id='navMenu']/ul/li")
    public WebElement topBarMenu;


    @FindBy(xpath = "//li[@class='row']/a[contains(text(),'Cryptocurrency')]")
    public WebElement cryptourrenylick;


    @FindBy(xpath = "//a[contains(text(),'Dogecoin')]")
    public WebElement DogecoinLink;


    public static By DogecoinNewsLinkby = By.xpath("//ul[@id='cryptoCurrenciesTabs']/li/a");

    @FindBy(xpath = "//img[@class='investingLogo']")
    public WebElement investingHomePage;

    public MarketsPage() {
        PageFactory.initElements(driver, this);
    }

    public void getToDogecoinNews() {


        hoverOverElement(topBarMenu);

        hoverOverElement(cryptourrenylick);


        clickOnElement(DogecoinLink);

        clickHeaderWithText(DogecoinNewsLinkby, "News");
    }

    public InvestingHomePage navigateToHomePage() {

        clickOnElement(investingHomePage);
        return new InvestingHomePage();
    }


}
