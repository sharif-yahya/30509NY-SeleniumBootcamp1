import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class VehiclesPageTest extends BasePage {


    VehiclesPage vehiclesPage;

    public VehiclesPageTest(){
        super();

    }
    @BeforeMethod
    public void setUp(){
      //  driverSetup("true","chrome","https://www.mbusa.com/en/home");
        vehiclesPage = new VehiclesPage();
    }
    @Test(priority = 1)
    public void navigateT0buildS500AMG() throws InterruptedException {
        vehiclesPage.buildS500AMG();

    }
    @Test(priority = 2)
    public void navigateToMbHomePageTest(){
        vehiclesPage.navigateToHomePage();
    }

}
