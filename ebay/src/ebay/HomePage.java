package ebay;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// ***************************************************************************************
// *********************** creating page object elements *********************************
// ***************************************************************************************

public class HomePage {

	WebDriver driver;
	 // create constractor
	 public HomePage(WebDriver driver) 
	 {
		this.driver = driver;
	 }
	 
	 By search = By.id("gh-ac");
	 By categories = By.id("gh-cat");
	 By searchbotton = By.id("gh-btn");
	 
	 
	 public void typesearch(String product) {
		 
		 driver.findElement(search).click();
		 driver.findElement(search).clear();
		 driver.findElement(search).sendKeys(product);
	 }
     public void clickbotton() {
		 
		 driver.findElement(searchbotton).click();
		 
	 }
     public void selectcategories(String cgory) {
		 
		 driver.findElement(categories).sendKeys(cgory);
		 
	 }
}
