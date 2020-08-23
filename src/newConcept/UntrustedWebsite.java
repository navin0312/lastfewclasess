package newConcept;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class UntrustedWebsite 
{
	public static void main(String[] args)
	{
		DesiredCapabilities dcap=new DesiredCapabilities();
		//dcap.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS,true);
		dcap.setCapability(CapabilityType.ACCEPT_SSL_CERTS,true);
        System.setProperty("webdriver.chrome.driver","C:/Users/user/Desktop/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("untrusted website");
	}

}
