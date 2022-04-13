package testNG;

import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ExpectedExceptions {
@Test(expectedExceptions= {NoSuchElementException.class})
	public  void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.leafground.com/pages/radio.html");
		
		//Selecting Radiobutton
		driver.findElement(By.id("yes")).click();
		
		//Finding default selected Button
		WebElement unchecked=driver.findElement(By.xpath("//*[@for='Unchecked1']"));
		Boolean unCheck=unchecked.isSelected();
		if (unCheck==false) {
			System.out.println("Default selected button is checked button");
			
		} 
		else 
		{
			System.out.println("Default selected button is unchecked");

		}
	
	}

}
