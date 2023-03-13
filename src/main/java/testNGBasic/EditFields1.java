package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class EditFields1 {

	@Test
	public void Edit() {
		
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/edit");
		
		//Enter your full Name
		driver.findElement(By.id("fullName")).sendKeys("Induu");
		
		//Append a text and press keyboard tab
		driver.findElement(By.id("join")).sendKeys(" good girl", Keys.TAB);
		
		//What is inside the text box
		String myValue = driver.findElement(By.id("getMe")).getAttribute("value");
		System.out.println(myValue);
		
		//Clear the text
		driver.findElement(By.id("clearMe")).clear();
		
		//confirm edit field is disabled
		boolean isEdit = driver.findElement(By.id("noEdit")).isEnabled();
		System.out.println(isEdit);
		
		//confirm text is readonly
		String isReadonly = driver.findElement(By.id("dontwrite")).getAttribute("readonly");
		System.out.println(isReadonly);
		driver.quit();
	}

}
