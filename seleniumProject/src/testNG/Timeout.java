package testNG;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.domsnapshot.model.Rectangle;
import org.testng.annotations.Test;

public class Timeout {
@Test(timeOut = 30000)
	public  void main() {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(10));
		driver.get("https://letcode.in/buttons");
		// Handling with buttons
		// driver.findElement(By.id("home")).click();

		// getting Location of element
		WebElement position1 = driver.findElement(By.id("position"));
		Point p = position1.getLocation();
		int x = p.getX();
		int y = p.getY();
		System.out.println(x);
		System.out.println(y);

		// getting Height And Width
		System.out.println(position1.getSize().getHeight());
		System.out.println(position1.getSize().getWidth());

		// Rectangle rect= position.getRect();
		// Dimension dmn=rect.getDimension();
		// dmn.getHeight();
		// dmn.getWidht();

		// finding colour
		WebElement clr = driver.findElement(By.id("color"));
		String colour = clr.getCssValue("background-color");
		System.out.println(colour);

		// Is Disable
		WebElement isDisable = driver.findElement(By.id("isDisabled"));
		Boolean result = isDisable.isDisplayed();
		System.out.println(result);

	}

}
