package Mouse.Aact.Com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Oracle {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NANO SYSTEMS\\\\eclipse-workspace\\\\Web.com.test\\\\chromedriv\\\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
	}
}
	
	