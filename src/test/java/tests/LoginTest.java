package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.*;
import utils.ConfigReader;
import utils.DriverFactory;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTest{

    @Test
    public void verifyEndToEndPurchase() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        LogoutPage logoutpage=new LogoutPage(driver);

        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        loginPage.login(
                username, password);

        System.out.println("Login is success and user is navigated to products page");

        Assert.assertTrue(
                productsPage.isProductsPageDisplayed());

        System.out.println("Products page is displayed");
        Thread.sleep(2000); // Added sleep to wait for the page to load completely
           productsPage.addBackpackToCart();
        Thread.sleep(2000); // Added sleep to wait for the page to load completely

        System.out.println("Clicked on add to cart button - Backpack is added to cart");
        productsPage.clickShoppingCart();
        Thread.sleep(2000); // Added sleep to wait for the page to load completely

        System.out.println("Clicked on shopping cart Icon and navigated to cart details page");

        System.out.println("Verifying the product is added to cart");
        Assert.assertTrue(cartPage.verifyProductInCart());
        System.out.println("Product is added to cart successfully");
        cartPage.clickCheckout();
        Thread.sleep(2000); // Added sleep to wait for the page to load completely

        System.out.println("Clicked on checkout button and navigated to checkout page");
        checkoutPage.enterCheckoutInfo(
                "Mallesh",
                "Goud",
                "500005");
        System.out.println("Entered checkout information and clicked continue button");
        Thread.sleep(2000); // Added sleep to wait for the page to load completely

        checkoutPage.clickContinue();
        Thread.sleep(2000); // Added sleep to wait for the page to load completely

        System.out.println("Clicked on continue button and navigated to overview page");
        logoutpage.logout();
        System.out.println("Clicked on logout button and user is logged out successfully");
    }


}