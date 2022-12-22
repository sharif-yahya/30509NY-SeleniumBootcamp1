import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class MbHomePage extends BasePage {

    @FindBy(xpath = "//a[@class='top-bar__logo ']")
    WebElement MbLogo;

    @FindBy(xpath = "(//div[@class='form__radio-indicator'])[2]")
    WebElement switchHomePageImg;

    // WebElement  slideToLeftBy  = driver.findElement(By.xpath("//div[@class='home-page-slider-hero__range']"));


    @FindBy(xpath = "(//a[contains(text(),' Learn More ')])[1]")
    WebElement clickLearnMore;

    @FindBy(xpath = "//button[contains(text(),'Vehicles')]")
    WebElement navigateToVehiclesPage;


    public MbHomePage() {
        PageFactory.initElements(driver, this);


    }

    public String checkingMbHomePageTitle() {
        driver.getTitle();
        String expectedTitle = driver.getTitle();
        String actualTitle = "Luxury Cars - Sedans, SUVs, Coupes & Wagons | Mercedes-Benz USA";
        Assert.assertEquals(actualTitle, expectedTitle);
        return driver.getTitle();
    }

    public void checkingMbLogo() {
        boolean status = MbLogo.isDisplayed();
        Assert.assertEquals(status, true);

        clickOnElement(switchHomePageImg);
    }

    public VehiclesPage navigateToVehiclesPage() {

        clickOnElement(navigateToVehiclesPage);
        return new VehiclesPage();
    }


}
