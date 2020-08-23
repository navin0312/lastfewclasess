package newConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;

 public class ChromeFirefoxLogs 
  {
	public static void main(String[] args)
	{
		   System.setProperty("webdriver.chrome.driver", "H:/automation related software/chromedriver.exe");
		   
		   //System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		  // System.setProperty("webdriver.chrome.logfile","./Chromelog.txt");
		   System.setProperty("webdriver.chrome.logfile","./Chromelog.txt");  
		   WebDriver driver=new ChromeDriver();
		   driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		   driver.get("https://demo.actitime.com");
		   driver.findElement(By.id("username")).sendKeys("admin");
		   driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		   driver.findElement(By.xpath("//div[text()='Login ']")).click();
		   driver.findElement(By.id("logoutL ")).click();
		   
		 
	}
  }
