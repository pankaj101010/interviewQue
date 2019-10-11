package seleniumPractice;

import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

public class HandlingSSLCerti {
  WebDriver  driver;
	@Test
	public void setUp() {
//		DesiredCapabilities cap = new DesiredCapabilities().chrome();
//		cap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		 System.setProperty("webdriver.chrome.driver", "./chromedriver.exe");
		 ChromeOptions op = new ChromeOptions();
		 //op.setAcceptInsecureCerts(true);
		// op.addArguments("start-maximized");
		 //using following two line we can handle the msg of "this browser is being controlled by automated software"
		 op.setExperimentalOption("excludeSwitches", Collections.singletonList("enable-automation"));
		 op.setExperimentalOption("useAutomationExtension", false);
		// op.addArguments("--disable-infobars");
		 driver = new ChromeDriver(op);
		 driver.get("https://cacert.org/");
		 
//		Capabilities capp = cap;
//		capp.getVersion();
//		FirefoxOptions opt = new FirefoxOptions();
//		opt.getVersion();
	}
	
}
