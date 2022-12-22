import base.BasePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestAptForRent extends BasePage {

    AptForRent aptForRent;

    public TestAptForRent(){
       super();
    }
    @BeforeMethod
    public void setup(){
    //https://streeteasy.com/
       aptForRent = new AptForRent();

    }
    @Test
    public void navigateToBrooklynAptForRentTest(){

        aptForRent.getAptRentStatus();
    }
}
