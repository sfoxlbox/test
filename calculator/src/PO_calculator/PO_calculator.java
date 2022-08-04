package PO_calculator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class PO_calculator {
	WebDriver driver; 
	public int x,y,z;
	
	// x = row
	// y = coloms
	// z = position
	
	public PO_calculator (WebDriver driver) {  // creating constractor
	this.driver = driver;            
	PageFactory.initElements(driver, this); //
	}
	
	@FindBy (how =How.XPATH, using= "//tbody/tr[2]/td[1]/div[1]/div[4]/span[5]")
	WebElement Home_Price;
	
	//@FindBy (how =How.XPATH, using= "//tbody/tr[2]/td["+x+"]/div[1]/div["+y+"]/span["+y+"]")
	//WebElement Home_Pric;
		
	public void Home_Price2(int x,int y,int z) throws InterruptedException
	{
		
		WebElement Home_Pric = driver.findElement(By.xpath("//tbody/tr[2]/td["+x+"]/div[1]/div["+y+"]/span["+z+"]"));
		Home_Pric.click();
		System.out.println(Home_Pric.getText());
		Thread.sleep(1000);
	}
	public void Home_Price()
	{
		Home_Price.getText();
		System.out.println(Home_Price.getText());
	}
}