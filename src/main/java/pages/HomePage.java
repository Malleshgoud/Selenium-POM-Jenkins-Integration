package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    WebDriver driver;

    By logoutBtn = By.cssSelector(".icon-signout");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void logout() {

        driver.findElement(logoutBtn).click();
    }
}