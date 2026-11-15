package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{


    public CartPage(WebDriver driver) {
        super(driver);
        //this.driver = driver;
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