package com.pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ESPNHomePage extends BasePage {


    NBAPage soccerPage;

    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault&lid=sitenav_main-logo']")
    WebElement espnLogo;

    @FindBy(xpath = "//a[@name='&lpos=LRail:espn+:logo']")
    WebElement espnPlusLogo;

    @FindBy(xpath = "//li[@class='sports menu-soccer']")
    WebElement navigateToSoccerPage;

    public ESPNHomePage() {
        PageFactory.initElements(driver, this);

        soccerPage = new NBAPage();

    }

    public String verifyEspnPageTitle() {

        String actualTitle = driver.getTitle();
        String expectedTitle = "ESPN: Serving sports fans. Anytime. Anywhere.";
        Assert.assertEquals(actualTitle, expectedTitle);
        return driver.getTitle();
    }

    public void verifyEspnPageLogo() {
        espnLogo.isDisplayed();
        Assert.assertTrue(true);

    }

    public void verifyEspnPlusPageLogo() {
        boolean b1 = espnPlusLogo.isDisplayed();
        Assert.assertTrue(b1);
    }

    public SoccerPage navigateToSoccerPage() {
       jsClickOnElement( navigateToSoccerPage);
        return new SoccerPage();
    }
}
