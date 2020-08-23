package newConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class InfobarsHandling 
{
  public static void main(String[]args)
  {
	  System.setProperty("webdriver.chrome.driver","C:/Users/user/Desktop/chromedriver.exe");
	  ChromeOptions options=new ChromeOptions();
	  options.addArguments("--disable-infobars");
	  WebDriver driver=new ChromeDriver(options);
	  driver.get("https://www.google.co.in/");
  }
}
