package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage extends BasePage{



    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    private By firstName =
            By.id("first-name");

    private By lastName =
            By.id("last-name");

    private By postalCode =
            By.id("postal-code");

    private By continueButton =
            By.id("continue");

    public void enterCheckoutInfo(
            String fname,
            String lname,
            String zip) {

        driver.findElement(firstName)
                .sendKeys(fname);

        driver.findElement(lastName)
                .sendKeys(lname);

        driver.findElement(postalCode)
                .sendKeys(zip);
    }

    public void clickContinue() {

        driver.findElement(continueButton)
                .click();
    }
}