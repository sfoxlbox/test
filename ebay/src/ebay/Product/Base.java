package ebay.Product;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {

	WebDriver driver;
		
	public WebDriver setproperty()
	{
		
		System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		return driver;
		
	}
	
	public WebDriver teardown(WebDriver driver)
	{
         this.driver = driver;
		driver.close();
		driver.quit();
		return driver;
	}
}
