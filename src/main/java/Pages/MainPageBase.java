package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MainPageBase {

     protected WebDriver driver;

    public MainPageBase(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }
}
