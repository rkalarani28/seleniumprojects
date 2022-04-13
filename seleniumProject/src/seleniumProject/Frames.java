package seleniumProject;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Frames {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://letcode.in/frame");
		
		//switch to frame
		driver.switchTo().frame(1);
		driver.findElement(By.name("fname")).sendKeys("welcome");
		driver.findElement(By.name("lname")).sendKeys("India");
		
		//switch to inner frame
		WebElement frameName=driver.findElement(By.xpath("//iframe[@class='has-background-white']"));
		driver.switchTo().frame(frameName);
		//driver.switchTo().frame(0);
		driver.findElement(By.name("email")).sendKeys("k@gmail.ccom");
		
		//Again move to outer frame
		driver.switchTo().parentFrame();
		driver.findElement(By.name("lname")).sendKeys("Indian");
		
		//moving to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Watch tutorial")).click();
		
		
		
		

	}

}
