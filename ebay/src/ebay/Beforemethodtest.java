package ebay;

import java.io.File;

//import java.io.File;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.common.io.Files;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.google.common.io.Files;

public class Beforemethodtest extends Base{
	WebDriver driver;
	
	
	@BeforeMethod
	public void setup() {
	
	
		driver = setproperty();
	driver.get("https://www.google.com/");
	
	}
	
	@Test
	public void getitle() {
		
	String title = driver.getTitle();
	System.out.println(title);
	Assert.assertEquals(title,"Google" );
	}
	
	@Test
	public void logotest() {
		
	boolean logo = driver.findElement(By.className("lnXdpd")).isDisplayed();
	System.out.println(logo);
	}
	
	@Test
	public void gmailtest()
	{
	boolean text = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterMethod
	public void teardown()
	{
	driver.close();
	driver.quit();
	}
}
