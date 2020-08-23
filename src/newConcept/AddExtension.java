package newConcept;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AddExtension
{
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:/Users/user/Desktop/chromedriver.exe");
		ChromeOptions options=new ChromeOptions();
		//options.addExtensions(new File("H:\\calculator.crx"));
		options.addExtensions(new File("H:\\automation related software\\calculator.crx"));
		WebDriver driver=new ChromeDriver(options);
		driver.get("https://www.google.com");
		
	}

}
