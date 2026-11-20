package utils;

public class ReportManager {

    public static void info(String message) {

        ExtentTestManager
                .getTest()
                .info(message);
    }

    public static void pass(String message) {

        ExtentTestManager
                .getTest()
                .pass(message);
    }

    public static void fail(String message) {

        ExtentTestManager
                .getTest()
                .fail(message);
    }
}