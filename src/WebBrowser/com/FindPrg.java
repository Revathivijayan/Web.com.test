package WebBrowser.com;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindPrg {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NANO SYSTEMS\\\\eclipse-workspace\\\\Web.com.test\\\\chromedriv\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.adactin.com/HotelApp/");
		WebElement usernameTxt=driver.findElement(By.id("username"));
		usernameTxt.sendKeys("sathya");
		String txt = usernameTxt.getAttribute("value");
		System.out.println(txt);
		WebElement passwordTxt=driver.findElement(By.id("password"));
		passwordTxt.sendKeys("java");
		String txt1 = passwordTxt.getAttribute("value");
		System.out.println(txt1);
	}
}
