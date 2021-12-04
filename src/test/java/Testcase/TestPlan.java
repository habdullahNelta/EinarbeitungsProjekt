package Testcase;


import Pages.*;
import org.testng.annotations.Test;

/**
 * @author Hasan Abdullah
 */
public class TestPlan extends TestBase {
    private RegisterPage Register;
    private LoginPage Login;
    private ArtikelKaufen Books;
    private VerifyPreisPage Preise;
    private CheckoutPage Checkout;





    @Test(priority = 1)
    public void RegisterTest() {
        Register = new RegisterPage(driver);
        Register.Register();
    }


    @Test(priority = 2)
    public void LoginTest() {
        Login = new LoginPage(driver);
        Login.login();

    }

    @Test(priority = 3)
    public void AddBook1ToCartTest() throws InterruptedException {
        Books = new ArtikelKaufen(driver);
        Books.AddBooksToCartPage();
       // Thread.sleep(1000);
    }

    @Test(priority = 4)
    public void AddBook2ToCartTest() throws InterruptedException {
        Books.AddBooks2ToCartPage();
       // Thread.sleep(1000);
    }

    @Test(priority = 5)
    public void ShoppingCardClickTest() throws InterruptedException {
        Preise = new VerifyPreisPage(driver);
        Preise.ShoppingCardClickPage();
      //  Thread.sleep(500);
    }
    @Test(priority = 6)
    public void VerifyPreisBook1() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook1();
    }

    @Test(priority = 7)
    public void VerifyPreisBook2() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook2(24);

    }
    @Test(priority = 8)
    public void UpdateCartTest() throws InterruptedException {
        Books.UpdateCartPage();
    }


    @Test(priority = 9)
    public void EstimateShippingTest() throws InterruptedException {
        Checkout = new CheckoutPage(driver);
        Checkout.EstimateShippingPage(driver);
    }

    @Test (priority = 10)
    public void BillingAddressTest() throws InterruptedException {
        Checkout.BillingAddressPage();
    }

    @Test (priority = 11)
    public void ShippingAddressTest() throws InterruptedException {
        Checkout.ShippingAddressPage();
    }

    @Test (priority = 12)
    public void ShippingMethodTest() throws InterruptedException {
        Checkout.ShippingMethodPage();
    }



}
