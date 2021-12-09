package Pages;

import HelfMethoden.LoadData;
import HelfMethoden.RandomGenerator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends MainPageBase {

    public static String EmailRegister;
    public static String PasswordRegister=RandomGenerator.RandomNumber(6);
    String Firstname1 = LoadData.userData.getProperty("Firstname");
    String Lastname1 = LoadData.userData.getProperty("Lastname");
    String Email1 = LoadData.userData.getProperty("Email");
    String Password1 = LoadData.userData.getProperty("Password");

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className="ico-register")
    WebElement RegisterMenu ;

    @FindBy(id="gender-male")
    WebElement MaleButton;

    @FindBy(id="gender-female")
    WebElement FemaleButton;

    @FindBy(id="FirstName")
    WebElement FirstName;

    @FindBy(id="LastName")
    WebElement LastName;

    @FindBy(id="Email")
    WebElement Email;

    @FindBy(id="Password")
    WebElement Password;

    @FindBy(id="ConfirmPassword")
    WebElement ConfirmPassword;

    @FindBy(id="register-button")
    WebElement Registerbutton;

    @FindBy(className="result")
    WebElement RegisterisDisplayed;

    @FindBy(className="ico-logout")
    WebElement logout ;

    public void Register()  {
        RegisterMenu.isDisplayed();
        RegisterMenu.isEnabled();
        RegisterMenu.click();

        //Random Generator für Auswahl radio button male oder radio button FemaleButton
        if (RandomGenerator.RandomBoolean()) {
            MaleButton.isDisplayed();
            MaleButton.isEnabled();
            MaleButton.click();
        } else {
            FemaleButton.isDisplayed();
            FemaleButton.isEnabled();
            FemaleButton.click();
        }
        if(Firstname1.equals("")  || Lastname1.equals("")){

            FirstName.sendKeys(RandomGenerator.RandomString(5));
            LastName.sendKeys(RandomGenerator.RandomString(5));
            Email.sendKeys(RandomGenerator.RandomString(5)+
                    "@"+RandomGenerator.RandomString(4)+".de");
            Password.sendKeys(PasswordRegister);
            ConfirmPassword.sendKeys(PasswordRegister);
        }else {
            FirstName.sendKeys(Firstname1);
            LastName.sendKeys(Lastname1);
            Email.sendKeys(Email1);
            Password.sendKeys(Password1);
            ConfirmPassword.sendKeys(Password1);
        }

        Registerbutton.click();
        RegisterisDisplayed.isDisplayed();
        RegisterisDisplayed.isEnabled();
      /* if(RegisterisDisplayed.isDisplayed()&&RegisterisDisplayed.isEnabled()) {
           System.out.println("Register ist verified");
       }*/
       logout.isDisplayed();
       logout.isEnabled();
        logout.click();
    }
}
