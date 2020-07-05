package Mouse.Aact.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClass {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\\\\\Users\\\\\\\\NANO SYSTEMS\\\\\\\\eclipse-workspace\\\\\\\\Web.com.test\\\\\\\\chromedriv\\\\\\\\chromedriver.exe");
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://www.facebook.com/");
	  JavascriptException js=(JavascriptException)driver;
	  WebElement down = driver.findElement(By.xpath("email"));
	  
	
	}

}
