package Pages;

import HelfMethoden.ExceptionExistence;
import HelfMethoden.ExceptionInput;
import HelfMethoden.LoadData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static HelfMethoden.ElementTest.ElementTestClick;
import static HelfMethoden.ElementTest.ObjectIsEmpty;


///für Login schreibt mann alle mögliche bottun oder felder oder .....
//mithilfe von xpath oder id oder class......
public class LoginPage extends MainPage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    String Email = LoadData.userData.getProperty("Email");
    String Password = LoadData.userData.getProperty("Password");

    //Login Click
    @FindBy(className = "ico-login")////////////////////////////////
    WebElement login;

    //Email-Login Eingabe
    @FindBy(id = "Email")
    WebElement EmailLogin;

    @FindBy(id = "Password")
    WebElement PassWordLogin;

    @FindBy(className = "login-button")
    WebElement loginButton;

    @FindBy(xpath = " /html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")
    WebElement loginisDisplayed;

    public void login() throws ExceptionInput, InterruptedException, ExceptionExistence {
     //   ElementDisplayedEnabled Element=new ElementDisplayedEnabled ();

        ElementTestClick(login,"login");


        EmailLogin.isDisplayed();
        ObjectIsEmpty(Email,"Email");

        EmailLogin.sendKeys(Email);
        PassWordLogin.isDisplayed();

        ObjectIsEmpty(Password,"Password");
        PassWordLogin.sendKeys(Password);

        ElementTestClick(loginButton,"loginButton");

        loginisDisplayed.isDisplayed();
        loginisDisplayed.isEnabled();
        Thread.sleep(1000);
    }
}
