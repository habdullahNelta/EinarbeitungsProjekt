package Testcase;


import HelfMethoden.ExceptionInput;
import HelfMethoden.TestNGListener;
import Pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners (TestNGListener.class)
public class LoginTest extends TestBase {

    LoginPage Login;


    @Test(testName = "Login")
    public void LoginTest1() throws ExceptionInput, InterruptedException {
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
