package seleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https:\\letcode.in\\dropdowns");
		driver.manage().window().maximize();
		
		//selecting fruit
		WebElement drop1=driver.findElement(By.id("fruits"));
		Select fruits=new Select(drop1);
		fruits.selectByIndex(1);
		
		//selecting from more options
		WebElement drop2=driver.findElement(By.id("superheros"));
		Select heros=new Select(drop2);
		heros.selectByValue("ta");
		
		
		//select last option and print all options
		WebElement drop3=driver.findElement(By.id("lang"));
		Select lang=new Select(drop3);
		lang.selectByValue("java");;
		List<WebElement> allOptions=lang.getOptions();
		for (WebElement webElement : allOptions) {
			System.out.println(webElement);
			
		}
		
		//select by value and print
		
		WebElement drop4=driver.findElement(By.id("country"));
		Select country=new Select(drop3);
		country.selectByValue("India");
		System.out.println(country.getFirstSelectedOption());
		

	}

}
