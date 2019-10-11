package seleniumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicAuth {
	WebDriver dr ;
	static WebElement el ;
  @Test
  public void tc_01() {
	  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	  dr = new ChromeDriver();
	  dr.get("https://the-internet.herokuapp.com/");
	 el = dr.findElement(By.linkText("Basic Auth"));
	 el.click();
 dr.switchTo().alert().sendKeys("admin"+Keys.TAB+"admin");
 dr.switchTo().alert().accept();
//	  at.sendKeys("admin");
//	  at.sendKeys("admin");
//	  at.accept();
  }
}
