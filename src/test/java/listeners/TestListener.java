package listeners;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;
import tests.BaseTest;

public class TestListener implements ITestListener {

    @Override
    public void onTestStart(
            ITestResult result) {

        System.out.println(
                "STARTED : "
                        + result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        System.out.println(
                "PASSED : "
                        + result.getName());
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        ScreenshotUtils.captureScreenshot(
                BaseTest.getDriver(),
                result.getName());

        System.out.println(
                "Screenshot Captured");
    }
}