 package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import seleniumProject.DataProviderClass;

public class DataProviderEx extends DataProviderClass{
	
	
	@Test(dataProvider = "test",dataProviderClass = DataProviderClass.class)
	public void Parameter(String data[]) {
		System.out.println("dpe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		System.out.println("dpe1");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(data[0]);
		driver.findElement(By.id("pass")).sendKeys(data[1]);
		driver.findElement(By.name("login")).click();
	}
}
