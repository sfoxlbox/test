package ebay;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class page_object_elements_TEST extends Base {

	
	
	WebDriver driver;

	@BeforeTest
	public void setup() {
		driver = setproperty();
	
	}
	@Test
	public void URL()
	{
		driver.get("https://www.ebay.com");
	}
	@Test
	public void homePageTest() {

	HomePage hp = new HomePage(driver);

	hp.typesearch("watch");
	hp.selectcategories("Collectibles");
	hp.clickbotton();

	}

	@AfterTest
	public void tearDown() 
	{
	driver.close();
	driver.quit();
	}
}
