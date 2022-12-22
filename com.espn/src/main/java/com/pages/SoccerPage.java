package com.pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class SoccerPage extends BasePage {


    @FindBy(xpath = "//a[@name='&lpos=sitenavdefault+sitenav_soccer']")
    public WebElement soccerBtn;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav__team_premier_league']")
    WebElement premierLeaguePage;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav_soccer_teams']")
    public WebElement teamPage;

    @FindBy(xpath = "//a[@name='&lpos=subnav+subnav_soccer_arsenal']")
    WebElement arsenalPage;

    @FindBy(xpath = "//span[contains(text(),'Squad')]")
    WebElement squadArsenalPage;

    @FindBy(xpath = "//a[contains(text(),'Mohamed Elneny')]")
    WebElement mohamedElnenyPage;

    @FindBy(xpath = "//h1[@class='PlayerHeader__Name flex flex-column ttu fw-bold pr4 h2']")
    public WebElement assertMohamedName;

    @FindBy(xpath = "//body[@class='index desktop page-context-top prod']")
    WebElement nbaPage;


    public SoccerPage() {


        PageFactory.initElements(driver, this);


    }

    public void verifyMohamedElNeNyPage() {


        hoverOverElement(soccerBtn);


        clickOnElement(premierLeaguePage);


        hoverOverElement(teamPage);


        clickOnElement(arsenalPage);


        clickOnElement(squadArsenalPage);


        clickOnElement(mohamedElnenyPage);

        isElementVisible(assertMohamedName);


    }

    public ESPNHomePage navigateNbaPage() {
        clickOnElement(nbaPage);
        return new ESPNHomePage();
    }


}
