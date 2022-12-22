package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class FlightsPage extends BasePage {

    public static By calenderBy = By.xpath("//table[@class='Calendar-module__dates___k5ju6']//tr/td/span");
    @FindBy(xpath = "//a[@data-decider-header='flights']")
    public WebElement clickFlightsText;

    @FindBy(xpath = "//input[@value='ONEWAY']")
    public WebElement clickoneWayText;

    @FindBy(xpath = "//div[@class='css-hm3w49']")
    public WebElement clickAirportBox;

    @FindBy(xpath = "//input[@class='css-1tl2oa1']")
    public WebElement addJFKAirport;

    @FindBy(xpath = "//span[contains(text(),'JFK')]")
    public WebElement checkBoxJFK;

    @FindBy(xpath = "//div[@style='background-color:#f2f2f2;width:100%']")
    public WebElement hoverOnMainPage;

    @FindBy(xpath = "//div[@data-testid='searchbox_destination_0']")
    public WebElement whereToInputClick;

    public static By whereToInputClickby = By.xpath("//div[@data-testid='searchbox_destination_0']");

    @FindBy(xpath = "//*[@class='css-1tl2oa1']")
    public WebElement whereToInputsendKeys;

    //  public static By whereToInputsendKeysby = By.xpath("//div[@data-testid='searchbox_destination_0']");

    @FindBy(xpath = "//span[contains(text(),'Miami International Airport')]")
    public WebElement clickMiamiInternationalAirport;


    @FindBy(xpath = "//*[@id='basiclayout']/div/div[1]/div/div/div[2]/div[2]/div/div[2]/div/div[4]/div/div/span/div/button/div")
    public WebElement setFlightDate;

    @FindBy(xpath = "//button[@data-testid='searchbox_submit']")
    public WebElement clickSearchBtn;

    @FindBy(xpath = "//button[@data-testid='searchbox_submit']")
    public WebElement navigateToHomePage;


    public FlightsPage() {
        PageFactory.initElements(driver, this);
    }

    public void getFlightOption() throws InterruptedException {
        clickOnElement(clickFlightsText);

        jsClickOnElement(clickoneWayText);

        clickOnElement(clickAirportBox);

        sendKeysToElement(addJFKAirport, "JFK");

        clickOnElement(checkBoxJFK);

        jsClickOnElement(whereToInputClick);

        Thread.sleep(5000);

        sendKeysToElement(whereToInputsendKeys, "miami");

        clickOnElement(clickMiamiInternationalAirport);

        clickOnElement(setFlightDate);

        clickOnDatePicker(calenderBy, "30");


        jsClickOnElement(clickSearchBtn);
    }


    {
    }


    public BookingHomePage navigateToHomePage() {
        clickOnElement(navigateToHomePage);
        return new BookingHomePage();
    }
}





