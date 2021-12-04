package Testcase;

import Pages.RegisterPage;
import org.testng.annotations.Test;

public class RegisterTest extends TestBase {

    RegisterPage Register;


    @Test public void RegisterTest() {
        Register = new RegisterPage(driver);
        Register.Register();
    }
}
