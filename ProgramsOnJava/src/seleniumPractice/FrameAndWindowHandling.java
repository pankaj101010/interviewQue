package seleniumPractice;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FrameAndWindowHandling {
	WebDriver driver;

	@Test
	public void ts_01() throws InterruptedException {
       System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
       ChromeOptions opt = new ChromeOptions();
       opt.addArguments("start-maximize");
       driver = new ChromeDriver(opt);
       	driver.get("https://the-internet.herokuapp.com/tinymce");
       	driver.switchTo().frame("mce_0_ifr");
    WebElement ele =driver.findElement(By.id("tinymce"));//sendKeys("askdjagsbdkjvbakjbvakjbvfkjdbfkvj");
    ele.sendKeys("sajdagjagkjvdba");
    ele.clear();
    driver.switchTo().parentFrame();
    String parent = driver.getWindowHandle();
    System.out.println(parent);
       	driver.findElement(By.linkText("Elemental Selenium")).click();
       	Thread.sleep(5000);
      Set<String> sp = driver.getWindowHandles();
      Iterator<String>itr = sp.iterator();
      while(itr.hasNext()) {
    	  String child = itr.next();
    	  
    	   if (parent.equals(child)) {
    		   System.out.println(child);
    		driver.switchTo().window(child);
			driver.close();
		}else {
    	   driver.switchTo().window(child);
		}
      }
      driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
      driver.findElement(By.id("email")).sendKeys("pankajdevgad0@gmail.com");
   WebElement sel=   driver.findElement(By.className("language"));
     Select op =new Select(sel);
     op.selectByValue("java");
     driver.findElement(By.name("newsletter-signup")).click();
	}
}
