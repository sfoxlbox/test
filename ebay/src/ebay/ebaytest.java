package ebay;

import java.io.File;

//import java.io.File;

import java.io.IOException;
//import java.util.ArrayList;
//import java.util.List;
import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.io.Files;

import org.apache.commons.io.FileUtils;
//import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.OutputType;
//import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

//import com.google.common.io.Files;

public class ebaytest {
	
	public static WebDriver driver;
	
public static void capture() throws IOException {
		
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyToDirectory(srcFile, new File("C:\\ebay\\screenshots"));
		System.out.println(srcFile);
		}
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method st
		    
			System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://www.ebay.com/");
			Thread.sleep(400);
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofMillis(10));
			
			String mainwindow = driver.getCurrentUrl();
			
			WebElement Electronics = driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > a"));
			System.out.println(Electronics.getText());
			Actions action = new Actions(driver);
			action.moveToElement(Electronics).build().perform();
			Thread.sleep(1000);
			WebElement one = driver.findElement(By.cssSelector("#mainContent > div.hl-cat-nav > ul > li:nth-child(4) > div.hl-cat-nav__flyout > div.hl-cat-nav__sub-cats > nav:nth-child(1) > ul > li:nth-child(2) > a"));
			System.out.println(one.getText());
			js.executeScript("arguments[0].click();", one);
			capture();
			driver.navigate().back();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#gh-ac")));
			WebElement two = driver.findElement(By.cssSelector("#gh-ac"));
			two.click();
			System.out.println(two.getText());
			two.sendKeys("watch");

			driver.findElement(By.id("gh-btn")).click();
			Thread.sleep(1000);
			for ( int y =0; y < 5; y++) {
				js.executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(500);
			
			}
			capture();
			String btn4 = driver.getWindowHandle();
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#srp-river-results > ul > li:nth-child(7) > div > div.s-item__image-section > div > a > div")));
			WebElement btn3 =driver.findElement(By.cssSelector("#srp-river-results > ul > li:nth-child(7) > div > div.s-item__image-section > div > a > div"));
			
			action.moveToElement(btn3).click().perform();
			String btn5 = driver.getWindowHandle();
			Thread.sleep(5000);
			
			driver.switchTo().window(btn4);
			capture();
			Thread.sleep(5000);
			driver.switchTo().window(btn5);
			js.executeScript("window.scrollBy(0,-4000)", "");
			Thread.sleep(5000);
			WebElement DropDownElement = driver.findElement(By.cssSelector("#gh-cat"));
			DropDownElement.click();
			Select menu = new Select(DropDownElement);
			
			menu.selectByVisibleText("Collectibles");
			Thread.sleep(5000);
			driver.findElement(By.id("gh-btn")).click();
			Thread.sleep(5000);
			capture();
			WebElement ebay = driver.findElement(By.cssSelector("#gh-eb-My > div > a.gh-eb-li-a.gh-rvi-menu"));
			System.out.println(ebay.getText());
			action.moveToElement(ebay).build().perform();
			Thread.sleep(2000);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("gh_buyagain")));
			driver.findElement(By.id("gh_buyagain")).click();
			
			Thread.sleep(5000);
			driver.get(mainwindow);
			Thread.sleep(5000);
			//driver.switchTo().newWindow(WindowType.WINDOW).navigate().to(mainwindow);
			driver.switchTo().newWindow(WindowType.TAB);
			Thread.sleep(5000);
			driver.quit();
			
			
			
			
		    
			
	}}