import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class VerizonHomePage extends BasePage {

    @FindBy(xpath = "//div[@class='gnav20-grid1-wrapper']/div/div/a")
    WebElement verizonLogo;

    @FindBy(xpath = "//button[@id='gnav20-cart-icon']")
    WebElement cartIcon;

    @FindBy(xpath = "//button[@id='gnav20-search-icon']")
    WebElement searchIcon;

    @FindBy(xpath = "//button[@id='gnav20-Shop-L1']")
    WebElement shopPage;


    public VerizonHomePage() {
        PageFactory.initElements(driver, this);


    }

    public String checkingHomePageTitle() {
        driver.getTitle();
        String expectedTitle = "Verizon: Wireless, Internet, TV and Phone Services | Official Site";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
        return new String();
    }

    public void checkingHomePageLogo() {
        boolean status = verizonLogo.isDisplayed();
        Assert.assertEquals(true, status);


    }

    public void checkingHomePageCartIcon() {
        boolean status2 = cartIcon.isDisplayed();
        Assert.assertEquals(true, status2);
    }

    public void checkingHomePageSearchIcon() {
        boolean status3 = searchIcon.isDisplayed();
        Assert.assertEquals(true, status3);
    }

    public ShopPage navigateToShopPage() {

        clickOnElement(shopPage);

        return new ShopPage();


    }

}
