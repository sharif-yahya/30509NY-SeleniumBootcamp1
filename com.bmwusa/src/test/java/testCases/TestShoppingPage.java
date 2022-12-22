package testCases;

import base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.ShoppingPage;

public class TestShoppingPage extends BasePage {

    ShoppingPage shoppingPage;

    public TestShoppingPage(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        https://www.bmwusa.com/
        shoppingPage = new ShoppingPage();
    }
    @Test
    public void navigateToDetailsOn7SeriesTest(){

        shoppingPage.getDetailsOn7Series();
    }
}
