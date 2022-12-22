import base.BasePage;
import com.pages.MarketsPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MarketsPageTest extends BasePage {

    MarketsPage marketsPage;

    public MarketsPageTest(){
        super();

    }
    @BeforeMethod
    public void setUp(){
       // driverSetup("true","chrome","https://www.investing.com/");

        marketsPage = new MarketsPage();
    }
    @Test(priority = 1)
    public void navigateToDogecoinNewsTest() throws InterruptedException {

        marketsPage.getToDogecoinNews();
    }
    @Test(priority = 2)
    public void navigateToHomePageTest(){

        marketsPage.navigateToHomePage();
    }


    }

