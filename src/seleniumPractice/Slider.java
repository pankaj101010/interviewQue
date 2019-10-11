package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {
static WebDriver dr;
static WebElement sl;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
        dr = new ChromeDriver();
       dr.manage().window().maximize();
       dr.get("https://demoqa.com/slider/");
        sl = dr.findElement(By.xpath("//span[@class='ui-slider-handle ui-corner-all ui-state-default']"));
        Actions ac = new Actions(dr);
        ac.clickAndHold(sl).moveByOffset(75, 0).perform();
         
        //ac.moveToElement(sl, 50, 0).perform();
	}

}
