package newConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PageLoadTimeout
{
	public static void main(String[]args)
	{
      System.setProperty("webdriver.chrome.driver","C:/Users/user/Desktop/chromedriver.exe");
      WebDriver driver=new ChromeDriver();
      driver.manage().timeouts().pageLoadTimeout(10,TimeUnit.SECONDS);
      driver.get("https://www.myntra.com");
      System.out.println(driver.getTitle());
      
	}
}
