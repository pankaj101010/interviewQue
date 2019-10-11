package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToolTip {
static WebElement hv ;
static WebDriver dr;
public static void wait(int time) {
	try {
		Thread.sleep(time);
	} catch (InterruptedException e) {
		System.out.println(e.getMessage());
	}
}
	public static void main(String[] args)  {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
	        dr = new ChromeDriver();
	        dr.manage().window().maximize();
	        dr.get("https://demoqa.com/tooltip-and-double-click/");
	        hv = dr.findElement(By.xpath("//div[@id='tooltipDemo']"));
	        Actions ac = new Actions(dr);
	        ac.moveToElement(hv).perform();
	        wait(2000);
	        // double click code here 
	        hv = dr.findElement(By.xpath("//button[@id='doubleClickBtn']"));
	        ac.doubleClick(hv).perform();
	        dr.switchTo().alert().accept();
	        wait(2000);
	        // right click and accept alert
	        hv = dr.findElement(By.xpath("//button[@id='rightClickBtn']"));
	        ac.contextClick(hv).perform();
	        hv = dr.findElement(By.xpath("//div[@id='rightclickItem']/div[3]"));
	        hv.click();
	        dr.switchTo().alert().accept();
	        wait(2000);
	        // mouse hover and tool-tip concept is here
	        dr.findElement(By.xpath("//a[text()='Tooltip']")).click();
	        hv = dr.findElement(By.xpath("//input[@id='age']"));
	        String hover =hv.getAttribute("title");
	        ac.moveToElement(hv).perform();
	        System.out.println(hover);
	}

}
