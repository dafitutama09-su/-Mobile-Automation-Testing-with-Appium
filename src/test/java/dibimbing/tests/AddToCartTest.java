package dibimbing.tests;

import dibimbing.core.BaseTest;
import dibimbing.pages.GlobalPage;
import dibimbing.pages.LoginPage;
import dibimbing.pages.MycartPage;
import dibimbing.pages.ProductPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static dibimbing.core.DriverManager.driver;

public class AddToCartTest extends BaseTest {

    @Test
    public void userCanAddProductToCart() {

        // GLOBAL PAGE
        GlobalPage globalPage = new GlobalPage(driver.get());
        globalPage.clickViewMenu();
        globalPage.clickLoginMenuItem();

        // LOGIN
        LoginPage loginPage = new LoginPage(driver.get());
        loginPage.login("bod@example.com", "10203040");

        // PRODUCT
        ProductPage productPage = new ProductPage(driver.get());
        productPage.clickproduct();
        productPage.clickaddcart();
        productPage.clickcart();

        // ASSERT
        MycartPage myCartPage = new MycartPage(driver.get());
        Assert.assertTrue(
                myCartPage.isTitlePresent(),
                "Product is not displayed in cart"
        );
    }
}
