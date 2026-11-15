package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;
import utils.WaitUtils;

public class LogoutPage {

    WebDriver driver;
    WaitUtils waitUtils = new WaitUtils(driver);

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By menuButton =
            By.id("react-burger-menu-btn");

    private By logoutButton =
            By.id("logout_sidebar_link");

    public void logout() {

        driver.findElement(menuButton).click();
        waitUtils.waitForElementVisible((WebElement) logoutButton);
        driver.findElement(logoutButton).click();
    }
}