package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WaitUtils;

public class LogoutPage {

    WebDriver driver;
    WaitUtils waitUtils;

    public LogoutPage(WebDriver driver) {

        this.driver = driver;
        waitUtils = new WaitUtils(driver);
    }

    private final By menuButton =
            By.id("react-burger-menu-btn");

    private final By logoutButton =
            By.id("logout_sidebar_link");

    public void logout() {

        waitUtils.waitForElementClickable(menuButton);

        driver.findElement(menuButton).click();

        waitUtils.waitForElementClickable(logoutButton);

        driver.findElement(logoutButton).click();
    }
}