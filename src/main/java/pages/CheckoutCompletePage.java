package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

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
    }

    public boolean verifyOrderSuccess() {

        return driver.findElement(successMessage)
                .isDisplayed();
    }
}