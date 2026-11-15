package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage {

    WebDriver driver;

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    private By cartItem =
            By.xpath("//a/div[text()='Sauce Labs Backpack']");

    private By checkoutButton =
            By.id("checkout");

    public boolean verifyProductInCart() {

        return driver.findElement(cartItem)
                .isDisplayed();
    }

    public void clickCheckout() {

        driver.findElement(checkoutButton)
                .click();
    }
}