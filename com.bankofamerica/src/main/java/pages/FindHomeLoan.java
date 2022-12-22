package pages;

import base.BasePage;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FindHomeLoan extends BasePage {


    @FindBy(id = "navHomeLoans")
    public WebElement clickOnHomeLoan;

    @FindBy(id = "findAHome")
    public WebElement clickFindHome;

    @FindBy(xpath = "//input[@id='Criteria/Location']")
    public WebElement inputZipCode;

    @FindBy(id = "search-submit-button")
    public WebElement clickOnSearch;

    @FindBy(xpath = "//span[@class='search-text']")
    public WebElement clickOnContinue;

    @FindBy(id = "ddbtn-label-pricerange")
    public WebElement clickAnyPrice;

    @FindBy(xpath = "//li[@data-val='900000']")
    public WebElement clickOn900000min;

    @FindBy(xpath = "//*[@id=\"maxprice-list\"]/li[34]")
    public WebElement clickOn2000000max;

    @FindBy(id = "ddbtn-label-beds")
    public WebElement clickOnAnyBeds;

    @FindBy(xpath = "//*[@id=\"dd-criteria-beds\"]/li[6]/label")
    public WebElement clickOn4Beds;

    @FindBy(xpath = "//a[@id='btn-save-this-search']")
    public WebElement clickSave;

    public FindHomeLoan(){
        PageFactory.initElements(driver,this);
    }

    public void getHomeLoanResults() throws InterruptedException {
        clickOnElement(clickOnHomeLoan);
        clickOnElement(clickFindHome);
        sendKeysToElement(inputZipCode,"Brooklyn Ave, Brooklyn, NY 11203");

        clickOnElement(clickOnSearch);

       // driver.switchTo().alert().accept();

        //clickOnElement(clickOnContinue);
        clickOnElement(clickAnyPrice);
        clickOnElement(clickOn900000min);
        clickOnElement(clickOn2000000max);
        clickOnElement(clickOnAnyBeds);
        clickOnElement(clickOn4Beds);
        clickOnElement(clickSave);
    }

}
