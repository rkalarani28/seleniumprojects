package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CrossBrowserUsingParameter {
	WebDriver driver;
	@Parameters({"emailid","pass","browser"})
	@Test
	public void Parameter(String email,String pass,String browser) {
		System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		switch (browser) {
		case "chrome": 
			driver=new ChromeDriver();

		case "firefox":
			driver=new FirefoxDriver();
		}
		driver.get("https://www.facebook.com");
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("pass")).sendKeys(pass);
		driver.findElement(By.name("login")).click();
	}

}
