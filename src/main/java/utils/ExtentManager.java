package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if(extent == null) {

            ExtentSparkReporter sparkReporter =
                    new ExtentSparkReporter(
                            "reports/ExtentReport.html");

            sparkReporter.config().setDocumentTitle(
                    "Automation Execution Report");

            sparkReporter.config().setReportName(
                    "SauceDemo Framework Report");

            extent = new ExtentReports();

            extent.attachReporter(sparkReporter);

            extent.setSystemInfo(
                    "Framework",
                    "Selenium Java");

            extent.setSystemInfo(
                    "Environment",
                    "DEV");

            extent.setSystemInfo(
                    "Author",
                    "Mallesh Goud");
        }

        return extent;
    }
}