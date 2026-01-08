package dibimbing.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage {

    public ProductPage(AndroidDriver driver) {
        super(driver);
    }

    @AndroidFindBy(accessibility = "title")
    private WebElement title;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.android:id/productIV")
    private WebElement productImage;

    @AndroidFindBy(accessibility = "Tap to add product to cart")
    private WebElement addtocart;

    @AndroidFindBy(accessibility = "Displays number of items in your cart")
    private WebElement cart;

    public boolean isTitlePresent() {
        return title.isDisplayed();
    }

    public void clickproduct() {
        productImage.click();
    }

    public void clickaddcart() {
        addtocart.click();
    }

    public void clickcart() {
        cart.click();
    }
}
