package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AutoLoansPage;
import pages.BAHomePage;

public class AutoLoanPageTest extends BasePage {

    AutoLoansPage autoLoansPage;


    public AutoLoanPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        // driverSetup("true","chrome","https://www.bankofamerica.com/");

        autoLoansPage = new AutoLoansPage();
    }

    @Test(priority = 1)
    public void goingThrowLoanProcessTest() {
        autoLoansPage.goingThrowLoanProcess();
    }

    @Test(priority = 2)
    public void navigateToBAHomePageTest() {
        autoLoansPage.navigateToBAHomePage();



    }

}