package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.*;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ReportManager;
import utils.ScreenshotUtils;

import java.io.FileNotFoundException;

public class LoginTest extends BaseTest{

    @Test
    public void verifyEndToEndPurchase() throws InterruptedException {

        LoginPage loginPage = new LoginPage(driver);
        ProductsPage productsPage = new ProductsPage(driver);
        CartPage cartPage = new CartPage(driver);
        CheckoutPage checkoutPage = new CheckoutPage(driver);
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(driver);
        LogoutPage logoutpage=new LogoutPage(driver);

        ReportManager.info("Starting end-to-end purchase test");
        String username = ConfigReader.getProperty("username");
        String password = ConfigReader.getProperty("password");
        ReportManager.info("Login into Application");
        loginPage.login(
                username, password);

        System.out.println("Login is success and user is navigated to products page");
        Assert.assertTrue(
                productsPage.isProductsPageDisplayed());

        System.out.println("Products page is displayed");
        Thread.sleep(2000); // Added sleep to wait for the page to load completely
        ReportManager.info("Adding backpack to cart");
           productsPage.addBackpackToCart();
        Thread.sleep(2000); // Added sleep to wait for the page to load completely
        ReportManager.info("Navigating to shopping cart");
        System.out.println("Clicked on add to cart button - Backpack is added to cart");
        productsPage.clickShoppingCart();
        Thread.sleep(2000); // Added sleep to wait for the page to load completely

        System.out.println("Clicked on shopping cart Icon and navigated to cart details page");

        System.out.println("Verifying the product is added to cart");

        Assert.assertTrue(cartPage.verifyProductInCart());
        System.out.println("Product is added to cart successfully");
        ReportManager.info("Proceed to Checkout");
        cartPage.clickCheckout();
        Thread.sleep(2000); // Added sleep to wait for the page to load completely

        System.out.println("Clicked on checkout button and navigated to checkout information page");
        checkoutPage.enterCheckoutInfo(
                "Mallesh",
                "Goud",
                "500005");
        System.out.println("Entered checkout information and clicked continue button");
        Thread.sleep(2000); // Added sleep to wait for the page to load completely
        ReportManager.info("Clicking on continue button to proceed to overview page");
        checkoutPage.clickContinue();
        System.out.println("Clicked on continue button and navigated to overview page");
        Thread.sleep(2000); // Added sleep to wait for the page to load completely
        ReportManager.info("Clicking on finish button to complete the order");
        checkoutCompletePage.clickFinish();
        System.out.println("Clicked on finish button and navigated to checkout complete page");
        Assert.assertTrue(
                checkoutCompletePage.verifyOrderSuccess(),
                "Order was not completed successfully");
        System.out.println("Order is placed successfully and user is navigated to checkout complete page");
        ReportManager.info("Clicking on logout button to log out the user");
        logoutpage.logout();
        System.out.println("Clicked on logout button and user is logged out successfully");
    }


}