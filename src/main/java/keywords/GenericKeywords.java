package keywords;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GenericKeywords {
	
	public WebDriver driver;
	public Properties prop;
	
	
	
	public void openBrowser(String bName) 
	{
		System.out.println("Opening Browser "+bName);
		
		if(bName.equals("Chorme"))
		{			
		  System.setProperty("webdriver.chrome.driver", "E:\\selenium\\chromedriver.exe");
		  driver = new ChromeDriver();
		}	
		
	}
	
	public void navigate(String urlkey)
	{
		System.out.println("Opening url"+urlkey);
		driver.get(prop.getProperty(urlkey));
	}
	
	public void click(String locatorkey)
	{
		System.out.println("Clicking on "+locatorkey);
		getElement(prop.getProperty(locatorkey)).click();
	}
	
	public void type(String locatorkey, String data)
	{
		System.out.println("Typing in "+locatorkey+" .Data "+data);
		getElement(prop.getProperty(locatorkey)).sendKeys(data);
				
	}
	
	public void select(String locator, String data)
	{
		
	}
	
	public void getText(String locator, String data)
	{
		
	}
	
	public WebElement getElement(String locator)
	{
		//check the presence of element
		//check the visibility
		WebElement e = driver.findElement(By.id(locator));
		return e;
	}
	
	public boolean isElementPresent (String locator)
	{
		// True - Present
		//False - not present
		return false;
			
	}
	
	public boolean isElementVisible (String locator)
	{
		// True - Visible
		//False - not Visible
		return false;
			
	}
	
	public void Close()
	{
	
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.close();		
	}
	

}
