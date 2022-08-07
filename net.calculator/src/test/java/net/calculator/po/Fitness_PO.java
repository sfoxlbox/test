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
import org.testng.Assert;

public class Fitness_PO {

	WebDriver driver;
	
	
	public Fitness_PO (WebDriver driver) {  // creating constractor
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
		Actions action = new Actions(driver);
		for (int x =1; x<10;x++)
		{
		WebElement link = driver.findElement(By.xpath("//table[1]/tbody[1]/tr[1]/td[2]/ul[1]/li["+x+"]/a"));
		link.getText();
		System.out.println("link is : "+link.getText());
		
		String text;
		switch (x) {
		case 1 : text ="BMI Calculator";
		break; 
		case 2 : text ="Calorie Calculator";
		break;
		case 3 : text ="Body Fat Calculator";
		break;
		case 4 : text ="BMR Calculator";
		break;
		case 5 : text ="Ideal Weight Calculator";
		break;
		case 6 : text ="Pace Calculator";
		break;
		case 7 : text ="Pregnancy Calculator";
		break;
		case 8 : text ="Pregnancy Conception Calculator";
		break;
		case 9 : text ="Due Date Calculator";
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
		System.out.println("link "+text+ " is Verified");
		Thread.sleep(500);
		System.out.println("Title of the Page :"+Title2.getText());
		System.out.println(text);
		driver.navigate().back();
		Thread.sleep(500);
		}
		
	}

}
