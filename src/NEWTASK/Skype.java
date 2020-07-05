package NEWTASK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Skype {
	
	public static void main(String []args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.skype.com");
		WebElement ele =driver.findElement((By.xpath("//span[text()='Sign in']")));
		ele.click();
		WebElement ele1 =driver.findElement((By.xpath("(//a[@role='menuitem'])[3]")));
		ele1.click();
		WebElement ele2 =driver.findElement(By.id("i0116"));
		ele2.click();
		ele2.sendKeys("8110803918");
	}
	}