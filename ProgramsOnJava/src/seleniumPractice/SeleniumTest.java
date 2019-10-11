package seleniumPractice;

import java.util.Stack;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SeleniumTest {
 @Test
 public void ts_01() {
	 WebDriver driver;
	 driver = new ChromeDriver();
	 driver.findElement(By.id(""));
	 Stack st = new Stack();
	 WebElement el =driver.findElement(By.xpath(""));
	 int y = el.getSize().getHeight();
	 Actions as = new Actions(driver);
	 String k = Keys.chord();
	 throw new ArithmeticException();
 }
}
