package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BookingHomePage;

public class BookingHomePageTest extends BasePage {

    BookingHomePage bookingHomePage;

    public BookingHomePageTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        // driverSetup("true", "chrome", "https://www.booking.com/");

        bookingHomePage = new BookingHomePage();
    }



    @Test(priority = 2)
    public void bookingHomePageTitleTest() {
        bookingHomePage.bookingHomePageTitle();
    }

    @Test(priority = 3)
    public void bookingLogoTest() {
        bookingHomePage.bookingLogo();
    }

    @Test(priority = 4)
    public void affirmUsaFlagTest() {
        bookingHomePage.affirmUsaFlag();
    }

    @Test(priority = 5)
    public void affirmTextSave15PercentWithLateEscapeDealsTest() {
        bookingHomePage.affirmTextSave15PercentWithLateEscapeDeals();
    }

    @Test(priority = 6)
    public void navigateToFlightsPage() {
        bookingHomePage.navigateToFlightsPage();
    }

}