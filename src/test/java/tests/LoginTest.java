package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.LoginPage;
import pages.ProductsPage;
import utils.DriverFactory;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.out.println("Before Method Started");
        driver = DriverFactory.initializeDriver();

        driver.get("https://www.saucedemo.com/");

        System.out.println("Application Opened");
    }

    @Test

    public void verifyLoginAndAddProduct() {
        System.out.println("Entering username and password");
        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "standard_user",
                "secret_sauce");
        System.out.println("Login is success and user is navigated to products page");
        ProductsPage productsPage =
                new ProductsPage(driver);

        Assert.assertTrue(
                productsPage.isProductsPageDisplayed());
        System.out.println("Products page is displayed");
        productsPage.addBackpackToCart();
        System.out.println("Clicked on add to cart button - Backpack is added to cart");
        productsPage.clickShoppingCart();
        System.out.println("Clicked on shopping cart Icon and navigated to cart details page");
    }

    @AfterMethod
    public void tearDown() {
        System.out.println("After Method Started");
        System.out.println("Closing the browser");
        driver.quit();
    }
}