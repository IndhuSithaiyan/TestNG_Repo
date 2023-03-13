package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.Parameters;

public class LearnParameters {
	RemoteWebDriver driver;
	@Parameters({"emailid","password","browser"})
	@Test
	public void login(String email, String pass, String browser) {
		switch (browser) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			break;
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./Drivers/geckodriver.exe");
			driver = new FirefoxDriver();
			break;
		default:
			System.err.println("Browser is not found!");
			break;
		}
	driver.get("https://letcode.in/");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//*[@id=\'navbar-menu\']/div[2]/div/div/a[2]")).click();
	driver.findElement(By.name("email")).sendKeys(email);
	driver.findElement(By.name("password")).sendKeys(pass);
	driver.findElement(By.xpath("(//button[@class='button is-primary'])[1]")).click();
	String title = driver.getTitle();
	System.out.println(title);
	driver.quit();
	
	}
}
