package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingPage extends BasePage {

    @FindBy(xpath = "//button[@name='Shopping Flyout']")
    public WebElement clickOnShopping;

    @FindBy(xpath = "//input[@id='zip_code']")
    public WebElement inputZibCode;

    @FindBy(xpath = "//button[@name='zip_btn']")
    public WebElement clickOnShopNew;

    @FindBy(xpath = "//button[@class='accordion-container_togglebutton_1uqhw accordion-container_hoverButton_3t7up']")
    public WebElement clickOnAdd;

    @FindBy(xpath = "//input[@analytics-event='inventory-results.filter-interaction.series-7.link']")
    public WebElement clickOn7Series;

    @FindBy(xpath = "//span[contains(text(),'See Details')]")
    public WebElement clickOnSeeDetails;

    public ShoppingPage(){
        PageFactory.initElements(driver,this);
    }

    public void getDetailsOn7Series(){
        clickOnElement(clickOnShopping);
        sendKeysToElement(inputZibCode,"11214");
       clickOnElement(clickOnShopNew);
       jsClickOnElement(clickOnAdd);
        jsClickOnElement(clickOn7Series);
        jsClickOnElement(clickOnSeeDetails);

    }
}
