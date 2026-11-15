package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

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

        return driver.findElement(pageTitle).isDisplayed();
    }

    public void addBackpackToCart() {

        driver.findElement(addBackPackButton).click();
    }

    public void clickShoppingCart() {



            waitUtils.waitForElementClickable(
                    shoppingCart);

            JavascriptExecutor js =
                    (JavascriptExecutor) driver;

            js.executeScript(
                    "arguments[0].click();",
                    driver.findElement(shoppingCart));

            waitUtils.waitForUrlContains(
                    "cart.html");

    }

}