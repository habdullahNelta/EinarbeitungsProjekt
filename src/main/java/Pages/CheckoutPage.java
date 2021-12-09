package Pages;

import HelfMethoden.LoadData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;

import org.openqa.selenium.support.ui.Select;

import java.time.Duration;


public class CheckoutPage extends MainPageBase {

    private final String Country = LoadData.userData.getProperty("Country");
    private final String StateProvince = LoadData.userData.getProperty("StateProvince");
    private final String ZipPostalCode = LoadData.userData.getProperty("ZipPostalCode");

    public CheckoutPage(WebDriver driver) {
        super(driver);

    }

    //Select CountryMenu = new Select(driver.findElement(By.id("CountryId")));
    //@FindBy(id = "CountryId")
    //Select CountryMenu;


    @FindBy(id = "ZipPostalCode")
    WebElement ZipPostalCode1;

    @FindBy(id = "termsofservice")
    WebElement Agree;

    @FindBy(id = "checkout")
    WebElement CheckoutButton;

    @FindBy(xpath = "//*[@id=\"billing-buttons-container\"]/input")
    WebElement BillingAddressButton;

    @FindBy(xpath = "//*[@id=\"shipping-buttons-container\"]/input")
    WebElement ShippingAddressButton;

    @FindBy(xpath = "//*[@id=\"shipping-method-buttons-container\"]/input")
    WebElement ShippingMethodButton;

    @FindBy(xpath = "//*[@id=\"payment-method-buttons-container\"]/input")
    WebElement PaymentMethodButton;

    @FindBy(xpath = "//*[@id=\"payment-info-buttons-container\"]/input")
    WebElement PaymentInformationButton;

    @FindBy(xpath = "//*[@id=\"checkout-payment-info-load\"]/div/div/div[1]/table/tbody/tr/td/p")
    WebElement PaymentInformation;

    @FindBy(xpath = "//*[@id=\"confirm-order-buttons-container\"]/input")
    WebElement ConfirmOrderButton;

    @FindBy(xpath = " /html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[1]/strong")
    WebElement successOrderText;

    @FindBy(xpath = " /html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/div[2]/input")
    WebElement OrderEnd;


    public void EstimateShippingPage(WebDriver driver) throws InterruptedException {
        CheckoutButton.isDisplayed();
        CheckoutButton.isEnabled();

        Thread.sleep(500);
        Select CountryMenu = new Select(driver.findElement(By.id("CountryId")));
        CountryMenu.selectByVisibleText(Country);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Select StateProvince1 = new Select(driver.findElement(By.id("StateProvinceId")));
        Thread.sleep(500);
        System.out.println(StateProvince1.getFirstSelectedOption());
        StateProvince1.selectByVisibleText(StateProvince);
       // Thread.sleep(500);
        ZipPostalCode1.clear();
        ZipPostalCode1.sendKeys(ZipPostalCode);
        //Thread.sleep(500);
        Agree.click();
       // Thread.sleep(500);
        CheckoutButton.click();

        System.out.println("Estimate Shipping ist verified");
    }

    public void BillingAddressPage() throws InterruptedException {
        Thread.sleep(500);
        BillingAddressButton.isDisplayed();
        BillingAddressButton.isEnabled();
        BillingAddressButton.click();

    }
    public void ShippingAddressPage() throws InterruptedException {
        Thread.sleep(500);
        ShippingAddressButton.isDisplayed();
        ShippingAddressButton.isEnabled();
       ShippingAddressButton.click();

    }

    public void ShippingMethodPage() throws InterruptedException {
        Thread.sleep(500);
        ShippingMethodButton.isDisplayed();
        ShippingMethodButton.isEnabled();
        ShippingMethodButton.click();

    }
    public void PaymentMethodPage() throws InterruptedException {
        Thread.sleep(500);
        PaymentMethodButton.isDisplayed();
        PaymentMethodButton.isEnabled();
        PaymentMethodButton.click();

    }

    public void PaymentInformationPage() throws InterruptedException {
        Thread.sleep(500);
        PaymentInformation.isDisplayed();
        System.out.println(PaymentInformation.getText());
        PaymentInformationButton.isDisplayed();
        PaymentInformationButton.isEnabled();
        PaymentInformationButton.click();

    }

    public void ConfirmOrderPage() throws InterruptedException {
        Thread.sleep(500);

        ConfirmOrderButton.isDisplayed();
        ConfirmOrderButton.isEnabled();
        ConfirmOrderButton.click();

    }

    public void successOrderPage () throws InterruptedException {
        Thread.sleep(500);
        successOrderText.isDisplayed();
        System.out.println(successOrderText.getText());

    }
    public void OrderEndPage () throws InterruptedException {
        Thread.sleep(500);
        OrderEnd.isDisplayed();
        OrderEnd.click();


    }
}
