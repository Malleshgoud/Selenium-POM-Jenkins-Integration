package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import utils.ReportManager;
import utils.ScreenshotUtils;

public class ProductsPage extends BasePage {
    public ProductsPage(WebDriver driver)
    {
        super(driver);
    }
    private By pageTitle =
            By.xpath("//span[text()='Products']");

    private By addBackPackButton =
            By.id("add-to-cart-sauce-labs-backpack");

    private By shoppingCart =
            By.className("shopping_cart_link");

    public boolean isProductsPageDisplayed() {

        ReportManager.pass("Verifying if Products page is displayed");
        return driver.findElement(pageTitle).isDisplayed();

    }

    public void addBackpackToCart() {
        ReportManager.pass("Clicking on Add to Cart button for backpack");
        waitUtils.waitForElementClickable(
                addBackPackButton);

        JavascriptExecutor js =
                (JavascriptExecutor) driver;

        js.executeScript(
                "arguments[0].click();",
        driver.findElement(addBackPackButton));
        ReportManager.pass("Clicked on Add to Cart button for backpack");
    }

    public void clickShoppingCart() {

        ReportManager.pass("Clicking on Shopping Cart link");
            waitUtils.waitForElementClickable(
                    shoppingCart);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].click();",
                    driver.findElement(shoppingCart));
        ReportManager.pass("Clicked on Shopping Cart link");
            waitUtils.waitForUrlContains(
                    "cart.html");
        ReportManager.pass("Waiting for URL to contain 'cart.html'");
        System.out.println("Current URL: " + driver.getCurrentUrl());
        ScreenshotUtils.captureAndAttachScreenshot(
                driver,
                "ProductsPage",
                "Products page displayed successfully");

    }

}