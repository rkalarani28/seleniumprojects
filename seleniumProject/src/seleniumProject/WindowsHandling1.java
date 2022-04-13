package seleniumProject;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class WindowsHandling1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://letcode.in/windows");

		// Move New window and print Title
		driver.findElement(By.id("home")).click();
		String oldWindow = driver.getWindowHandle();
		System.out.println("parent window"+driver.getTitle());
		Set<String> allWindows = driver.getWindowHandles();
		List<String> list=new ArrayList<String>(allWindows);
		driver.switchTo().window(list.get(1));
		System.out.println("child window"+driver.getTitle());
		
		//closing parent window
		//driver.switchTo().window(list.get(0)).close();
		driver.switchTo().window(list.get(1)).close();
		
		
		//working with multiple window
		
		driver.switchTo().window(list.get(0));
		list.clear();
		driver.findElement(By.id("multi")).click();
		Set<String> multi=driver.getWindowHandles();
		list.addAll(multi);
		System.out.println(multi.size());
		for (int i = 0; i <multi.size(); i++) {
		driver.switchTo().window(list.get(i));
			System.out.println(driver.getTitle());
			
		} {
			
			
		}
		
		
		
		
		
		
		
	
	}

}
