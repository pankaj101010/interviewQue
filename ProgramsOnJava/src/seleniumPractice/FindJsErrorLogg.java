package seleniumPractice;

import java.util.logging.Level;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.logging.LogEntries;
import org.openqa.selenium.logging.LogEntry;
import org.openqa.selenium.logging.LogType;
import org.openqa.selenium.logging.LoggingPreferences;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FindJsErrorLogg {
	WebDriver driver;

	@BeforeTest
	public void tc_01() {
		ChromeOptions opt = new ChromeOptions()
		ChromeDriverService sc =new ChromeDriverService(executable, port, args, environment);
//		DesiredCapabilities cp = DesiredCapabilities.chrome();
		LoggingPreferences logg = new LoggingPreferences();
		logg.enable(LogType.BROWSER, Level.ALL);
		opt.setCapability(CapabilityType.LOGGING_PREFS, logg);
		driver = new ChromeDriver(opt);

	}

//	@Test(priority=1)
//	public void tc_03() {
////		jsScriptEr();
//
//	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}
	@Test
	public void jsScriptEr() {
		driver.get("https://amazon.com");
		LogEntries ent=driver.manage().logs().get(LogType.CLIENT);
		System.out.println(ent.getAll());
		 for (LogEntry logEntry : ent) {
      System.out.println(logEntry.getTimestamp()+" " +logEntry.getLevel() +" "+logEntry.getMessage());
		}
	
		
	}

}
