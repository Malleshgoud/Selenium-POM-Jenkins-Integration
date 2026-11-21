package utils;

import com.aventstack.extentreports.MediaEntityBuilder;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ScreenshotUtils {

    public static String captureScreenshot(
            WebDriver driver,
            String stepName) {

        String timeStamp =
                new SimpleDateFormat(
                        "yyyyMMdd_HHmmss")
                        .format(new Date());

        String fileName =
                stepName + "_" +
                        timeStamp + ".png";

        String filePath =
                "reports/screenshots/"
                        + fileName;

        File source =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(
                                OutputType.FILE);

        File destination =
                new File(filePath);

        destination.getParentFile().mkdirs();

        try {

            Files.copy(
                    source.toPath(),
                    destination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {

            e.printStackTrace();
        }


        return "screenshots/" + fileName;
    }

    public static void captureAndAttachScreenshot(
            WebDriver driver,
            String stepName,
            String message) {

        try {

            String screenshotPath =
                    captureScreenshot(
                            driver,
                            stepName);

            ExtentTestManager
                    .getTest()
                    .pass(
                            message,
                            MediaEntityBuilder
                                    .createScreenCaptureFromPath(
                                            screenshotPath)
                                    .build());
            System.out.println("Screenshot Path is=> " + screenshotPath);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}