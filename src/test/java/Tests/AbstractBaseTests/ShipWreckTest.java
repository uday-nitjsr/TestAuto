package Tests.AbstractBaseTests;

import Pages.HomePage;
import Pages.ShipWreckDetailsPage;
import Pages.ShipwreckFormPage;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Created by ASUS on 08-11-2016.
 */
public class ShipWreckTest extends TestBase {

    HomePage homePage;
    ShipwreckFormPage shipwreckFormPage;
    public ShipWreckDetailsPage shipWreckDetailsPage;

    @Override
    public String getName() {
        return null;
    }

    @BeforeTest
    @Override
    public void setUpPage() {
        shipWreckDetailsPage = new ShipWreckDetailsPage(driver);
        shipwreckFormPage = new ShipwreckFormPage(driver);
        homePage = new HomePage(driver);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void checkAddNewShipWreck() throws InterruptedException {
        homePage.navigateToShipWreckPage();
        shipWreckDetailsPage.clickOnAddNewShipWreck();
        Thread.sleep(2000);
        Assert.assertEquals(shipwreckFormPage.getNameEditField().isDisplayed(),true);
        shipWreckDetailsPage.takeScreenShot();
    }
}
