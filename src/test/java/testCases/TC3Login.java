package testCases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import base.Baseclass;
import pageObjects.Loginpage2;

public class TC3Login extends Baseclass {

    Loginpage2 lr2;

    @BeforeMethod
    public void setupPageObject() {
        lr2 = new Loginpage2(driver);
    }

    @Test
    public void verifySmartWateringCollection() {
        lr2.shopbycollection();
        log.info("Money Tree Plant added to cart");
        log.info("Indoor Olive Tree added to cart");
    }

    @Test
    public void verifyEasyCareCollection() {
        lr2.shopbycollection1();
        log.info("Golden Pothos Plant added to cart");
    }

    @Test
    public void verifyPetFriendlyCollection() {
        lr2.shopbycollection2();
        log.info("Rattlesnake plant added to cart");
    }
}
