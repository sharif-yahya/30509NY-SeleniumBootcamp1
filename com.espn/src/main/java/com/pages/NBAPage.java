package com.pages;

import base.BasePage;
import org.openqa.selenium.NoSuchWindowException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NBAPage extends BasePage {


    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_nba']")
    public WebElement nbaPageBtn;


    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav__team_brooklyn_nets']")
    public WebElement brooklynnetclickBtn;


    @FindBy(xpath = "//span[contains(text(),'Stats')]")
    WebElement brooklynNetStats;

    @FindBy(xpath = "(//tr[@data-idx='1'])[1]")
    WebElement kyrieIrvingPage;

    @FindBy(xpath = "//div[@class='Image__Wrapper Image__Wrapper--relative']//img[@alt='Kyrie Irving']")
    WebElement kyrieImg;

    @FindBy(xpath = "//div[contains(text(),'Full Splits')]")
    WebElement kyrieIrvingStats;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault&lid=sitenav_main-logo']")
    WebElement espnHomePage;


    public NBAPage() {
        PageFactory.initElements(driver, this);


    }


    public void verifyKyrieIrvingStatus() throws NoSuchWindowException {


        hoverOverElement(nbaPageBtn);


        clickOnElement(brooklynnetclickBtn);


        clickOnElement(brooklynNetStats);


        clickOnElement(kyrieIrvingPage);

       /* boolean b2 = kyrieImg.isDisplayed();
        Assert.assertTrue(true);*/

        isElementVisible(kyrieImg);

        clickOnElement(kyrieIrvingStats);

    }

    public ESPNHomePage navigateToHomePage() {
        espnHomePage.click();
        return new ESPNHomePage();

    }
}
