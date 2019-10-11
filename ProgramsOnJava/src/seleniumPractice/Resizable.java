package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
static WebDriver dr;	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	       dr = new ChromeDriver();
	       dr.manage().window().maximize();
	       dr.get("https://demoqa.com/resizable/");
	    WebElement el =	   dr.findElement(By.xpath("//div[@class='ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se']"));
	     Actions ac = new Actions(dr);
	      ac.clickAndHold(el).moveByOffset(200, 150).release().perform();
	}
}
