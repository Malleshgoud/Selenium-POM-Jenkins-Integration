package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{



    By username = By.id("user-name");
    By password = By.id("password");
    By loginBtn = By.id("login-button");

    public LoginPage(WebDriver driver)
    {
        super(driver);
        //commented out the below line as we are calling the super class constructor to initialize the driver
//this.driver = driver;
    }

    public void login(String user, String pass) {

        driver.findElement(username).sendKeys(user);

        driver.findElement(password).sendKeys(pass);

        driver.findElement(loginBtn).click();
    }
}