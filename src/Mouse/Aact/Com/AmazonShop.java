package Mouse.Aact.Com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AmazonShop {
	public static void main(String[] args) {
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\new update\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://demo.guru99.com/test/drag_drop.html");
	Actions action = new Actions(driver);
	WebElement source1=driver.findElement((By.xpath("//a[text()=' BANK ']")));
	WebElement target1=driver.findElement((By.xpath("//ol[@id='bank']")));
    action.dragAndDrop(source1,target1).perform();
    WebElement source2=driver.findElement((By.xpath("//a[text()=' 5000 ']")));
	WebElement target2=driver.findElement((By.xpath("//ol[@id='amt7']")));
    action.dragAndDrop(source2,target2).perform();
    WebElement source3=driver.findElement((By.xpath("//a[text()=' SALES ']")));
	WebElement target3=driver.findElement((By.xpath("//ol[@id='loan']")));
    action.dragAndDrop(source3,target3).perform();
    WebElement source4=driver.findElement((By.xpath("//a[text()=' 5000 ']")));
	WebElement target4=driver.findElement((By.xpath("//ol[@id='amt8']")));
    action.dragAndDrop(source4,target4).perform();
}
}
