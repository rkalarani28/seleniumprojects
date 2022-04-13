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

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://letcode.in/buttons");
		
		//Takescreenshot  
		File dest1 = new File("file1.png");
        TakesScreenshot shot=(TakesScreenshot) driver;
		File source1 = shot.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source1,dest1);
		
		
		//Taking screenshot for particular element
		WebElement shot1=driver.findElement(By.className("content"));
		File dest2=new File("file2.png");
		File source2= shot1.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(source2,dest2);
		
		
		
		
		

	}

}
