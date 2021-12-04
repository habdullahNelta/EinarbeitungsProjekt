package Pages;

import HelfMethoden.LoadData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class CheckoutPage extends MainPageBase {

    private String Country = LoadData.userData.getProperty("Country");
    private String StateProvince = LoadData.userData.getProperty("StateProvince");
    private String ZipPostalCode = LoadData.userData.getProperty("ZipPostalCode");

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

    public void EstimateShippingPage(WebDriver driver) throws InterruptedException {

        Thread.sleep(500);
        Select CountryMenu = new Select(driver.findElement(By.id("CountryId")));
        CountryMenu.selectByVisibleText(Country);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        Select StateProvince1 = new Select(driver.findElement(By.id("StateProvinceId")));
        Thread.sleep(500);
        System.out.println(StateProvince1.getFirstSelectedOption());
        StateProvince1.selectByVisibleText(StateProvince);
        /* if (StateProvince1.hashCode(1)) {  //to-do----
           StateProvince1.selectByVisibleText(StateProvince);
            System.out.println("Other (Non US)");
        }*/
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

}
