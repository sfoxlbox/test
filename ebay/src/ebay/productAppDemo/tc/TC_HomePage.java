package ebay.productAppDemo.tc;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import ebay.Product.Base;
import ebay.productAppDemo.po.HomePage;

public class TC_HomePage extends Base{

	WebDriver driver;
	
	@BeforeMethod
	public void Setup()
	{
		
		driver = setproperty();
		driver.get("http://demo.automationtesting.in/Register.html");
	}
	@Test
	public void Test() throws InterruptedException
	{
	HomePage hp = new HomePage(driver);
	hp.SetFirstName("Mounir");
	hp.SetLastName("voila");
	hp.SetAddress("1234 adbc");
	hp.SetEmail("abc@gmail.com");
	hp.SetGender();
	hp.SetPhone("5177758899");
	hp.SetHobbies();
	hp.SetLangauge();
	hp.hover();
	
	
	
	Thread.sleep(4000);
	}
	
	@AfterMethod
	public  void TearDown()
	{
		Base base = new Base();
		base.teardown(driver);
	}
}
