package inteviewProgram;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestngTesting {
	
	@Test(priority=1)
	public void name4() {
		WebDriver driver = new ChromeDriver();
		driver.findElement(By.id("pankaj")).sendKeys("");
		System.out.println("name4");
		List list = new ArrayList();
		
	}

	@Test(priority=3)
	public void name2() {
		System.out.println("name2");
	}

	@Test(priority=2)
	public void name1() {
		System.out.println("name1");
	}

	@Test(priority=6)
	public void name0() {
		System.out.println("name0");
	}

}
