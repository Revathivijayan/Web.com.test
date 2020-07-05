package Mouse.Aact.Com;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebEle {
	
public static void main(String[] args) throws Throwable {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
   WebDriver driver = new ChromeDriver();
   driver.get("https://www.flipkart.com/");
   String source = driver.getCurrentUrl();
   System.out.println(source);
      WebElement element = driver.findElement(By.xpath("//button[text()='✕']"));
      element.click();
      WebElement ele = driver.findElement(By.xpath("//input[@name='q']"));
      ele.sendKeys("mi phone");
      WebElement ele1 = driver.findElement(By.xpath("//button[@type='submit']"));
      ele1.click();
      Thread.sleep(3000);
      List<WebElement>redmi1= driver.findElements(By.xpath("//div[(@class='_3wU53n')]"));
      for(WebElement text : redmi1) {
    	  String value = text.getText();
    	  System.out.println(value);
      }
      
}
}