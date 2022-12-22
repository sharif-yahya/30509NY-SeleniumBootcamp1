import base.BasePage;
import com.pages.InvestingHomePage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InvestingHomePageTest extends BasePage {

    InvestingHomePage investingHomePage;


    public InvestingHomePageTest(){
        super();
    }

    @BeforeMethod
    public void setUp(){
      //  driverSetup("true","chrome","https://www.investing.com/");

        investingHomePage = new InvestingHomePage();
    }
    @Test(priority = 1)
    public void InvestingHomePageTitleText(){

        investingHomePage.InvestingHomePageTitle();
    }

    @Test(priority = 2)
    public void InvestingHomePageLogoTest(){

        investingHomePage.InvestingHomePageLogo();
    }

    @Test(priority = 3)
    public void  InvestingHomePageTopBarIconWrap_PTest(){

        investingHomePage.InvestingHomePageTopBarIconWrap_P();
    }

    @Test(priority = 4)
    public void navigateToMarketsPageTest(){

        investingHomePage.navigateToMarketsPage();
    }


}
