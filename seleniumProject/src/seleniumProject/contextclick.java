package seleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class contextclick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver",
		"C:\\Users\\gboob\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://play.letcode.in/contextmenu");
WebElement rightClick=driver.findElement(By.xpath("//div[.=' Right Click ']"));
rightClick.click();
Actions builder=new Actions(driver);
builder.contextClick(rightClick).perform();
driver.findElement(By.xpath("//button[.='Click me']")).click();
//Accepting Alert box
Alert alt=driver.switchTo().alert();
System.out.println(alt.getText());
alt.accept();



	}

}
