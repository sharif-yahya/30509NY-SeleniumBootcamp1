package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BookingHomePage extends BasePage {





    @FindBy(xpath = "//div[@class='bui-header__logo']")
    public WebElement checkingBookingLogo;

    @FindBy(xpath = "//img[@class='bui-avatar__image']")
    public WebElement checkingUSAFlag;

    @FindBy(xpath = "//span[@data-testid='herobanner-title1']")
    public WebElement checkingTextSave15PercentWithLateEscapeDeals;

    @FindBy(xpath = "//span[contains(text(),'Flights')]")
    public WebElement clickFlights;


    public BookingHomePage() {
        PageFactory.initElements(driver, this);
    }



    public void bookingHomePageTitle() {


        String expectedTitle = driver.getTitle();
        String actualTitle = "Booking.com | Official site | The best hotels, flights, car rentals & accommodations ";
        Assert.assertEquals(expectedTitle, actualTitle);

    }

    public void bookingLogo() {

        boolean b = checkingBookingLogo.isDisplayed();
        Assert.assertTrue(b);
    }

    public void affirmUsaFlag(){

       boolean b1 = checkingUSAFlag.isDisplayed();
       Assert.assertTrue(b1);

    }

    public void affirmTextSave15PercentWithLateEscapeDeals(){
      boolean b2 =  checkingTextSave15PercentWithLateEscapeDeals.isDisplayed();
      Assert.assertTrue(b2);
    }

    public FlightsPage navigateToFlightsPage(){
        clickOnElement(clickFlights);
        return new FlightsPage();
    }


}
