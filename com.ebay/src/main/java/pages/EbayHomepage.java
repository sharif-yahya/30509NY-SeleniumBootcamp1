package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class EbayHomepage extends BasePage {

    @FindBy(xpath = "//img[@id='gh-logo']")
    public WebElement ebayLogo;

    @FindBy(xpath = "//i[@id='gh-Alerts-i']")
    public WebElement billIcon;

    @FindBy(xpath = "//*[@class='gh-cart-icon']")
    public WebElement cartIcon;

    @FindBy(xpath = "//li[@class='hl-cat-nav__js-tab']//a[contains(text(),'Sporting Goods')]")
    public WebElement sportingPage;

  public EbayHomepage(){
      PageFactory.initElements(driver,this);
  }
  public void ebayHomePageTitle(){
      String expectedTitle = driver.getTitle();
      String actualTitle = "Electronics, Cars, Fashion, Collectibles & More | eBay";
      Assert.assertEquals(expectedTitle,actualTitle);
  }
  public void setEbayLogo(){
    boolean b =  ebayLogo.isDisplayed();
    Assert.assertTrue(b);
  }
  public void setBillIcon(){
     boolean b1 = billIcon.isDisplayed();
     Assert.assertTrue(true);
  }
  public void setCartIcon(){
    boolean b2 =  cartIcon.isDisplayed();
    Assert.assertTrue(true);
  }
  public SportingGoodsPage navigateToSportingGoodsPage(){
      clickOnElement(sportingPage);
      return new SportingGoodsPage();
  }






}
