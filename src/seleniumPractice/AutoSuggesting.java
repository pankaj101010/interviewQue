package seleniumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AutoSuggesting {
  @Test
  public void test_01() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.google.com");
	  driver.findElement(By.name("q")).sendKeys("selenium");
	  List <WebElement> lt = driver.findElements(By.xpath("//div[@class='UUbT9']"));
//	  WebDriverWait wait = new WebDriverWait(driver, 300);
//	  wait.until(ExpectedConditions.visibilityOfAllElements(lt));
	  Thread.sleep(3000);
	  for (WebElement a : lt) {
		   System.out.println(a.getText());
		   if (a.getText().equalsIgnoreCase("selenium guru99")) ;
			a.click();
			Thread.sleep(3000);
			break;	
	}
  }
}
