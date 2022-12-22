import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AptForRent extends BasePage {


    @FindBy(xpath = "(//li[@class='MainNav-listItem isTrackingMenuItem'])[1]")
    public WebElement clickOnRent;

    @FindBy(xpath = "(//a[contains(text(),'Brooklyn')])[1]")
    public WebElement clickOnBrooklyn;

    @FindBy(xpath = "//input[@id='price_from-price-combobox']")
    public WebElement clickOnPrice;

    @FindBy(xpath = "//ul[@id='price_from-price-combobox-listbox']//li")
    public WebElement clickOn500;

    @FindBy(xpath = "//ul[@id='price_to-price-combobox-listbox']//li[10]")
    public WebElement clickOn3500;

    @FindBy(xpath = "//button[@aria-label='Done']")
    public WebElement clickOnDone;

    @FindBy(xpath = "//button[@aria-label='Beds']")
    public WebElement clickOnBeds;

    @FindBy(xpath = "//button[@value='3']")
    public WebElement clickOn3Beds;

    @FindBy(xpath = "//button[@aria-label='Done']")
    public WebElement clickOnDone2;

    @FindBy(xpath = "//button[@aria-label='More']")
    public WebElement clickOnMore;

    @FindBy(xpath = "//input[@id='available_date']")
    public WebElement clickOnDate;

    @FindBy(xpath = "//div[@class='react-datepicker__current-month']")
    public WebElement clickOnDateDecember2022;

    @FindBy(xpath = "//button[@class='react-datepicker__navigation react-datepicker__navigation--next']")
    public WebElement clickOnNextDate;

    @FindBy(xpath = "//div[@aria-label='day-28']")
    public WebElement clickOnDateDay;

    @FindBy(xpath = "//input[@aria-label='Subway Line 4']")
    public WebElement clickOnSubway4;

    @FindBy(xpath = "//input[@aria-label='Hudson–Bergen Light Rail']")
    public WebElement clickOnHBLR;

    @FindBy(xpath = "//button[@aria-label='Done']")
    public WebElement clickOnDone3;

    @FindBy(xpath = "//h1[@class='srp-result-count']")
    public WebElement assertOnBrooklynApartmentsForRent;


    public AptForRent(){
        PageFactory.initElements(driver,this);

    }

    public void getAptRentStatus(){
        hoverOverElement(clickOnRent);
        clickOnElement(clickOnBrooklyn);
        clickOnElement(clickOnPrice);
        clickOnElement(clickOn500);
        clickOnElement(clickOn3500);
        clickOnElement(clickOnDone);
        clickOnElement(clickOnBeds);
        clickOnElement(clickOn3Beds);
        clickOnElement(clickOnDone2);
        clickOnElement(clickOnMore);
        clickOnElement(clickOnDate);
        selectDate("28","January","2023");
        clickOnElement(clickOnSubway4);
        clickOnElement(clickOnHBLR);
        clickOnElement(clickOnDone3);

    }
    public static String[] getMonthYear(String monthYear){
        return monthYear.split(" ");

    }
    public static void selectDate(String Day,String month,String year){
        String  monthYear = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
        while (!(getMonthYear( monthYear)[0].equals(month) && getMonthYear( monthYear)[1].equals(year))){
            driver.findElement(By.xpath("//button[@class='react-datepicker__navigation react-datepicker__navigation--next']"));
            monthYear = driver.findElement(By.xpath("//div[@class='react-datepicker__current-month']")).getText();
            System.out.println( monthYear);

            month = monthYear.split(" ")[0].trim();
             year = monthYear.split(" ")[1].trim();

        }
        driver.findElement(By.xpath("//div[@aria-label='"+Day+"']"));

    }


}
