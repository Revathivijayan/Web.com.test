package WebBrowser.com;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollDownUp {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://greenstech.in/selenium-course-content.html");
	JavascriptExecutor js = (JavascriptExecutor)driver;
	WebElement elem = driver.findElement(By.xpath("(//p[text()=' Interview Questions'])"));
    WebElement elem1 = driver.findElement(By.xpath("(//p[text()='Job Openings'])"));
	js.executeScript("arguments[0].scrollIntoView(true);",elem);
	Thread.sleep(3000);
	js.executeScript("arguments[0].scrollIntoView(false);",elem1);
	System.out.println(elem.getText());
	System.out.println(elem1.getText());


	}
	

}
