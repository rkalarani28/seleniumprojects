package seleniumProject;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://letcode.in/alert");
		
		//Accept Alert
		driver.findElement(By.id("accept")).click();
		driver.switchTo().alert().accept();
		
		//Dismiss Alert and print text
		driver.findElement(By.id("confirm")).click();
		String text=driver.switchTo().alert().getText();
		driver.switchTo().alert().dismiss();
		System.out.println(text);
		
		//Type text and Dismiss
		driver.findElement(By.id("prompt")).click();
		org.openqa.selenium.Alert alt=driver.switchTo().alert();
		alt.sendKeys("Welcome");
		alt.dismiss();
		
		
		//Modern Alert
		//This is not alert it is like a element can do right click and screen shot
		
		
		
		
		
		
		

	}

}
