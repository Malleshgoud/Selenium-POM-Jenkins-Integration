package listeners;

import com.aventstack.extentreports.*;
import org.testng.ITestListener;
import org.testng.ITestResult;
import tests.BaseTest;
import utils.ExtentManager;
import utils.ScreenshotUtils;
import com.aventstack.extentreports.MediaEntityBuilder;

public class TestListener implements ITestListener {

    private static ExtentReports extent =
            ExtentManager.getInstance();

    private static ExtentTest test;

    @Override
    public void onTestStart(
            ITestResult result) {

        test = extent.createTest(
                result.getMethod()
                        .getMethodName());

        System.out.println(
                "STARTED : "
                        + result.getName());
    }

    @Override
    public void onTestSuccess(
            ITestResult result) {

        test.pass(
                "Test Passed");

        System.out.println(
                "PASSED : "
                        + result.getName());
    }

    @Override
    public void onTestFailure(
            ITestResult result) {

        String screenshotPath =
                ScreenshotUtils.captureScreenshot(
                        BaseTest.getDriver(),
                        result.getName());

        test.fail(
                result.getThrowable());

        try {

            test.fail(
                    "Screenshot",
                    MediaEntityBuilder
                            .createScreenCaptureFromPath(
                                    screenshotPath)
                            .build());

        } catch (Exception e) {

            e.printStackTrace();
        }

        System.out.println(
                "FAILED : "
                        + result.getName());
    }

    @Override
    public void onFinish(
            org.testng.ITestContext context) {

        extent.flush();
    }
}