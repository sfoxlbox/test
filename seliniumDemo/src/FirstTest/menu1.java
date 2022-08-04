package FirstTest;


import java.io.File;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.support.ui.Select;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class menu1 extends cart{
	
	
	
	
	
	
	
	
	public  void menu() throws InterruptedException {
		
		 final	JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
	
    js.executeScript("window.scrollBy(0,400)", "");
	driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit ")).click();
	Thread.sleep(2000);
	
    driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit > option:nth-child(1)")).click();
    
    Thread.sleep(2000);	
    js.executeScript("window.scrollBy(0,400)", "");
    js.executeScript("window.scrollBy(0,400)", "");
	Thread.sleep(2000);
	
	driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit ")).click();
    driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit > option:nth-child(2)")).click();
    
    Thread.sleep(2000);	
    js.executeScript("window.scrollBy(0,400)", "");
	//Thread.sleep(2000);
	driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit ")).click();
    driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit > option:nth-child(3)")).click();
    
    Thread.sleep(2000);	
    js.executeScript("window.scrollBy(0,400)", "");
	Thread.sleep(2000);
	driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit ")).click();
    driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit > option:nth-child(4)")).click();
    
}
}
