package seleniumProject;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://letcode.in/table");

		//print headers
		List<WebElement> header=driver.findElements(By.xpath("//table[@id='simpletable']//th"));
		for (int i = 0; i <header.size(); i++) {


			System.out.println("Headers " +header.get(i).getText());

		}


		//mark the checkbox name is raj 
		List<WebElement> table2=driver.findElements(By.xpath("//table[@id='simpletable']//td[2]"));
		

		for (WebElement webElement : table2) {

			String name=webElement.getText();
			if(name.equals("Raj"))
			{
				driver.findElement(By.id("second")).click();
				break;
			}
		}




	}

}
