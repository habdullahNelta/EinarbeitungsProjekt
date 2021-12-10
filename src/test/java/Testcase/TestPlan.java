package Testcase;


import HelfMethoden.TestNGListener;
import Pages.*;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

/**
 * @author Hasan Abdullah
 */
@Listeners(TestNGListener.class)
public class TestPlan extends TestBase {
     RegisterPage Register;
     LoginPage Login;
     ArtikelKaufen Books;
     VerifyPreisPage Preise;
     CheckoutPage Checkout;


    @Test(priority = 1,groups = "Register")
    public void RegisterTest() {
        Register = new RegisterPage(driver);
        Register.Register();
    }

    @Test(priority = 2,groups = "Login")
    public void LoginTest() {
        Login = new LoginPage(driver);
        Login.login();
    }

    @Test(priority = 3,groups ="Artikelkaufen" )
    public void AddBook1ToCartTest() throws InterruptedException {
        Books = new ArtikelKaufen(driver);
        Books.AddBooksToCartPage();
       // Thread.sleep(1000);
    }

    @Test(priority = 4,groups = "Artikelkaufen")
    public void AddBook2ToCartTest() throws InterruptedException {
        Books.AddBooks2ToCartPage();
       // Thread.sleep(1000);
    }

    @Test(priority = 5,groups = "Artikelkaufen")
    public void ShoppingCardClickTest()  {
        Preise = new VerifyPreisPage(driver);
        Preise.ShoppingCardClickPage();
      //  Thread.sleep(500);
    }
    @Test(priority = 6,groups = "Artikelkaufen")
    public void VerifyPreisBook1() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook1();
    }

    @Test(priority = 7,groups = "Artikelkaufen")
    public void VerifyPreisBook2() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook2(24);

    }
    @Test(priority = 8,groups = "Artikelkaufen")
    public void UpdateCartTest() throws InterruptedException {
        Books.UpdateCartPage();
    }

    @Test(priority = 9,groups = "Checkout")
    public void EstimateShippingTest() throws InterruptedException {
        Checkout = new CheckoutPage(driver);
        Checkout.EstimateShippingPage(driver);
    }

    @Test (priority = 10,groups = "Checkout")
    public void BillingAddressTest() throws InterruptedException {
        Checkout.BillingAddressPage();
    }

    @Test (priority = 11,groups = "Checkout")
    public void ShippingAddressTest() throws InterruptedException {
        Checkout.ShippingAddressPage();
    }

    @Test (priority = 12,groups = "Checkout")
    public void ShippingMethodTest() throws InterruptedException {
        Checkout.ShippingMethodPage();
    }

    @Test(priority = 13)
    public void PaymentMethodTest() throws InterruptedException {
        Checkout.PaymentMethodPage();
    }

    @Test (priority = 14,groups = "Checkout")
    public void PaymentInformationTest() throws InterruptedException {
        Checkout.PaymentInformationPage();
    }

    @Test (priority = 15,groups = "Checkout")
    public void ConfirmOrderTest() throws InterruptedException {
        Checkout.ConfirmOrderPage();
    }

    @Test (priority = 16,groups = "Checkout")
    public void successOrderTest() throws InterruptedException {
        Checkout.successOrderPage();
    }

    @Test (priority = 17,groups = "Checkout")
    public void OrderEndTest() throws InterruptedException {
        Checkout.OrderEndPage();
    }
}
