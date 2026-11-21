package pages;

import org.openqa.selenium.WebDriver;
import utils.JavaScriptUtils;
import utils.WaitUtils;

public class BasePage {

    protected JavaScriptUtils javaScriptUtils;

    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage(WebDriver driver) {

        this.driver = driver;
        this.waitUtils = new WaitUtils(driver);

        this.javaScriptUtils =
                new JavaScriptUtils(driver);
    }
}