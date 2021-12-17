package Testcase;


import HelfMethoden.ExceptionExistence;
import HelfMethoden.ExceptionInput;
import HelfMethoden.TestNGListener;
import Pages.LoginPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//Login Test
@Listeners (TestNGListener.class)
public class LoginTest extends TestBase {

    LoginPage Login;

    @Test
    public void LoginTest1() throws ExceptionInput, InterruptedException, ExceptionExistence {
        Login = new LoginPage(driver);
        Login.login();
    }
}
