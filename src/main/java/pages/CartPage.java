package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ReportManager;

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

        boolean status =
                productName.equals("Sauce Labs Backpack");

        if(status) {

            ReportManager.pass(
                    "Product is present in cart : "
                            + productName);
        }
        else {

            ReportManager.fail(
                    "Product is not present in cart");
        }

        return status;
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
        ReportManager.info(
                "Clicked on checkout button");
    }
}