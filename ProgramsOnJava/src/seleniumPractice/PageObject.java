package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocator;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class PageObject {
//	WebDriver driver;
     public PageObject(WebDriver driver	) {
//    	 this.driver = driver;
//    	 PageFactory.initElements(new AjaxElementLocatorFactory(driver, 20), this);
     }
     WebElement q;
     WebElement btnK; 
//      @FindBy(name="q")
//      private  WebElement searc;
//       By searc = By.name("q");
     public void search(String searchh) {
    	 q.sendKeys(searchh);
    	 btnK.sendKeys(Keys.RETURN);;
     }
}
