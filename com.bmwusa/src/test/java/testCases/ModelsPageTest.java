package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ModelsPage;

public class ModelsPageTest extends BasePage {

    ModelsPage modelsPage;

    public ModelsPageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
       // driverSetup("true","chrome","https://www.bmwusa.com/");
        modelsPage = new ModelsPage();
    }
    @Test(priority = 1)
    public void navigateToX7M60IPriceTest(){
        modelsPage.getX7M60IPrice();
    }
    @Test(priority = 2)
    public void navigateToHomePageTest(){
        modelsPage.navigateToHomePage();
    }


}
