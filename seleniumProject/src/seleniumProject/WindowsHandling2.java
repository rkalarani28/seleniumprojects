package seleniumProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/Window.html");
		driver.findElement(By.id("home")).click();
		Set<String> first=driver.getWindowHandles();
		List<String> list=new ArrayList<String>(first);
		driver.switchTo().window(list.get(1)).close();
		driver.switchTo().window(list.get(0));
		list.clear();
		
		
		
		//find number of opened window
		
		driver.findElement(By.xpath("//button[@onclick='openWindows()']")).click();
		Set<String> count=driver.getWindowHandles();
		System.out.println("number of opened windows "+count.size());
		
		
		//close all except parent
		
		list.addAll(count);
		for (int j = 1; j <list.size(); j++) {
			driver.switchTo().window(list.get(j)).close();
		}
		
		driver.switchTo().window(list.get(0));
		
		WebElement Wait=driver.findElement(By.id("color"));
		Wait.click();
		
			
		} 
			
		
		
		
		
		
		
		
		
		

	

}
