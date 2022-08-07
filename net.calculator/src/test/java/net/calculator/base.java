package net.calculator;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

		WebDriver driver;
			
		@SuppressWarnings("deprecation")
		public WebDriver setproperty()
		{
			
			System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
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
