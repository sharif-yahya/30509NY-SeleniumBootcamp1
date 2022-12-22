package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BMWHomePage extends BasePage {

    @FindBy(xpath = "//a[@class='main-logo-container white-logo']")
    public WebElement BMWLogo;

    @FindBy(xpath = "//button[@analytics-event='topnav-1.menu.models-flyout.link']")
    public WebElement clickNavigateToModelsPage;


    public BMWHomePage(){
        PageFactory.initElements(driver,this);
    }
    public void BMWTitle(){
        String actualTitle  = driver.getTitle();
        String expectedTitle = "Luxury SUVs, Sedans, Coupes, Convertibles & Crossovers | BMW USA";
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    public void BMWHomeLogo(){
    boolean b = BMWLogo.isDisplayed();
    Assert.assertTrue(b);

    }
    public ModelsPage navigateToModelsPage(){
        clickOnElement(clickNavigateToModelsPage);
        return new ModelsPage();
    }



}
