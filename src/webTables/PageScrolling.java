package webTables;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PageScrolling 
{
	public WebDriver driver;
	
	@Test
	public void scroll() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();//upcasting
		driver.get("https://www.myntra.com");
		
		JavascriptExecutor js=(JavascriptExecutor) driver;	//downcasting (converting chromedriver object to JavascriptExecutor)
		for(int i=0;i<=4;i++)
		{
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,1000)");
		}
		
		for(int j=0;j<=4;j++)
		{
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,-500)");
		}
	}
}
