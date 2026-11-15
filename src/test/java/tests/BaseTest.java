package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import utils.ConfigReader;
import utils.DriverFactory;
import utils.ScreenshotUtils;

public class BaseTest {

    protected static WebDriver driver;

    //present in the BaseTest class to clean the screenshots folder before the test suite starts
//but this is not recommanded real time projects because we may want to keep the screenshots of previous test runs for reference or debugging purposes.
//    @BeforeSuite
//    public void cleanScreenshotsFolder() {
//
//        ScreenshotUtils.deleteOldScreenshots();
//    }

    @BeforeMethod
    public void setup() {
        System.out.println("Browser Type: " + ConfigReader.getProperty("browser"));
        driver = DriverFactory.initializeDriver();
        System.out.println("Browser Launched: " + ConfigReader.getProperty("browser"));
        driver.get(ConfigReader.getProperty("url"));
        System.out.println("Navigated to URL: " + ConfigReader.getProperty("url"));
        System.out.println("Application Launched");
    }
    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            driver.quit();

            System.out.println("Browser Closed");
        }
    }
    public static  WebDriver getDriver() {

        return driver;
    }
}