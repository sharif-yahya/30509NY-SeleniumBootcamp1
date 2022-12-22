import base.BasePage;
import config.BaseConfig;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VerizonHomePageTest extends BasePage {


    VerizonHomePage verizonHomePage;

    public VerizonHomePageTest() {
        super();

    }

    @BeforeMethod
    public void setUp() {
       // driverSetup("true", "chrome", "https://www.verizon.com/");
        verizonHomePage = new VerizonHomePage();

    }

    @Test(priority = 1)
    public void checkingHomePageTitleTest() {
        verizonHomePage.checkingHomePageTitle();

    }

    @Test(priority = 2)
    public void checkingHomePageLogoTest() {
        verizonHomePage.checkingHomePageLogo();

    }

    @Test(priority = 3)
    public void checkingHomePageCartIconTest() {
        verizonHomePage.checkingHomePageCartIcon();
    }

    @Test(priority = 4)
    public void checkingHomePageSearchIconTest() {
        verizonHomePage.checkingHomePageSearchIcon();
    }

    @Test(priority = 5)
    public void navigateToShopPageTest() {
        verizonHomePage.navigateToShopPage();

    }




}
