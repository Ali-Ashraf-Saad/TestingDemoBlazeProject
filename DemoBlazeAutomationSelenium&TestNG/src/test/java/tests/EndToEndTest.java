package tests;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.*;

public class EndToEndTest extends BaseTest {

    @Test
    public void testFlow() throws InterruptedException {

        HomePage home = new HomePage(driver);
        LoginPage login = new LoginPage(driver);
        ProductPage product = new ProductPage(driver);
        CartPage cart = new CartPage(driver);

        home.clickLogin();
        Thread.sleep(2000);

        login.login("AliAshrafSaad", "Ali");
        Thread.sleep(3000);

        home.openProduct();
        Thread.sleep(2000);

        product.addToCart();
        Thread.sleep(2000);

        cart.openCart();
        Thread.sleep(2000);
    }
}