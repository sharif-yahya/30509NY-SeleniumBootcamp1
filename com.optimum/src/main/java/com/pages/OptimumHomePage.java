package com.pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OptimumHomePage extends BasePage {

    @FindBy(xpath = "//a[@class='site-logo']")
    public WebElement homeLogo;

    @FindBy(xpath = "//div[@class='header-shop-now']")
    public WebElement CheckAvailabilityText;

    @FindBy(xpath = "//div[@class='header-item header-phone']")
    public WebElement phoneNumberOnTopPage;

    @FindBy(xpath = "//li[@id='nav-item-3']")
    public WebElement tvPage;

    public OptimumHomePage() {
        PageFactory.initElements(driver, this);
    }

    public void OptimumHomePageTitle() {
        String actualTitle = driver.getTitle();
        String expectedTitle = "Broadband High-Speed Internet, TV Packages & Mobile Phone Deals";
        Assert.assertEquals(actualTitle, expectedTitle);

    }

    public void OptimumHomePageLogo() {
        boolean b = homeLogo.isDisplayed();
        Assert.assertTrue(b);
    }

    public void OptimumHomePageCheckAvailabilityText() {
        boolean b1 = CheckAvailabilityText.isDisplayed();
        Assert.assertTrue(b1);
    }

    public void OptimumPhoneNumber() {
        boolean b2 = phoneNumberOnTopPage.isDisplayed();
        Assert.assertTrue(b2, "866-347-4784");
    }

    public TVPage navigateToTVPage() {
        clickOnElement(tvPage);
        return new TVPage();

    }


}
