package Mouse.Aact.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeJava {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
	    WebDriver driver= new ChromeDriver();
	    driver.get("https://www.facebook.com/");
        JavascriptExecutor js=(JavascriptExecutor)driver;
        WebElement user =driver.findElement(By.id("email"));
        WebElement pass= driver.findElement(By.id("pass"));
        WebElement submit = driver.findElement(By.xpath("//input[@type='submit']"));    
        js.executeScript("arguments[0].setAttribute('value','ram');",user);
        Object script=js.executeScript("return arguments[0].getAttribute('value');", user);
        js.executeScript("arguments[0].click();",submit);
        System.out.println(script);

	}

}
