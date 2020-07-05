package Mouse.Aact.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDate {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
		   driver.get("https://www.redbus.in/");
		   String web = driver.getCurrentUrl();
		   System.out.println(web);
		   WebElement element1 = driver.findElement(By.xpath("//label[text()='Onward Date']"));
		   element1.click();
		   driver.navigate().back();

		   driver.findElement(By.xpath("//button[text()='>']")).click();	   

		   
	}

}
