package seleniumPractice;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProgressBar {
static WebDriver dr;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
       dr = new ChromeDriver();
       dr.manage().window().maximize();
       System.out.println(dr.manage().window().getSize());
       dr.get("https://demoqa.com/progressbar/");
       JavascriptExecutor js = (JavascriptExecutor)dr;
       js.executeScript("document.getElementsByClassName('ui-progressbar-value ui-corner-left ui-widget-header')[0].setAttribute('style','width: 70%;')");
       Dimension d = new Dimension(1000,550);
       dr.manage().window().setSize(d);
       WebElement el;
	}

}
