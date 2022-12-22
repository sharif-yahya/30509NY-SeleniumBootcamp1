package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportingGoodsPage extends BasePage {

    @FindBy(xpath = "//li[@data-hover-track='p2481888.m1385.l6435']")
    public WebElement clickSportingGoodsText;

   // public static By clickSportingGoodsTextby = By.xpath("//ul[@class='hl-cat-nav__container']/li");
    @FindBy(xpath = "//a[@_sp='p2481888.m1385.l3255']")
    public WebElement clickTeamSportsText;

  /*  @FindBy(xpath = "///section[@data-view='mi:4337|iid:1']//ul/li")
    public static By clickSoccerTextby;*/

    public static By clickSoccerTextby =By.xpath("//section[@data-view='mi:4337|iid:1']//ul/li");

 /*   @FindBy(xpath = "//section[@data-view='mi:4337|iid:1']//ul/li")
    public static By clickClothingShoesAccessories;*/

    public static By clickClothingShoesAccessoriesby =By.xpath("//section[@id='s0-17-12-0-1[0]-0-0']//ul/li");
    @FindBy(xpath = "//*[contains(text(),'Brazil Home Jersey Qatar 2022 Fan Version')]")
    public WebElement clickBrazilHomeJersey;

    @FindBy(xpath = "//img[@id='gh-logo']")
    public WebElement ebayLogo;

    public SportingGoodsPage() {
        PageFactory.initElements(driver, this);
    }

    public void getBrazilHomeJerseyInfoAndPrice() throws InterruptedException {


        hoverOverElement(clickSportingGoodsText);


        clickOnElement(clickTeamSportsText);

       clickHeaderWithText(clickSoccerTextby,"Soccer");


        clickHeaderWithText(clickClothingShoesAccessoriesby,"Clothing, Shoes & Accessories");


        clickOnElement(clickBrazilHomeJersey);
        Thread.sleep(3000);
    }

    public EbayHomepage navigateToHomePage() {
        clickOnElement(ebayLogo);
        return new EbayHomepage();
    }
}






