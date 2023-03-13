package testNGBasic;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Utils.DataUtils;

public class LearnDataProvider {
	//public class LearnDataProvider extends DataUtils {
		
//	@DataProvider(name = "login")
//	public String[][] getData() {
//		String[][] data = new String[2][2];
//		data[0][0] = "abc123@gmail.com";
//		data[0][1] = "Pass1234$";
//		
//		data[1][0] = "abc456@gmail.com";
//		data[1][1] = "Pass5678$";
//		
//		return data;
//	}
	
	@Test(dataProvider = "login", dataProviderClass = DataUtils.class)
	public void login(String data[]) {
		//public void login(String email, String pass) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://letcode.in/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\'navbar-menu\']/div[2]/div/div/a[2]")).click();
		driver.findElement(By.name("email")).sendKeys(data[0]);
		driver.findElement(By.name("password")).sendKeys(data[1]);
		driver.findElement(By.xpath("(//button[@class='button is-primary'])[1]")).click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.quit();
	}
}
