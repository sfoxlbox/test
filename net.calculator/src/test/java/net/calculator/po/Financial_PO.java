package net.calculator.po;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Financial_PO {
WebDriver driver;
	
	
	public Financial_PO (WebDriver driver) {  // creating constractor
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
		js.executeScript("window.scrollBy(0,400)", "");
		
		Thread.sleep(2000);
		for (int x =1; x<16;x++)
		{
		WebElement link = driver.findElement(By.xpath("//tbody/tr[1]/td[1]/ul[1]/li["+x+"]/a"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		Actions action = new Actions(driver);
		action.sendKeys(Keys.F5);
		action.sendKeys(Keys.F5);
		wait.until(ExpectedConditions.visibilityOf(link));
		link.getText();
		System.out.println("link is : "+link.getText());
		String text;
		switch (x) { 
		case 1 : text ="Mortgage Calculator";
		break;
		case 2 : text ="Loan Calculator";
		break;
		case 3 : text ="Auto Loan Calculator";
		break;
		case 4 : text ="Interest Calculator";
		break;
		case 5 : text ="Payment Calculator";
		break;
		case 6 : text ="Retirement Calculator";
		break;
		case 7 : text ="Amortization Calculator";
		break;
		case 8 : text ="Investment Calculator";
		break;
		case 9 : text ="Inflation Calculator";
		break;
		case 10 : text ="Finance Calculator";
		break;
		case 11 : text ="Income Tax Calculator";
		break; 
		case 12 : text ="Compound Interest Calculator";
		break;
		case 13 : text ="Salary Calculator";
		break;
		case 14 : text ="Interest Rate Calculator";
		break;
		case 15 : text ="Sales Tax Calculator";
		break;
		
		
		default: text = "fix";
		}
		Assert.assertEquals(link.getText(),text );
		if (link != null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			link.click();
		}else if (link == null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			action.moveToElement(link).build().perform();
			link.click();
		}
		System.out.println("link "+text+ " is verified");
		Thread.sleep(500);
		System.out.println("Title of the Page :"+Title2.getText());
		driver.navigate().back();
		Thread.sleep(500);
		}
	}
}
