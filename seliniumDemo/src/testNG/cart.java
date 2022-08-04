package testNG;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;

public class cart {

	public static WebDriver driver;
	
	public static void checkcart() throws InterruptedException {
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		driver.findElement(By.cssSelector("#topOfPage > header > div.emthemesModez-header-userSection.emthemesModez-header-userSection--logo-left > div > nav > ul > li.navUser-item.navUser-item--cart > a > span.navUser-item-icon.navUser-item-cartIcon.emthemesModez-icon-linear-cart")).click();
		Thread.sleep(4000);
		
	}
}
