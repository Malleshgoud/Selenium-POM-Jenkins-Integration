package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LogoutPage {

    WebDriver driver;

    public LogoutPage(WebDriver driver) {
        this.driver = driver;
    }

    private By menuButton =
            By.id("react-burger-menu-btn");

    private By logoutButton =
            By.id("logout_sidebar_link");

    public void logout() {

        driver.findElement(menuButton).click();

        WebDriverWait wait =
                new WebDriverWait(driver,
                        Duration.ofSeconds(10));

        wait.until(
                ExpectedConditions
                        .elementToBeClickable(
                                logoutButton));

        driver.findElement(logoutButton).click();
    }
}