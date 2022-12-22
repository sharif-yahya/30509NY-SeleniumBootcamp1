package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BAHomePage extends BasePage {

    @FindBy(id = "nav-_-logo")
    public WebElement bALogo;

    @FindBy(xpath = "//h1[@class='tiles__heading text-black text-medium ']")
    public WebElement checkingTextFindTheRightSolutionsAsYourNeedsChange;

    @FindBy(xpath = "//a[@id='tile1770365945-_-get-started']")
    public WebElement navigateTHomePage;


    public BAHomePage(){
        PageFactory.initElements(driver,this);
    }



    public void checkingBALogo(){
      bALogo.isDisplayed();



    }


}
