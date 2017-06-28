package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;

/**
 * Created by ASUS on 08-11-2016.
 */
public class ShipWreckDetailsPage extends BasePage{

    @AndroidFindBy(xpath = "//android.webkit.WebView[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']/android.view.View[@index='0']")
    private MobileElement addNewShipWreckButton;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@index='0']/android.view.View[@index='1']/android.view.View[@index='1']")
    private MobileElement allShipWreckLabel;

//    private MobileElement listOfRecord = driver.findElements(By.xpath("//android.webkit.WebView[@index='0']/android.view.View[@index='1']/android.view.View[@index='1']"))

    public void clickOnAddNewShipWreck(){
        addNewShipWreckButton.click();
    }

    public MobileElement getAllShipWreckLabel(){
        return allShipWreckLabel;
    }

    public ShipWreckDetailsPage(AppiumDriver driver) {
        super(driver);
    }
}
