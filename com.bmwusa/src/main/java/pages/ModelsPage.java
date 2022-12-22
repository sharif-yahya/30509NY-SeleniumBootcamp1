package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class ModelsPage extends BasePage {

    @FindBy(xpath = "//nav[@class='globalnav-primary__nav']/ul/li/button/span")
    public static WebElement clickOnModelsText;

    @FindBy(xpath = "//button[@data-filter='savs']")
    public WebElement clickOnSAVsText;

    //  public static By clickOnSAVsTextby =By.xpath("//ul[@class='globalnav-primary-vehicles__filter']/li/button/span");
    @FindBy(xpath = "//a[@analytics-event='topnav-savs.x7-model.x7.link']")
    public WebElement clickOnX7Model;

    @FindBy(xpath = "//ul[@class='globalnav-local__links']/li/div/button")
    public WebElement clickOnModelsFeaturesText;

    @FindBy(xpath = "//a[@analytics-event='overview-model-and-features-flyout.bmw-m.x7-m60i.link']")
    public WebElement clickX7M60ILink;

    @FindBy(xpath = "//li[@class='byo-model-specs__column--right-model-data-msrp']")
    public WebElement X7M60IPrice;

    @FindBy(xpath = "//a[@class='main-logo-container white-logo']")
    public WebElement clickBMWHomePage;


    public ModelsPage() {
        PageFactory.initElements(driver, this);
    }

    public void getX7M60IPrice() {
        clickOnElement(clickOnModelsText);
       clickOnElement(clickOnSAVsText);
        //clickHeaderWithText(clickOnSAVsTextby, "SAVs");
        clickOnElement(clickOnX7Model);
        clickOnElement(clickOnModelsFeaturesText);
        clickOnElement(clickX7M60ILink);
        isElementVisible(X7M60IPrice);


    }

    public BMWHomePage navigateToHomePage() {

        clickOnElement(clickBMWHomePage);
        return new BMWHomePage();

    }

}
