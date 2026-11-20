package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.ReportManager;

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
        ReportManager.pass("Entered username: " + user);

        driver.findElement(password).sendKeys(pass);
ReportManager.pass("Entered password: " + pass);
        driver.findElement(loginBtn).click();
        ReportManager.pass("Clicked on login button");
    }
}