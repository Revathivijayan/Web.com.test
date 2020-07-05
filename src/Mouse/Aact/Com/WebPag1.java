package Mouse.Aact.Com;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	public class WebPag1 {

		
	public static void main(String[] args) throws Throwable {
	   System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\NANO SYSTEMS\\\\eclipse-workspace\\\\Web.com.test\\\\chromedriv\\\\new update\\\\chromedriver.exe");
	   WebDriver driver = new ChromeDriver();
	   driver.get("https://www.flipkart.com/");
	   String source = driver.getCurrentUrl();
	   System.out.println(source);
	      WebElement element1 = driver.findElement(By.xpath("//button[text()='✕']"));
	      element1.click();
	      WebElement element2 = driver.findElement(By.xpath("//input[@name='q']"));
	      element2.sendKeys("mi phone");
	      WebElement element3 = driver.findElement(By.xpath("//button[@type='submit']"));
	      element3.click();
	      Thread.sleep(3000);
	      List<WebElement> redmi= driver.findElements(By.xpath("//div[(@class='_3wU53n')]"));
	      	redmi.size();
             for(int i=0 ; i<redmi.size();i++) {
            	 WebElement list=redmi.get(i);
               String value1 = list.getText();
	    	  System.out.println(value1);
	      }
	      
	}
	}
