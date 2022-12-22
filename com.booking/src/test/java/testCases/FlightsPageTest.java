package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FlightsPage;

public class FlightsPageTest extends BasePage {

    FlightsPage flightsPage;

    public FlightsPageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        //driverSetup("true", "chrome", "https://www.booking.com/");
        flightsPage = new FlightsPage();
    }

    @Test(priority = 1)
    public void getFlightoptionTest() throws InterruptedException {
        flightsPage.getFlightOption();
    }

    @Test(priority = 2)
    public void navigateToHomePageTest() {
        flightsPage.navigateToHomePage();
    }

}
