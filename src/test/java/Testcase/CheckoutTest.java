package Testcase;


import HelfMethoden.ExceptionExistence;
import HelfMethoden.ExceptionInput;
import HelfMethoden.TestNGListener;
import Pages.ArtikelKaufenPage;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.VerifyPreisPage;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGListener.class)
public class CheckoutTest extends TestBase {
    ArtikelKaufenPage Books;
    LoginPage Login;
    CheckoutPage Checkout;
    VerifyPreisPage Preise;


    @BeforeTest
    public void Logintest() throws ExceptionInput, InterruptedException, ExceptionExistence {
        Login = new LoginPage(driver);
        Login.login();
    }


    /*@BeforeTest
    public void BeforeTest1() {
        TestNG Obj = new TestNG();
        String TestLoction = System.getProperty("user.dir");
        List<String> suites = new ArrayList<String>();
        suites.add(TestLoction + "\\XMLDate\\ArtikelKaufenTest.xml");
        Obj.setTestSuites(suites);
        Obj.run();
    }*/


    @Test(priority = 1)
    public void AddBook1ToCartTest() throws InterruptedException, ExceptionExistence {
        Books = new ArtikelKaufenPage(driver);
        Books.AddBooksToCartPage();
        Thread.sleep(1000);
    }

    @Test(priority = 2)
    public void AddBook2ToCartTest() throws InterruptedException {
        Books.AddBooks2ToCartPage();
        Thread.sleep(1000);
    }


    @Test(priority = 3)
    public void ShoppingCardClickTest() throws InterruptedException {
        Preise = new VerifyPreisPage(driver);
        Preise.ShoppingCardClickPage();
        Thread.sleep(1000);
        //  Preise.VerifyTolalPreisBook2(10);

    }

    @Test(priority = 4)
    public void PreisBook1() throws InterruptedException, ExceptionInput {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook1();
    }

    @Test(priority = 5)
    public void PreisBook2() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook2(24);

    }

    @Test(priority = 6)
    public void UpdateCartTest() throws InterruptedException, ExceptionExistence {
        Thread.sleep(1000);
        Books.UpdateCartPage();
    }

    @Test(priority = 7)
    public void EstimateShippingTest() throws InterruptedException, ExceptionInput, ExceptionExistence {
        Checkout = new CheckoutPage(driver);
        Checkout.EstimateShippingPage(driver);
    }

    @Test(priority = 8)
    public void BillingAddressTest() throws InterruptedException, ExceptionExistence {
        Checkout.BillingAddressPage();
    }

    @Test(priority = 9)
    public void ShippingAddressTest() throws InterruptedException, ExceptionExistence {
        Checkout.ShippingAddressPage();
    }

    @Test(priority = 10)
    public void ShippingMethodTest() throws InterruptedException, ExceptionExistence {
        Checkout.ShippingMethodPage();
    }

    @Test(priority = 11)
    public void PaymentMethodTest() throws InterruptedException, ExceptionExistence {
        Checkout.PaymentMethodPage();
    }

    @Test(priority = 12)
    public void PaymentInformationTest() throws InterruptedException {
        Checkout.PaymentInformationPage();
    }

    @Test(priority = 13)
    public void ConfirmOrderTest() throws InterruptedException {
        Checkout.ConfirmOrderPage();
    }

    @Test(priority = 14)
    public void successOrderTest() throws InterruptedException {
        Checkout.successOrderPage();
    }

    @Test(priority = 15)
    public void OrderEndTest() throws InterruptedException {
        Checkout.OrderEndPage();
    }
}
