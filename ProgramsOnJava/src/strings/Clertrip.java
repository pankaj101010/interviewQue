package strings;

import java.util.Date;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Clertrip {
	public static void clickOnDay(String day,String month,String year,WebDriver driver) throws InterruptedException {
	while(true) {
		try {
	 driver.findElement(By.xpath("//td[@data-handler='selectDay' and @data-month='"+month+"' and @data-year='"+year+"']/a[text()='"+day+"']")).click();
		break;
		}
	catch(Exception e){
		//driver.findElement(By.xpath("(//a[@title='Next'])[2]")).click();
		System.out.println("hi");
		driver.findElement(By.xpath("//a[@data-handler='next']")).click();
		//Thread.sleep(1000);
	}
	}
	}
	public static void main(String[] args) throws InterruptedException {
//		String month ="9";
//		String day="30";
//		String year ="2019";
		Date date = new Date();
		int today = date.getDate();
		System.out.println(today);
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		String onDate = "July 2019";
		WebDriver driver = new ChromeDriver(options);
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.cleartrip.com/");
		driver.findElement(By.xpath("//input[@id='RoundTrip']")).click();
		WebElement from = driver.findElement(By.xpath("//input[@etitle='From']"));
		from.sendKeys("mumbai");
		from.sendKeys(Keys.ENTER);
		WebElement toJourney = driver.findElement(By.xpath("//input[@etitle='To']"));
		toJourney.sendKeys("Delhi");
		toJourney.sendKeys(Keys.ARROW_DOWN);
		toJourney.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("(//i[@class='icon ir datePicker'])[1]")).click();
        clickOnDay("30","7","2019",driver);
        Thread.sleep(1000);
        clickOnDay("30","8","2020",driver); 
        driver.findElement(By.xpath("(//input[@type='submit'])[2]")).click();
        WebElement ele = driver.findElement(By.xpath("(//nav[@class='powerFilters quickStopFilter inline-block'])[2]//li[3]"));
        WebDriverWait wait = new WebDriverWait(driver, 60);
           wait.until(ExpectedConditions.visibilityOf(ele));
           
//		for (int i = 0; i <months.size(); i++) {
//			 if (onDate.equalsIgnoreCase(months.get(i).getText())) {
//				 Thread.sleep(1000);
//				List<WebElement> d = driver.findElements(By.xpath("//td[@data-handler='selectDay']"));
//				  for (int j = 1; j <=d.size(); j++) {        
//					if (today==Integer.parseInt(d.get(j).getText())) {
//						System.out.println(d.get(j).getText());
//						d.get(j+5).click();
//						break;
//					}
//				}
//			}else {
//				driver.findElement(By.xpath("//a[@data-handler=\"next\" ]")).click();
//			}
//		}
	}
}
