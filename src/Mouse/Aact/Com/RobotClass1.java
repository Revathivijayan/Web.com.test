package Mouse.Aact.Com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

	
	public class RobotClass1 {
		public static void main(String[] args) throws Throwable {
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NANO SYSTEMS\\\\eclipse-workspace\\\\Web.com.test\\\\chromedriv\\\\new\\\\chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.facebook.com/");
		  WebElement element = driver.findElement(By.id("email"));
		  element.sendKeys("ramesh");
		  Actions acc = new Actions(driver);
		  acc.doubleClick(element).perform(); 
		  acc.contextClick().perform();
		  Robot r = new Robot();
	  for(int i=0; i<3; i++)
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_ENTER);
		driver.findElement(By.id("pass"));
		
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		

	}


}
