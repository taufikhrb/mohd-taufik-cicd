package linstener;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentDemo {

    public static void main(String[] args) {
        // Step 1: Initialize report
        ExtentSparkReporter spark = new ExtentSparkReporter("target/ExtentReport.html");
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(spark);

        // Step 2: Create a test case
        ExtentTest test = extent.createTest("Login Test", "Tests login functionality");

        // Step 3: Log steps
        test.info("Launch browser");
        test.info("Enter username and password");
        test.pass("Login successful");

        // Step 4: Generate report
        extent.flush();
    }
}
