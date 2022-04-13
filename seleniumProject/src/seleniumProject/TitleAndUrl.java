package seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TitleAndUrl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\www.google.com");
		//Getting current Url
		System.out.println("current page");
		System.out.println("url=" + driver.getCurrentUrl());
		System.out.println("title=" + driver.getTitle());
		
		//Getting next page url
		System.out.println("next page");
		WebElement input = driver.findElement(By.name("q"));
		input.sendKeys("chennai" + Keys.ENTER);
		System.out.println("url=" + driver.getCurrentUrl());
		System.out.println("title=" + driver.getTitle());
		
		//Going back 
		System.out.println("Going back page again"); 
		driver.navigate().back();
		System.out.println("url=" + driver.getCurrentUrl());
		System.out.println("title=" + driver.getTitle());
		
		//Going forward
		System.out.println("Going forward page");
		driver.navigate().forward();
		System.out.println("url=" + driver.getCurrentUrl());
		System.out.println("title=" + driver.getTitle());

	}

}
