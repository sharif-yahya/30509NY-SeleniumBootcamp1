package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BMWHomePage;

public class BMWHomePageTest extends BasePage {

   BMWHomePage bmwHomePage;

    public BMWHomePageTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
       // driverSetup("true","chrome","https://www.bmwusa.com/");

        bmwHomePage = new BMWHomePage();
    }
    @Test(priority = 1)
    public void BMWTitleTest(){
        bmwHomePage.BMWTitle();
    }
    @Test(priority = 2)
    public void BMWHomeLogoTest(){
        bmwHomePage.BMWHomeLogo();
    }
    @Test(priority = 3)
    public void navigateToModelsPageTest(){
        bmwHomePage.navigateToModelsPage();
    }





}
