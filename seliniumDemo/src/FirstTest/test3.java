package FirstTest;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class test3 {
	
     public static void main(String[] args) throws InterruptedException, IOException {
	// TODO Auto-generated method st
	WebDriver driver;
	for (int i =0 ; i< 1 ; i++)
	{
	System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
	
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	 JavascriptExecutor js = (JavascriptExecutor) driver;


	        //Launch the application		
	        driver.get("https://www.browserstack.com/guide/selenium-scroll-tutorial");
	        Thread.sleep(4000);
	        //Locating element by link text and store in variable "Element"        		
	        WebElement Element = driver.findElement(By.cssSelector("#singlePageArticle > div.container > div > div > div.guide-content > div > div > div > div > div > div > p:nth-child(10)"));

	        // Scrolling down the page till the element is found		
	        js.executeScript("arguments[0].scrollIntoView();", Element);
	        Thread.sleep(4000);
	        js.executeScript("window.scrollBy(0,-4000)", "");
	        Thread.sleep(4000);
	        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	        Thread.sleep(2000);
	        
	        driver.quit();
	    }
	}
}

