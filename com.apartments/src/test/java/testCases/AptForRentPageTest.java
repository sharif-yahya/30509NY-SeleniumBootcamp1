package testCases;

import base.BasePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AptForRentPage;

public class AptForRentPageTest extends BasePage {

    AptForRentPage aptForRentPage;

    public AptForRentPageTest() {
        super();
    }

    @BeforeMethod
    public void setup() {
//https://www.apartments.com/

        aptForRentPage = new AptForRentPage();

    }

    @Test(priority = 1)
    public void navigateToPriceRentRangePageTest() {
        aptForRentPage.navigateToAptRangePrice();
    }




}

