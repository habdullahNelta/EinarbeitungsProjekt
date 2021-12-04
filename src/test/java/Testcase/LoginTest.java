package Testcase;


import HelfMethoden.LoadData;

import Pages.LoginPage;
import Pages.MainPageBase;
import Pages.RegisterPage;
import io.cucumber.testng.CucumberOptions;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage Login;


    @Test public void LoginTest() {
        Login =new LoginPage(driver);
        Login.login();
    }


}
