package com.pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class InvestingHomePage extends BasePage {

    @FindBy(xpath = "//img[@class='investingLogo']")
    public WebElement investingLogo;


    @FindBy(xpath = "//a[@class='topBarIconWrap']")
    public WebElement topBarIconWrap_P;

    @FindBy(xpath = "(//a[contains(text(),'Markets')])[1]")
    public WebElement navigateToMarketPage;

    public InvestingHomePage(){
        PageFactory.initElements(driver,this);
    }

    public void InvestingHomePageTitle(){

        String actualTitle = driver.getTitle();
        String expectedTitle = "Investing.com - Stock Market Quotes & Financial News";
        Assert.assertEquals(actualTitle,expectedTitle);
    }
    public void InvestingHomePageLogo(){

     isElementVisible(investingLogo);
    }
    public void InvestingHomePageTopBarIconWrap_P(){

       isElementVisible(topBarIconWrap_P);
    }
    public MarketsPage navigateToMarketsPage(){

        clickOnElement(navigateToMarketPage);
        return new MarketsPage();
    }





}
