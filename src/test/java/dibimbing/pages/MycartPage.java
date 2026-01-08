package dibimbing.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class MycartPage extends BasePage {
    public MycartPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productTV")
    private WebElement carttitle;

    public boolean isTitlePresent() {
        return carttitle.isDisplayed();
    }
}
