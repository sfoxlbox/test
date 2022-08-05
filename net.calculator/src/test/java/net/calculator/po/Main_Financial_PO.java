package net.calculator.po;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Main_Financial_PO {

WebDriver driver; 
	
	public Main_Financial_PO(WebDriver driver) {  // creating constractor
		this.driver = driver;            
		PageFactory.initElements(driver, this); 
	}
		@FindBy (how =How.XPATH, using= "/html[1]/body[1]/div[3]/div[1]/h1[1]")
		WebElement Title2;
		
		
		
		public void links() throws InterruptedException
		{
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(500);

			
			for (int x =1; x<30;x++)
			{
			WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div["+x+"]/a[1]"));
			Thread.sleep(2000);
			Actions action = new Actions(driver);
			action.moveToElement(link).perform();
			
			link.getText();
			System.out.println("link is : "+link.getText());
			link.click();
			Thread.sleep(500);
			driver.navigate().back();
			Thread.sleep(1000);
			
            }
			for (int x =1; x<34;x++)
			{
			WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div["+x+"]/a[1]"));
			link.getText();
			System.out.println("link is : "+link.getText());
			link.click();
			Thread.sleep(500);
			driver.navigate().back();
			Thread.sleep(2000);
			driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.MINUTES);
            }
			}
		}
