package net.calculator.tc;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import net.calculator.base;
import net.calculator.po.Fitness_PO;
import net.calculator.po.Main_Financial_PO;

public class Main_Financial_TC extends base{
	
	WebDriver driver;
	
	@SuppressWarnings("deprecation")
	@BeforeMethod
	public void Setup()
	{
		driver = setproperty();
		driver.get("https://www.calculator.net/financial-calculator.html");
		
	}
	@Test
	public void Test_all_Links() throws InterruptedException 
	{
		Main_Financial_PO all = new Main_Financial_PO(driver);
		
		all.links();
	}
	@AfterMethod
	public  void TearDown() 
	{
		driver.close();
		driver.quit();
		
	}
}

