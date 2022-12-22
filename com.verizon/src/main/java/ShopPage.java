import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShopPage extends BasePage {

   /* @FindBy(xpath ="//*[@class='gnav20-global-nav-list gnav20-navigation-list']/div/div")
    public WebElement headerMenuBarBy;*/

    public static By headerMenuBarBy = By.xpath("//*[@class='gnav20-global-nav-list gnav20-navigation-list']/div/div");

   /* @FindBy(xpath ="//*[@class='gnav20-content-wrapper gnav20-grouping-active']/ul/li")
    public WebElement verizonCategoryBy;*/

    public static By verizonCategoryBy = By.xpath("//*[@class='gnav20-content-wrapper gnav20-grouping-active']/ul/li");

   /* @FindBy(xpath ="//*[@style='display: block;']//li/a")
    public WebElement devicesCategoryBy;*/

    public static By devicesCategoryBy = By.xpath("//*[@style='display: block;']//li/a");

    @FindBy(xpath = "//div[@data-skumodel='MQ8R3LL/A']")
    WebElement clickOnIphone14Plus;

    @FindBy(xpath = "//span[@class='ToggleIconWrapper-sc-19osi3m-0 iROKCE toggleIconWrapper']")
    WebElement clickOnColorButton;

    @FindBy(xpath = "//input[@data-track='Color-Space Black']")
    WebElement clickOnBlackColor;

    @FindBy(xpath = "//div[@class='gnav20-grid1-wrapper']/div/div/a")
    WebElement navigateToVerizonHomePage;


    public ShopPage() {
        PageFactory.initElements(driver, this);

    }

    public void getIphone14PlusInfo()  {

        clickHeaderWithText(headerMenuBarBy, "Shop");


        clickHeaderWithText(verizonCategoryBy, "Devices");

        clickHeaderWithText(devicesCategoryBy, "Smartphones");

        jsClickOnElement(clickOnIphone14Plus);

        clickOnElement(clickOnColorButton);

        safeClickOnElement(clickOnBlackColor);




    }

    public VerizonHomePage navigateToHomePage() {

        clickOnElement(navigateToVerizonHomePage);
        return new VerizonHomePage();
    }

}
