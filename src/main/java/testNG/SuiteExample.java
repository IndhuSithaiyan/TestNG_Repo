package testNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class SuiteExample {

	//Aim: open chrome and go to 
	//1. google co.in 2.bing.com 3.yahoo.com and then close the browser

	WebDriver driver;
	long startTime;
	long endTime;

	@BeforeSuite
	public void browserLaunch() {
		startTime = System.currentTimeMillis();
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
	}

	@Test
	public void openGoogle() {
		driver.get("https://google.com/");
	}

	@Test
	public void openBing() {
		driver.get("https://bing.com/");
	}

	@Test
	public void openYahoo() {
		driver.get("https://yahoo.com/");
	}

	@AfterSuite
	public void closeBrowser() {
		//driver.quit();
		endTime =System.currentTimeMillis();
		System.out.println("Totel time taken :"+(endTime - startTime));
	}
	
}
