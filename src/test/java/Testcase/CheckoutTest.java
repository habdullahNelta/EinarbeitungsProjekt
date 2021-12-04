package Testcase;

import HelfMethoden.LoadData;
import Pages.ArtikelKaufen;
import Pages.CheckoutPage;
import Pages.LoginPage;
import Pages.VerifyPreisPage;
import org.junit.jupiter.api.BeforeAll;
import org.testng.TestNG;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class CheckoutTest extends TestBase {
    ArtikelKaufen Books;
    LoginPage Login;
     CheckoutPage Checkout;
    VerifyPreisPage Preise;


    @BeforeTest
    public void Logintest() {
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
    public void AddBook1ToCartTest() throws InterruptedException {
        Books = new ArtikelKaufen(driver);
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
    public void VerifyPreisBook1() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook1();
    }

    @Test(priority = 5)
    public void VerifyPreisBook2() throws InterruptedException {
        Thread.sleep(200);
        Preise.VerifyTolalPreisBook2(24);

    }
    @Test(priority = 6)
    public void UpdateCartTest() throws InterruptedException {
        Thread.sleep(1000);
        Books.UpdateCartPage();
    }

    @Test(priority = 7)
    public void EstimateShippingTest() throws InterruptedException {
        Checkout = new CheckoutPage(driver);
        Checkout.EstimateShippingPage(driver);
    }

    @Test (priority = 8)
    public void BillingAddressTest() throws InterruptedException {
        Checkout.BillingAddressPage();
    }

    @Test (priority = 9)
    public void ShippingAddressTest() throws InterruptedException {
        Checkout.ShippingAddressPage();
    }

    @Test (priority = 10)
    public void ShippingMethodTest() throws InterruptedException {
        Checkout.ShippingMethodPage();
    }

}
