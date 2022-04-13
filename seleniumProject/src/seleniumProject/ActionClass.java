package seleniumProject;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https:\\www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();

		// selecting mobiles
		WebElement ele = driver.findElement(By.xpath("//div[text()='Mobiles']"));
		ele.click();
		Actions act = new Actions(driver);
		try
		{
		WebElement ele1=driver.findElement(By.xpath("//*[text()='Electronics']"));
		
		act.moveToElement(ele1).perform();
		
		}
		catch (Exception e) {
			// TODO: handle exception
			}
		
		

	}

}
