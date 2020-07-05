package WebBrowser.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class WorkSpace {
	
	    public static void main(String[] args) {
	    	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NANO SYSTEMS\\\\eclipse-workspace\\\\Web.com.test\\\\chromedriv\\\\chromedriver.exe");
	    	WebDriver driver=new ChromeDriver();
	    	driver.get("http://toolsqa.com/automation-practice-form/");
	    	WebElement firstnameTxt=driver.findElement(By.xpath("//input[@name='firstname']"));
	    	firstnameTxt.sendKeys("sathya");
	    	WebElement lastnameTxt=driver.findElement(By.xpath("//input[@id='lastname']"));
	    	lastnameTxt.sendKeys("v");
	    	WebElement radioBox=driver.findElement(By.xpath("(//input[@name='sex'])[2]"));
	    	radioBox.click();
	    	WebElement yearradioBox=driver.findElement(By.xpath("(//input[@name='exp'])[2]"));
	    	yearradioBox.click();
	    	WebElement yearExp=driver.findElement(By.xpath("//input[@id='datepicker']"));
	    	yearExp.click();
	    	WebElement checkBtn=driver.findElement(By.xpath("//input[@name='profession']"));
	    	checkBtn.click();
	    	WebElement checkBtn1=driver.findElement(By.xpath("(//input[@name='tool'])[2]"));
	    	checkBtn1.click();
	    	WebElement multiSelect=driver.findElement(By.xpath("//select[@id='continentsmultiple']"));
	    	multiSelect.click();
	    	WebElement selectTxt=driver.findElement(By.xpath("(//input[@name='continents']"));
	    	selectTxt.click();
	    	selectTxt.sendKeys("Aisa");
	    	WebElement buttonBox=driver.findElement(By.xpath("//button[@id='submit']"));
	    	buttonBox.click();
	    	
}
}
