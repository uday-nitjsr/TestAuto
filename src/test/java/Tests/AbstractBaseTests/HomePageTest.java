package Tests.AbstractBaseTests;

import Pages.HomePage;
import Pages.ShipWreckDetailsPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 08-11-2016.
 */
public class HomePageTest extends TestBase{
    public HomePage homePage;
    ShipWreckDetailsPage shipWreckDetailsPage;
    @Override
    public String getName() {
        return null;
    }

    @BeforeTest
    @Override
    public void setUpPage(){
        try {
            homePage = new HomePage(driver);
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(enabled = true)
    public void checkHeader() throws InterruptedException {
        homePage.takeScreenShot();
        Assert.assertEquals(homePage.getHeader().isDisplayed(),true);
        Assert.assertEquals(homePage.getListLabel().isDisplayed(),true);
        Assert.assertEquals(homePage.getButtonToList().isDisplayed(),true);
        Thread.sleep(5000);
        homePage.takeScreenShot();
//        Assert.assertEquals(homePage.getButtonToList().getText(),"WW");
    }

    @Test(enabled = true)
    public void validateClickHere() throws  InterruptedException{
        homePage.takeScreenShot();
        homePage.navigateToShipWreckPage();
        Thread.sleep(2000);
        shipWreckDetailsPage = new ShipWreckDetailsPage(driver);
        Assert.assertEquals(shipWreckDetailsPage.getAllShipWreckLabel().isDisplayed(),true);
        homePage.takeScreenShot();
    }
}
