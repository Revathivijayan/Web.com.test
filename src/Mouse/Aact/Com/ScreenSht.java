package Mouse.Aact.Com;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenSht {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\chromedriv\\chromedriver.exe");
		   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.facebook.com/");
	   TakesScreenshot tk=(TakesScreenshot)driver;
	   File source = tk.getScreenshotAs(OutputType.FILE);
	   File des =new File("C:\\Users\\NANO SYSTEMS\\eclipse-workspace\\Web.com.test\\img\\image.png");
	   FileUtils.copyFile(source,des);
	   System.out.println("done");
      
	  
}
}
