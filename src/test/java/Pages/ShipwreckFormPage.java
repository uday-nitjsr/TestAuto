package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by ASUS on 08-11-2016.
 */
public class ShipwreckFormPage extends BasePage {

    @AndroidFindBy(xpath = "//android.widget.EditText[@resource-id='name']")
    private MobileElement nameEditField;

    public MobileElement getNameEditField(){
        return nameEditField;
    }
    public ShipwreckFormPage(AppiumDriver driver) {
        super(driver);
    }
}
