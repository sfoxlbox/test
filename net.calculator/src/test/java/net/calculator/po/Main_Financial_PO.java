package net.calculator.po;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.html.HTMLLinkElement;

import net.calculator.base;

public class Main_Financial_PO extends base{

WebDriver driver; 
	
	public Main_Financial_PO(WebDriver driver) {  // creating constractor
		this.driver = driver;            
		PageFactory.initElements(driver, this); 
	}
		@FindBy (how =How.XPATH, using= "/html[1]/body[1]/div[3]/div[1]/h1[1]")
		WebElement Title2;
		
		
		
		@SuppressWarnings("unused")
		public void links() throws InterruptedException
		{
			System.out.println(driver.getTitle());
			JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("window.scrollBy(0,200)", "");
			Thread.sleep(500);
			Actions action = new Actions(driver);
			
			for (int x =1; x<30;x++)
			{
				try{
			    
				driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10)); 
				WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div["+x+"]/a[1]"));
				System.out.println("link is : "+link.getText());
				js.executeScript("window.scrollBy(0,100)", "");
				Thread.sleep(800);
				action.moveToElement(link).build().perform();
				wait.getClass();
				Thread.sleep(800);
				if (link != null) {
					driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
					link.click();
				}else if (link == null) {
					driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
					action.moveToElement(link).build().perform();
					link.click();
				}
				Thread.sleep(500);
				driver.get("https://www.calculator.net/financial-calculator.html");
				
				
				
            }
			
			
	        catch ( Exception e) {
	        	driver.close();
	        	driver = setproperty();
	        	driver.get("https://www.calculator.net/financial-calculator.html");
	        	
	        	Thread.sleep(1000);
	        	
	        	}}
			js.executeScript("window.scrollBy(0,-500)", "");
			for (int x =1; x<34;x++)
			{
			WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[2]/div["+x+"]/a[1]"));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
			link.getText();
			action.sendKeys(Keys.F5);
			action.sendKeys(Keys.F5);
			Thread.sleep(500);
			wait.until(ExpectedConditions.visibilityOf(link));
			System.out.println("link is : "+link.getText());
			js.executeScript("window.scrollBy(0,100)", "");
			if (link != null) {
				link.click();
			}else if (link == null) {
				action.sendKeys(Keys.F5);
				link.click();
			}
			Thread.sleep(500);
			driver.navigate().back();
			Thread.sleep(500);
			
			
            }
			}
		}
