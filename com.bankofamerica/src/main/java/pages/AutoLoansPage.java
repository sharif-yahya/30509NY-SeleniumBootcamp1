package pages;

import base.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AutoLoansPage extends BasePage {

    @FindBy(xpath = "//a[@id='navAutoLoans']")
    public WebElement clickOnAutoLoanPage;

    @FindBy(xpath = "//a[@id='checkAutoLoanRates']")
    public  WebElement clickAutoLoanRates;

    @FindBy(xpath = "//select[@id='stateSelectModal']")
    public WebElement SelectState;

    @FindBy(xpath = "//a[@id='stateSelectorSubmit']")
    public WebElement clickOSubmit;


    @FindBy(xpath = "//a[@id='apply_now']")
    public WebElement applyNow;


    @FindBy(id = "autoLoanTypeSelect")
    public WebElement autoLoanType;

    @FindBy(xpath = "//label[@for='vehicle-loan-idonthavecarinformation']")
    public WebElement noInformation;
    @FindBy(id = "continueButtonLarge")
    public WebElement clickContinueButton1;

    @FindBy(xpath = "//input[@aria-describedby='loanAmount-hint-text']")
    public WebElement loanAmountInput;

    @FindBy(xpath = "//select[@id='loanTerm']")
    public WebElement loanTerm;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0firstName-hint-text']")
    public WebElement FirstNameInput;

   /* @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0middleName-hint-text']")
    public WebElement MiddleNameInput;*/

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0lastName-hint-text']")
    public WebElement lastNameInput;

    @FindBy(xpath = "//select[@id='applicantInfoList0suffix']")
    public WebElement SuffixInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0addressLines0-hint-text']")
    public WebElement addressInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0addressLines1-hint-text']")
    public WebElement streetAddressInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0city-hint-text']")
    public WebElement cityInput;

    @FindBy(xpath = "//select[@id='applicantInfoList0state']")
    public WebElement statInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0zipcode-hint-text']")
    public WebElement zipCodeInput;

    @FindBy(xpath = "//select[@id='applicantInfoList0timeAtAddress']")
    public WebElement TimeAtThisAddressInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0homePhoneNumber-hint-text']")
    public WebElement phoneNumInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0email-hint-text']")
    public WebElement emailInput;

    @FindBy(xpath = "//input[@aria-describedby='confirmEmailAddressField-hint-text']")
    public WebElement confirmEmailInput;

    @FindBy(xpath = "//label[@for='countryOfCitizenshipYes']")
    public WebElement  clickUsCitizenInput;

    @FindBy(xpath = "//select[@id='countryOfResidenceSelect']")
    public WebElement CountryOfResidenceInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0birthDate-hint-text']")
    public WebElement DateOfBirthInput;

    @FindBy(xpath = "//input[@id='applicantInfoList0motherMaidenName']")
    public WebElement motherMaidenNameInput;

    @FindBy(xpath = "//input[@id='reEnterMothersMaidenNameInput']")
    public WebElement confirmMotherNameInput;

    @FindBy(xpath = "//select[@id='employmentStatusSelect']")
    public WebElement EmploymentStatusInput;

    @FindBy(xpath = "//input[@aria-describedby='applicantInfoList0otherIncomeInfo0incomeAmount-hint-text']")
    public WebElement YearlyIncome;

    @FindBy(xpath = "//select[@id='notEmployedIncomeSourceSelect']")
    public WebElement IncomeSource;
    @FindBy(xpath = "//select[@id='housingStatusSelect']")
    public WebElement HousingStatusInput;

    @FindBy(xpath = "//input[@name='applicantInfoList0monthlyHouseCost']")
    public WebElement MonthlyHousingPaymentInput;

    @FindBy(xpath = "//label[@for='co-applicant-adding-co-applicant-module-individual-button']")
    public WebElement clickIndividuallyInput;

   @FindBy(xpath = "//a[@id='continueButtonLarge']")
    public WebElement clickContinueButton2;

    @FindBy(xpath = "//a[@id='navChecking']")
    public WebElement clickBAHomePage;



   public AutoLoansPage(){

       PageFactory.initElements(driver,this);

   }

   public void goingThrowLoanProcess(){

       clickOnElement(clickOnAutoLoanPage);
       clickOnElement(clickAutoLoanRates);
       selectFromDropdownByVisibleText(SelectState,"New York");
       clickOnElement(clickOSubmit);
       clickOnElement(applyNow);
       selectFromDropdownByVisibleText(autoLoanType,"Dealer purchase");
       clickOnElement(noInformation);
       clickOnElement(clickContinueButton1);
       sendKeysToElement(loanAmountInput,"10000");
       selectFromDropdownByVisibleText(loanTerm,"48 months");
       sendKeysToElement(FirstNameInput,"ali");
       sendKeysToElement(lastNameInput,"amin");
       selectFromDropdownByVisibleText(SuffixInput,"Sr");
       sendKeysToElement(addressInput,"1299");
       sendKeysToElement(streetAddressInput,"main st");
       sendKeysToElement(cityInput,"queens");
       selectFromDropdownByVisibleText(statInput, "New York");
       sendKeysToElement(zipCodeInput,"11990");
       selectFromDropdownByVisibleText(TimeAtThisAddressInput,"5 years");
       sendKeysToElement(phoneNumInput,"718-888-9998");
       sendKeysToElement(emailInput,"ali@yahoo.com");
       sendKeysToElement(confirmEmailInput,"ali@yahoo.com");
       clickOnElement(clickUsCitizenInput);
       selectFromDropdownByVisibleText(CountryOfResidenceInput,"Palestine, State of");
       sendKeysToElement(DateOfBirthInput,"1960");
       sendKeysToElement(motherMaidenNameInput,"kiki");
       sendKeysToElement(confirmMotherNameInput,"kiki");
       selectFromDropdownByVisibleText(EmploymentStatusInput,"Retired");
       sendKeysToElement(YearlyIncome,"50,000");
       selectFromDropdownByVisibleText(IncomeSource,"Part-time job");
       selectFromDropdownByVisibleText(HousingStatusInput,"I own");
       clickOnElement(clickIndividuallyInput);
       clickOnElement(clickContinueButton2);



   }
   public BAHomePage navigateToBAHomePage(){

       clickOnElement(clickBAHomePage);
       return new BAHomePage();
   }

















}
