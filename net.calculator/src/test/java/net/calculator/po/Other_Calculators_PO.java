package net.calculator.po;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Other_Calculators_PO {
WebDriver driver;
	
	
	public Other_Calculators_PO (WebDriver driver) {  // creating constractor
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
		Actions action = new Actions(driver);
		js.executeScript("window.scrollBy(0,400)", "");
		for (int x =1; x<11;x++)
		{
		WebElement link = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[4]/ul[1]/li["+x+"]/a"));
		link.getText();
		System.out.println("link is : "+link.getText());
		if (link != null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			link.click();
		}else if (link == null) {
			driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
			action.moveToElement(link).build().perform();
			link.click();
		}
		System.out.println("link "+x+ " is displayed");
		Thread.sleep(500);
		System.out.println("Title of the Page :"+Title2.getText());
		driver.navigate().back();
		Thread.sleep(500);
		}
	} 
}
