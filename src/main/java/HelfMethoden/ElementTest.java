package HelfMethoden;

import org.openqa.selenium.WebElement;

public class ElementTest {

  public static void ElementTestClick(WebElement Element,String ElementName) throws ExceptionExistence {

      if (Element.isEnabled()&&Element.isDisplayed()){
          Element.click();
      }else {
          System.out.println("Fehler! '"+ElementName+"' ist  nicht Displayed oder nicht Enabled!");
          throw new ExceptionExistence();
      }
  }

    public static void ObjectIsEmpty(String Input, String StringName) throws ExceptionInput {
        if (Input.isEmpty()){
            System.out.println("Fehler! Bitte '"+StringName+"' in TestData Eingeben");
            throw new ExceptionInput();
        }
    }
}
