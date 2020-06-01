package webTables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FetchPriceIfElse
{
public WebDriver driver;
	
	@Test
	public void headers()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///G:/STUDY%20MATERIAL/SELENIUM/Classes/june1(Tables,Scrolling%20up%20down)/WebTable.html");
		
		List<WebElement> authors=driver.findElements(By.xpath("//tr//td[2]"));
		
		/*for(int i=0;i<authors.size();i++)
		{
			System.out.println(authors.get(i).getText());
		}*/
		
		for(int i=0;i<authors.size();i++)
		{
			if(authors.get(i).getText().equals("Kanika"))
			{
				WebElement price=driver.findElement(By.xpath("//td[.='Kanika']/..//td[contains(text(),'Rs')]"));
				System.out.println(price.getText());
				break;
			}
			else
			{
				System.out.println("author name not present");
			}
		}
	}
}
