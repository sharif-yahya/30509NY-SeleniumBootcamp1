import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ShopPageTest extends BasePage {


    ShopPage shopPage;

    public ShopPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
      //  driverSetup("true", "chrome", "https://www.verizon.com/");
        shopPage = new ShopPage();
    }

    @Test(priority = 1)
    public void navigateToIphone14Test()  {
        shopPage.getIphone14PlusInfo();
    }

    @Test(priority = 2)
    public void navigateToHomePageTest() {
        shopPage.navigateToHomePage();
    }



}
