package webTables;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintAllRowValues 
{
	public WebDriver driver;
	
	@Test
	public void headers()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///G:/STUDY%20MATERIAL/SELENIUM/Classes/june1(Tables,Scrolling%20up%20down)/WebTable.html");
		
		List<WebElement> rowValue=driver.findElements(By.xpath("//tr"));
		for(int i=1;i<=rowValue.size()-1;i++)
		{
			System.out.println(rowValue.get(i).getText());
		}
	}
}
