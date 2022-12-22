package testCases;

import base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.FindHomeLoan;

public class TestFindHomeloan extends BasePage {

    FindHomeLoan findHomeLoan;

    public TestFindHomeloan(){

        super();
    }
    @BeforeMethod
    public void setup(){
        https://www.bankofamerica.com/
        findHomeLoan = new FindHomeLoan();
    }
    @Test
    public void navigateToHomeLoanResultsTest() throws InterruptedException {

        findHomeLoan.getHomeLoanResults();

    }
}
