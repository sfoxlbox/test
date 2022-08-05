package ebay;



//import java.io.File;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;

//import com.google.common.io.Files;

public class Beforetest_test extends Base {
	

	@BeforeTest
	public void setup() {
	
		driver = setproperty();
	
	driver.get("https://www.google.com/");
	
	}
	
	@Test
	public void getitle() {
		
	String title = driver.getTitle();
	System.out.println(title);
	}
	
	@Test
	public void logotest() {
		
	boolean logo = driver.findElement(By.className("lnXdpd")).isDisplayed();
	}
	
	@Test
	public void gmailtest()
	{
	boolean text = driver.findElement(By.linkText("Gmail")).isDisplayed();
	}
	
	@AfterTest
	public void teardown()
	{
	driver.close();
	driver.quit();
	}
}
