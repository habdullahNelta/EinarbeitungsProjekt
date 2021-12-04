package Pages;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class ArtikelKaufen extends MainPageBase {
    public ArtikelKaufen(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[2]/ul[1]/li[1]/a")
    WebElement openBooksMenu ;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[1]/div/div[2]/div[3]/div[2]")
    WebElement AddBook1ToCart ;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div[2]/div[2]/div[2]/div[3]/div[3]/div/div[2]/div[3]/div[2]/input")
    WebElement AddBook2ToCart ;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[1]/td[5]/input")
    WebElement Book1Doppelt ;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/div[1]/div/input[1]")
    WebElement UpdateCartClick ;

    @FindBy(className = "content")
    WebElement AddBookToCartisDisplayed ;

    @FindBy(xpath = "/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div/form/table/tbody/tr[2]/td[1]/input")
    WebElement Book3DDelete ;



    public void AddBooksToCartPage () throws InterruptedException {
        openBooksMenu.click();
        AddBook1ToCart.click();
        Thread.sleep(1000);
        if(AddBookToCartisDisplayed.isDisplayed()) {
            System.out.println("Add Book1 To Cart ist verified");
        }
    }
    public void AddBooks2ToCartPage () throws InterruptedException {
        AddBook2ToCart.click();
        Thread.sleep(1000);
        if(AddBookToCartisDisplayed.isDisplayed()) {
            System.out.println("Add Book2 To Cart ist verified");
        }
    }

    public void UpdateCartPage  () throws InterruptedException {

      //  ShoppingCard.click();
        Thread.sleep(200);
        Book1Doppelt.clear();
        Book1Doppelt.sendKeys("2");
        Thread.sleep(200);
        Book3DDelete.isDisplayed();
        Book3DDelete.click();
        UpdateCartClick.click();
       // Thread.sleep(1000);


    }

}
