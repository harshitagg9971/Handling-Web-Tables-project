package webTables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintPriceOfAuthor 
{
	public WebDriver driver;
	
	@Test
	public void headers()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("file:///G:/STUDY%20MATERIAL/SELENIUM/Classes/june1(Tables,Scrolling%20up%20down)/WebTable.html");
		
		WebElement price=driver.findElement(By.xpath("//td[.='Kanika']/..//td[contains(text(),'Rs')]"));
		System.out.println(price.getText());
	}
}
