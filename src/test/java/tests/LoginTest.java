package tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.*;

import pages.HomePage;
import pages.LoginPage;
import utils.DriverFactory;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {
        System.out.println("Before Method Started");
        driver = DriverFactory.initializeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        System.out.println("Application Opened");
    }

    @Test
    public void loginLogoutTest() {

        System.out.println("Test Started");

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                "tomsmith",
                "SuperSecretPassword!");

        Assert.assertTrue(driver.getCurrentUrl()
                .contains("secure"));

        System.out.println("Login Completed");

        HomePage homePage = new HomePage(driver);

        System.out.println("Entered Home Page");

        homePage.logout();

        System.out.println("Logout Completed");

        Assert.assertTrue(driver.getCurrentUrl()
                .contains("login"));
        System.out.println("Navigated to Login page after successfull logout");
    }

    @AfterMethod
    public void tearDown() {

        driver.quit();
    }
}