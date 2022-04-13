package seleniumProject;

import java.time.Duration;
import java.util.List;

import org.checkerframework.checker.units.qual.Length;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InterviewQues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:\\google.com");
		WebElement elt=driver.findElement(By.xpath("//input[@name='q']"));
		elt.sendKeys("cricket"+Keys.ENTER);
		//WebDriverWait wait=new WebDriverWait(driver,Duration.ofMinutes(10));
		//wait.until(ExpectedConditions.elementToBeClickable(elt));
		List<WebElement> cric=driver.findElements
		(By.xpath("//*[contains(text(),'cricket') or contains(text(),'Cricket')]"));
		System.out.println(cric.size());
        

	}

}
