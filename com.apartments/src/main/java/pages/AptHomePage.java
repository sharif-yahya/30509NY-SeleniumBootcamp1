package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class AptHomePage extends BasePage {


    @FindBy(xpath = "//img[@alt='Apartments.com Logo']")
    public WebElement aptLogo;



    @FindBy(xpath = "//h1[@class='mainTitle']")
    public WebElement textDiscoverYourNewHome;

    @FindBy(id = "headerMeunIcon")
    public WebElement headerMenuIcon;

   public AptHomePage(){
       PageFactory.initElements(driver,this);

   }


   public void setTextDiscoverYourNewHome(){
       textDiscoverYourNewHome.isDisplayed();

   }
   public AptForRentPage navigateToAptForRentPage(){
      clickOnElement(headerMenuIcon);
       return new AptForRentPage();
   }

}
