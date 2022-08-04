package ebay;



//import java.io.File;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

//import com.google.common.io.Files;
public class ASSerting extends Base{

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
		Assert.assertEquals(title,"Google" );  // ASSERTION EXAMPLE 
		Assert.assertNotEquals(title,"Googl" );
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


