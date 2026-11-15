package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{


    public CartPage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
    }

    private By cartItem =
            By.className("inventory_item_name");
    private By checkoutButton =
            By.id("checkout");

    public boolean verifyProductInCart() {


        waitUtils.waitForElementVisible(cartItem);

        String productName =
                driver.findElement(cartItem)
                        .getText();

        return productName.equals(
                "Sauce Labs Backpack");
    }

    public void clickCheckout() {
        System.out.println(
                "Checkout button count : "
                        + driver.findElements(
                        By.id("checkout")).size());
        waitUtils.waitForElementClickable(
                checkoutButton);
        driver.findElement(checkoutButton)
                .click();
    }
}