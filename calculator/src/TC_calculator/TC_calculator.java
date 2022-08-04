package TC_calculator;

	import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

import PO_calculator.PO_calculator;
import homepage.base;


 public class TC_calculator extends base{

		WebDriver driver;
		
		@BeforeMethod
		public void Setup()
		{
			driver = setproperty();
			driver.get("https://www.calculator.net/");
		}
		@Test
		public void Test_location() throws InterruptedException 
		{
			PO_calculator poc = new PO_calculator(driver);
			
			poc.Home_Price2(2,3,1);	
			poc.Home_Price2(2,3,2);	
			poc.Home_Price2(2,1,4);	
			poc.Home_Price2(2,2,3);	
			poc.Home_Price2(2,5,4);	
			poc.Home_Price2(1,3,2);	
			poc.Home_Price2(1,3,3);	
			poc.Home_Price2(1,4,1);
			poc.Home_Price2(2,3,2);
			poc.Home_Price2(2,1,4);	
			poc.Home_Price2(1,1,1);	
			poc.Home_Price2(2,2,1);	
			poc.Home_Price2(2,2,2);	
			
		}
		@AfterMethod
		public  void TearDown()
		{
			driver.close();
			driver.quit();
			
		}
		
	}

