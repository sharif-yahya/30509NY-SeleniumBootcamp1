import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehiclesPage extends BasePage {


    public static By clickVehiclesLinkBy = By.xpath("//div[@class='global-header__menu-l1__inner']/ul/li");


    public static By clickSedansWagonsCollectionBy = By.xpath("//div[@class='global-header__menu-l3-tabs-container']/ul/li");
    @FindBy(xpath = "//button[@aria-controls='global-header__item-models-cta-1-4']")
    WebElement clickModelsSClass;

    @FindBy(xpath = "//a[contains(text(),'S 500 4MATIC Sedan')]")
    WebElement clickModelsS500Sedan;

    @FindBy(xpath = "//img[@alt='Rubellite Red metallic paint swatch']")
    WebElement clickColorRube;

    @FindBy(xpath = "//a[@class='button button_primary button--wide button--full-width-small-only']")
    WebElement buildS500;

    @FindBy(xpath = "//a[@aria-label='Start Build, AMG Line']")
    WebElement buildAMGS500;

    @FindBy(xpath = "//button[@data-qa-id='mbs-interstitial-message-modal__cta']")
    WebElement continueMyBuild;

    @FindBy(xpath = "//img[@data-lazy-src='/content/dam/mb-nafta/us/myco/my22/swatches/wheels/2022-S-SEDAN-AMGLINE-WHEEL-THUMBNAIL-RWK.jpg']")
    WebElement clickWheels19InchAMG;

    @FindBy(xpath = "//button[@class='button button_primary mbs-build-steps__cta']")
    WebElement nextPage;


    @FindBy(xpath = "//button[@class='button button_primary mbs-build-steps__cta']")
    WebElement nextPage2;


    @FindBy(xpath = "//input[@aria-label='Add Heated steering wheel, $250']")
    WebElement heatedSteeringWheel;

    @FindBy(xpath = "//button[@class='button button_primary mbs-build-steps__cta']")
    WebElement nextPage3;

    @FindBy(xpath = "//*[@id=\"byo\"]/div/div[1]/div[2]/div[4]/button")
    public WebElement saveYourBuild;


    @FindBy(xpath = "//button[@id='summary']")
    WebElement clickOnSummary;

    @FindBy(xpath = "//a[@class='top-bar__logo']")
    WebElement navigateToMbHomepage;


    public VehiclesPage() {
        PageFactory.initElements(driver, this);


    }

    public void buildS500AMG() throws InterruptedException {

        clickHeaderWithText(clickVehiclesLinkBy, "Vehicles");

        clickHeaderWithText(clickSedansWagonsCollectionBy, "Sedans & Wagons");

        clickOnElement(clickModelsSClass);

        clickOnElement(clickModelsS500Sedan);

        clickOnElement(clickColorRube);

        clickOnElement(buildS500);

        clickOnElement(buildAMGS500);

        clickOnElement(continueMyBuild);

        clickOnElement(clickWheels19InchAMG);

        clickOnElement(nextPage);


        jsClickOnElement(nextPage2);

        jsClickOnElement(heatedSteeringWheel);

        clickOnElement(nextPage3);
        // clickOnElement(clickOnSummary);

        clickOnElement(saveYourBuild);




        // clickOnElement(addDegreeRearAxle);


    }

    public MbHomePage navigateToHomePage() {

        clickOnElement(navigateToMbHomepage);
        return new MbHomePage();
    }

}
