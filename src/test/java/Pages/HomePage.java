package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;

/**
 * Created by ASUS on 08-11-2016.
 */
public class HomePage extends BasePage {

    public HomePage(AppiumDriver driver) {
        super(driver);
    }

    @AndroidFindBy(xpath = "//android.view.View[@index='2']//android.widget.Button[@index='0']")
    private MobileElement buttonToList;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@index='0']/android.view.View[@index='1']/android.view.View[@index='0']")
    private MobileElement header;

    @AndroidFindBy(xpath = "//android.webkit.WebView[@index='0']/android.view.View[@index='1']/android.view.View[@index='2']/android.view.View[@index='1']")
    private MobileElement listLabel;

    public MobileElement getButtonToList(){
        return buttonToList;
    }

    public MobileElement getHeader(){
        return header;
    }

    public MobileElement getListLabel(){
        return listLabel;
    }

    public void navigateToShipWreckPage(){
        buttonToList.click();
    }

}
