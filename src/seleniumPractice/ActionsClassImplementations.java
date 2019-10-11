package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassImplementations {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/autocomplete/");
		Actions ac = new Actions(driver);
		WebElement text = driver.findElement(By.cssSelector("input[class*='ui-autocomplete-input']"));
		ac.keyDown(text,Keys.SHIFT).sendKeys("pankaj").keyUp(Keys.SHIFT).perform();
//		Action act = ac.build();
//		act.perform();
//		
//		WebDriverWait wt = new WebDriverWait(driver,20);
//		wt.until(ExpectedConditions.alertIsPresent());
//		WebElement el =	driver.findElement(By.xpath(""));
//		el.getLocation().getX();
	
	}
}
