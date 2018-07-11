package kamal;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Kamal {
	static ChromeDriver driver;

	public static ChromeDriver OpenBrowser()
	{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\sahad\\Videos\\chromedriver.exe");
	   driver = new ChromeDriver();
	   driver.get("https://www.bluefly.com/");
	   driver.manage().window().maximize();
	   return driver;
		}


	  
	public static void halarpolarloop() throws InterruptedException
	{
		int size = driver.findElements(By.xpath(".//*[@id='page-wrapper']/header/div/nav/ul/li/a")).size();
		
				
		for (int i =1; i<= 3 ; i++ )
		{
			driver.findElement(By.xpath(".//*[@id='page-wrapper']/header/div/nav/ul/li["+i+"]/a")).click();
			Thread.sleep(2000);
			driver.navigate().back();
		    Thread.sleep(2000);
		}
		
	}
}
