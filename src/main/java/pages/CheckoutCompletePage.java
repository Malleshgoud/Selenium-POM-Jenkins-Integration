package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ReportManager;
import utils.ScreenshotUtils;

public class CheckoutCompletePage extends BasePage {


    public CheckoutCompletePage(WebDriver driver) {
        super(driver);
    }

    private By finishButton =
            By.id("finish");

    private By successMessage =
            By.xpath("//h2[contains(text(),'Thank you')]");

    public void clickFinish() {

        driver.findElement(finishButton)
                .click();
        ReportManager.pass("Clicked on Finish button");
    }

    public boolean verifyOrderSuccess() {

        String message =
                driver.findElement(successMessage)
                        .getText();

        boolean status =
                message.contains(
                        "Thank you for your order!");

        if (status) {

            ReportManager.pass(
                    "Order success message displayed : "
                            + message);
        }
        else {

            ReportManager.fail(
                    "Order success message not displayed");
        }
        ScreenshotUtils.captureAndAttachScreenshot(
                driver,
                "CheckoutCompletePage",
                "Order success message verification");
        return status;

    }
}