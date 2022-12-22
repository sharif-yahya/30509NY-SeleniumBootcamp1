package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AptForRentPage extends BasePage {

    @FindBy(id = "headerMeunIcon")
    public WebElement headerMenuIcon;


    public static By apartmentsForRentLinkby = By.xpath("//ul[@class='menuNavigation']/li/a");

    public static By nyApartmentsForRentby = By.xpath("//ul[@class='submenu properties']/li/a");
/*    @FindBy(xpath = "//ul[@class='submenu properties']/li/a")
    public static WebElement nyApartmentsForRent;*/

    @FindBy(xpath = "//a[@id='rentRangeLink']")
    public WebElement clickOnPrice;

    @FindBy(xpath = "//li[@data-value='2000'][1]")
    public WebElement clickOn2000;

    @FindBy(xpath = "//li[@data-value='3500'][1]")
    public WebElement clickOn3500;

    @FindBy(xpath = "//a[@id='bedRangeLink']")
    public WebElement clickOnBed;

    @FindBy(xpath = "(//li[contains(text(),'2 Beds')])[1]")
    public WebElement clickOn2Bed;

    @FindBy(xpath = "//a[@id='typeSelect']")
    public WebElement clickOnType;

    @FindBy(xpath = "//table[@class=' table-condensed']")
    public WebElement dateWait;

    public static By  dateWaitby = By.xpath("//*[@id='datepickerSearch']/div/div[1]/table/thead/tr/th");

    @FindBy(xpath = "//th[@class='next']")
    public WebElement clickOnNext;

    @FindBy(xpath = "//td[text()='20']")
    public WebElement clickOn20;

    @FindBy(xpath = "//span[@id='type_1']")
    public WebElement checkAptBox;


    @FindBy(xpath = "//img[@alt='Apartments.com Logo']")
    public WebElement homePage;


    public AptForRentPage() {
        PageFactory.initElements(driver, this);
    }

    public void navigateToAptRangePrice() {
        clickOnElement(headerMenuIcon);

        // safeClickOnElement(headerMenuIcon);
        // getTrimmedElementText(apartmentsForRentLink, "Apartments For Rent");
        clickHeaderWithText(apartmentsForRentLinkby, "Apartments For Rent");
        clickHeaderWithText(nyApartmentsForRentby, "New York Apartments For Rent");
        clickOnElement(clickOnPrice);
        clickOnElement(clickOn2000);
        clickOnElement(clickOn3500);
        clickOnElement(clickOnBed);
        clickOnElement(clickOn2Bed);
        clickOnElement(clickOnType);


        clickOnElement(checkAptBox);


    }

    public AptHomePage navigateToAptHomePage() {
        clickOnElement(homePage);
        return new AptHomePage();
    }

}
