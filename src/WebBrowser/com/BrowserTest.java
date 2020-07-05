package WebBrowser.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserTest {

public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NANO SYSTEMS\\\\eclipse-workspace\\\\Web.com.test\\\\chromedriv\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.automationtesting.in/Register.html");
	WebElement firstnameTxt=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	firstnameTxt.sendKeys("sathya");
	WebElement lastnameTxt=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	lastnameTxt.sendKeys("v");
	WebElement addressTxt=driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
	addressTxt.sendKeys("thuraibakkam");
	WebElement emailId=driver.findElement(By.xpath("//input[@type='email']"));
	emailId.sendKeys("sathya123@gmail.com");
	WebElement phonoTxt=driver.findElement(By.xpath("//input[@type='tel']"));
	phonoTxt.sendKeys("96385212");
	WebElement radioBox=driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
	radioBox.click();
	WebElement checkBtn=driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
	checkBtn.click();
	WebElement selectTxt=driver.findElement(By.xpath("//select[@id='Skills']"));
	selectTxt.click();
	selectTxt.sendKeys("HTML");
	WebElement selectcountryTxt=driver.findElement(By.xpath("//select[@id='countries']"));
	selectcountryTxt.click();
	selectcountryTxt.sendKeys("india");
	WebElement countryTxt=driver.findElement(By.xpath("//span[@role='combobox']"));
	countryTxt.click();
	WebElement countryTx=driver.findElement(By.xpath("//input[@type='search']"));
	countryTx.sendKeys("Australisa");
	WebElement yearSelect=driver.findElement(By.xpath("//select[@id='yearbox']"));
	yearSelect.click(); 
	yearSelect.sendKeys("2010");
	WebElement monthSelect=driver.findElement(By.xpath("//select[@placeholder='Month']"));
	monthSelect.click();
	monthSelect.sendKeys("May");
	WebElement daySelect=driver.findElement(By.xpath("//select[@id='daybox']"));
	daySelect.click();
	daySelect.sendKeys("25");
	WebElement passwordTxt=driver.findElement(By.xpath(" //input[@id='firstpassword']"));
	passwordTxt.sendKeys("saran");
	WebElement conpasswordTxt=driver.findElement(By.xpath("//input[@id='secondpassword']"));
	conpasswordTxt.sendKeys("saran");
	WebElement sumbitBox=driver.findElement(By.xpath("//button[@id='submitbtn']"));
	sumbitBox.click();
 
    
} 
}