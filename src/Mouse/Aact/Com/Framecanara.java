package Mouse.Aact.Com;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framecanara {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
	   driver.get("https://netbanking.canarabank.in/entry/ENULogin.jsp");
	   WebElement bank1 = driver.findElement(By.xpath("//input[@name='fldLoginUserId']"));
	   bank1.click();
	   WebElement bank2 = driver.findElement(By.xpath("//input[@name='fldPassword']"));
	   bank2.click();
	   WebElement bank3 = driver.findElement(By.xpath("//input[@name='fldcaptcha']"));
	   bank3.click();
	   WebElement bank4 = driver.findElement(By.xpath("//input[@type='submit']"));
	   bank4.click();
	   Alert a= driver.switchTo().alert();
	   a.accept();
		
	}

}
