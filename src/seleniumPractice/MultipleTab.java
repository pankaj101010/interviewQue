package seleniumPractice;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Level;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class MultipleTab {
	WebDriver driver;

	public void newTab() {
		try {
			Robot rb = new Robot();
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_T);
			rb.keyPress(KeyEvent.VK_CONTROL);
			rb.keyPress(KeyEvent.VK_T);
			Thread.sleep(2000);
		} catch (AWTException e1) {
		} catch (InterruptedException e) {
		}
	}

	@Test
	public void tc_01() throws AWTException, InterruptedException, IOException {
		DesiredCapabilities cp = DesiredCapabilities.chrome();
		LoggingPreferences logg =new LoggingPreferences();
		logg.enable(LogType.BROWSER, Level.ALL);
		cp.setCapability(CapabilityType.LOGGING_PREFS, logg);
		
		driver = new ChromeDriver(cp);
		
		driver.get("https://www.google.com/");
		String p = driver.getWindowHandle();
		WebElement el = driver.findElement(By.xpath("//div[@class='FPdoLc VlcLAe']"));
	File fs =el.getScreenshotAs(OutputType.FILE);
	  FileUtils.copyFile(fs, new File("F:\\pankaj.jpg"));
       Thread.sleep(1000);   
		newTab();
		Set<String> winds = driver.getWindowHandles();
		System.out.println(winds.size());
		Iterator<String> itr = winds.iterator();
		while (itr.hasNext()) {
			if (itr.next().equals(p)) {
				driver.switchTo().window(itr.next());
				driver.get("https://www.google.com/");
				Thread.sleep(1000);
				newTab();
			}
		}
	}

}
