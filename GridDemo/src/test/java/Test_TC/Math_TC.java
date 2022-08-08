package Test_TC;

import java.net.MalformedURLException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Test.base;
import Test_PO.Math_PO;


public class Math_TC extends base{
WebDriver driver;


     @BeforeMethod
     public void Setup() throws MalformedURLException
     {
	driver = InitializeBrowser("Chrome");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.get("https://www.calculator.net/");
    }
    @Test
    public void Test_Math() throws InterruptedException 
    {
	Math_PO Math = new Math_PO(driver);
	
	Math.links();
    }
    @AfterMethod
    public  void TearDown()
    { 
	driver.close();
	driver.quit();
	
}
}
