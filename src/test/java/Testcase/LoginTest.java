package Testcase;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import Pages.LoginPage;

import com.aventstack.extentreports.reporter.configuration.Theme;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage Login;



    @Test(testName = "Login")
    public void LoginTest() {
        Login = new LoginPage(driver);
        Login.login();


    }

/*
// public ExtentHtmlReporter reporter;
   // public ExtentReports extent;
   // public ExtentTest extentTest;
    @BeforeClass
    public void BeforeClass() {

        ExtentHtmlReporter reporter = new ExtentHtmlReporter("./Reports/learn_automation1.html");
        reporter.config().setEncoding("utf-8");
        reporter.config().setDocumentTitle("TestReport");
        reporter.config().setReportName("Test result");
        reporter.config().setTheme(Theme.STANDARD);

        // Create object of ExtentReports class- This is main class which will create report
        ExtentReports extent = new ExtentReports();
        extent.setSystemInfo("organization", "test set system");
        extent.setSystemInfo("browser", "chrome");
        extent.attachReporter(reporter);
        // attach the reporter which we created in Step 1


    }

    @Test
    public void LoginTest() {
        Login = new LoginPage(driver);
        Login.login();
        ExtentTest extentTest = extent.createTest("login PASS");
        extentTest.log(Status.PASS, "Login verified");

        //extentTest.log(Status.FAIL, "");
        // extentTest.fail("Failed because of some issues");


    }

    @Test
    public void LoginTestFailed() {
        Login = new LoginPage(driver);
        Login.login();

        ExtentTest extentTest = extent.createTest("login FAIL");
        extentTest.log(Status.FAIL, "Failed because of some issues");
        Assert.fail("Execuption Failed Test Method");
    }

    @Test
    public void LoginTestSkip() {
        Login = new LoginPage(driver);
        Login.login();

        ExtentTest extentTest = extent.createTest("login SKIP");
        extentTest.log(Status.SKIP, "");
        extentTest.fail("SKIP because of some issues");
        throw new SkipException("Execuption SKIPed Test Method");

    }

    @AfterClass
    public void afterClass() {
        extent.flush();

    }*/
}
