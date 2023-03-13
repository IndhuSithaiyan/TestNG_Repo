package testNGBasic;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class AlertFields1 {
	@Test
	public void main() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/alert");
		
		//accept -- simple alert
		//driver.switchTo().alert().accept();    ---->Exception -- NoAlertPresentException
		driver.findElement(By.id("accept")).click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		System.out.println("Simple alert text: "+text);
		alert.accept();
		
		//dismiss -- confirm alert  -> Ok & cancel
		driver.findElement(By.id("confirm")).click();
		Alert confirmAlert = driver.switchTo().alert();
		confirmAlert.dismiss();
		
		//prompt alert -> userInput
		driver.findElement(By.id("prompt")).click();
		//System.out.println(driver.getCurrentUrl());   ---->Exception -- UnhandledAlertException
		driver.switchTo().alert();
		alert.sendKeys("Induuu");
		alert.accept();
		String name = driver.findElement(By.id("myName")).getText();
		System.out.println(name);
		driver.quit();
		
	}

}
