package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;


public class KeyEvents {
static WebDriver dr ;
static WebElement hv ;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        dr = new ChromeDriver();
       dr.manage().window().maximize();
       dr.get("https://demoqa.com/keyboard-events/");
       hv = dr.findElement(By.xpath("//input[@id='browseFile']"));
       Actions ac = new Actions(dr);
        ac.click(hv).sendKeys("E:\\resume\\resume\\Updated\\new\\AGUpdated\\PankajDevgade_QA.pdf").build().perform();
	}

}
