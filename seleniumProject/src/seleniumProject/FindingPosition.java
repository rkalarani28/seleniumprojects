package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingPosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://omayo.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Element=driver.findElement(By.id("ta1"));
		
		//Getting Position using Pointclass
		Point Position=Element.getLocation();
		int x=Position.getX();
		int y=Position.getY();
		System.out.println("x position="+x);
		System.out.println("y position="+y);
		System.out.println("Height="+Element.getSize().getHeight());
		System.out.println("Width="+Element.getSize().getWidth());
		
		

	}

}
