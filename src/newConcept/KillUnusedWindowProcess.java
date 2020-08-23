package newConcept;

import org.openqa.selenium.os.WindowsUtils;

public class KillUnusedWindowProcess 
 {
  public static void main(String[] args) 
	{
	  WindowsUtils.killByName("explorer.exe");
      WindowsUtils.killPID("4076");

	}

 }
