package newConcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class HandlingChatbot
{
	 public static void main(String[]args)
	 {
		 System.setProperty("webdriver.chrome.driver", "H:\\automation related software\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.irctc.co.in");
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		 driver.manage().window().maximize();
         driver.findElement(By.xpath("(//button[@type='submit'])[1]")).click();
         //driver.findElement(By.id("corover-close-btn")).click();
         
         driver.findElement(By.id("corover-disha-icon")).click();
         //driver.switchTo().frame(3);//using index (index always starts from 0 in java)
         driver.switchTo().frame("corover-chat-frame");//using id
     
    /*     WebDriverWait wait=new WebDriverWait(driver, 40);
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Enter your query here']")));
	
         driver.findElement(By.xpath("//input[@placeholder='Enter your query here']")).sendKeys("when i will book the ticket?");
         
*/         driver.findElement(By.id("search")).sendKeys("when i will book the ticket?");
           driver.findElement(By.id("ask")).click();
           System.out.println("done");
     }
}	 
