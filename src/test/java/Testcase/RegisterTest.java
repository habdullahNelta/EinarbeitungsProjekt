package Testcase;

import HelfMethoden.TestNGListener;
import Pages.RegisterPage;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class RegisterTest extends TestBase {

    RegisterPage Register;


    @Test public void RegisterTest() {
        Register = new RegisterPage(driver);
        Register.Register();
    }
}
