package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.HashMap;
import java.util.Map;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initializeDriver() {

//        System.out.println("Launching Browser...");
//
//        WebDriverManager.chromedriver().setup();
//
//        driver = new ChromeDriver();
//
//        driver.manage().window().maximize();
//
//        System.out.println("Browser Opened Successfully");
//
//        return driver;

//        ChromeOptions options = new ChromeOptions();
//
//        options.addArguments("--disable-save-password-bubble");
//
//        options.setExperimentalOption(
//                "excludeSwitches",
//                new String[]{"enable-automation"});
//
//        options.setExperimentalOption(
//                "prefs",
//                java.util.Map.of(
//                        "credentials_enable_service", false,
//                        "profile.password_manager_enabled", false));
//
//        System.out.println("Launching Browser...");
//        driver = new ChromeDriver(options);

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--disable-notifications");
        options.addArguments("--disable-save-password-bubble");
        options.addArguments("--disable-popup-blocking");

        Map<String, Object> prefs = new HashMap<>();

        prefs.put("credentials_enable_service", false);
        prefs.put("profile.password_manager_enabled", false);

        options.setExperimentalOption("prefs", prefs);
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        return driver;
    }
}