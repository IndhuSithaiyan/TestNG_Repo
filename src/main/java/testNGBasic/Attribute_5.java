package testNGBasic;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Attribute_5 {
	//@Test(invocationCount = 3,threadPoolSize = 2)	//threadCount & threadPoolSize are same
	@Test(timeOut = 30000)
	public void findElements() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://google.com/");
		driver.findElement(By.name("q")).sendKeys("Criket", Keys.ENTER);
		List<WebElement> crickets = driver.findElements(By.xpath("//*[contains(text(), 'cricket') or contains(text(), 'Cricket')]"));
		System.out.println(crickets.size());
		driver.quit();
	}
}
