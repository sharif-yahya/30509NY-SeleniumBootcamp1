import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MbHomePageTest extends BasePage {


    MbHomePage mbHomePage;

    public MbHomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
       // driverSetup("true","chrome","https://www.mbusa.com/en/home");
        mbHomePage = new MbHomePage();

    }

    @Test(priority = 1)
    public void checkingMbHomePageTitleTest() {
        mbHomePage.checkingMbHomePageTitle();
    }

    @Test(priority = 2)
    public void checkingMbLogoTest() {
        mbHomePage.checkingMbLogo();
    }


    @Test(priority = 3)
    public void navigateToVehiclesPageTest() {

      mbHomePage.navigateToVehiclesPage();


    }



}
