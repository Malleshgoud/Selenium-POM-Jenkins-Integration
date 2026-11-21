package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ReportManager;
import utils.ScreenshotUtils;

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
        ReportManager.pass("Entering checkout information: " + fname + " " + lname + ", " + zip);
        driver.findElement(firstName)
                .sendKeys(fname);

        driver.findElement(lastName)
                .sendKeys(lname);

        driver.findElement(postalCode)
                .sendKeys(zip);
        ReportManager.pass("Entered checkout information successfully");
    }

    public void clickContinue() {

        driver.findElement(continueButton)
                .click();
        ReportManager.pass("Clicked on Continue button");
        ScreenshotUtils.captureAndAttachScreenshot(
                driver,
                "CheckoutPage",
                "Checkout information entered successfully");
    }
}