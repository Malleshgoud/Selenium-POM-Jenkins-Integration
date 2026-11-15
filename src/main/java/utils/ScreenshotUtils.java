package utils;

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

    public static void captureScreenshot(
            WebDriver driver,
            String testName) {
        String timeStamp =
                new SimpleDateFormat(
                        "yyyyMMdd_HHmmss")
                        .format(new Date());
        File source =
                ((TakesScreenshot) driver)
                        .getScreenshotAs(
                                OutputType.FILE);

        File destination =
                new File("screenshots/"
                        + testName + "_"+timeStamp+".png");

        destination.getParentFile().mkdirs();

        try {

            Files.copy(
                    source.toPath(),
                    destination.toPath(),
                    StandardCopyOption.REPLACE_EXISTING);

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
    public static void deleteOldScreenshots() {

        File folder = new File("screenshots");

        if (folder.exists() && folder.isDirectory()) {

            File[] files = folder.listFiles();

            if (files != null) {

                for (File file : files) {

                    if (file.isFile()) {
                        file.delete();
                    }
                }
            }
        }

        System.out.println("Old Screenshots Deleted");
    }
}