package FirstTest;
import java.io.File;

import java.io.IOException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import com.google.common.io.Files;

public class test2  extends menu1{
	
	public static void capture (WebDriver Driver) throws IOException {
		
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("./+screenshot.png+"));
		//FileUtils.copyToDirectory(srcFile, new File("D:\\PIIT\\selenium\\screenshots"));
		}

		public static void main(String[] args) throws InterruptedException, IOException {
			// TODO Auto-generated method st
			
			cart c = new cart();
			menu1 m = new menu1();
			menu2 m2 = new menu2();
			
			System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.get("https://app.hubspot.com/login");
		    
			capture(driver);
			
			//WebElement element = driver.findElement(By.className("div.signup-link"));
			driver.findElement(By.xpath("//div[@class='signup-link']"));   //xpath
			driver.findElement(By.id("hs-login"));
			driver.findElement(By.cssSelector("div[class*='signup']"));  // contains
			driver.findElement(By.cssSelector("div[class='signup-link']")); 
			driver.findElement(By.cssSelector("div[class^='UIFormControl']")); // starting text signup
			driver.findElement(By.cssSelector("div[class$='bottom-4']")); // ending text signup
			driver.navigate().to("https://guide.blazemeter.com/hc/en-us/categories/201429665-Getting-Started");
			driver.findElements(By.cssSelector("#categories>li:first-of-type")); // first of list.
			driver.findElements(By.cssSelector("#categories>li:last-of-type"));  // last of the list 
			driver.findElements(By.cssSelector("#categories>li:nth-of-type(3)")); // looking for a specific index on the lst : 3 for example
			
			File srcFile2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(srcFile2, new File("./2.png"));
			
			capture(driver);
						
			driver.navigate().to("https://www.perfectvape.com/");
			Thread.sleep(2000);
			String handler = driver.getCurrentUrl();
			System.out.println(handler);
			
			driver.findElement(By.cssSelector("#ac-ag-accept-button-text")).click();
			Thread.sleep(2000);
			File srcFile3 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(srcFile3, new File("./3.png"));
			Thread.sleep(2000);
			WebElement element  = driver.findElement(By.cssSelector("img[class='header-logo-image']"));
			File srcFile4 = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
			Files.copy(srcFile4, new File("./4.png"));
			//Thread.sleep(2000);
			//driver.findElement(By.cssSelector("#menu > div > nav > ul:nth-child(2) > li:nth-child(3) > a"));
			
			JavascriptExecutor js = (JavascriptExecutor)driver;
			WebElement clickBtn = driver.findElement(By.cssSelector("#menu > div > nav > ul:nth-child(2) > li:nth-child(2) > a"));
			js.executeScript("arguments[0].click();", clickBtn);
			//clickBtn.click();
			driver.findElement(By.cssSelector("#menu > div > nav > ul:nth-child(2) > li:nth-child(2) > a")); 
			capture(driver);
            WebElement element2  = driver.findElement(By.cssSelector("#menu > div > nav > ul:nth-child(2) > li:nth-child(2) > a"));
            
			System.out.println(element2.getText());
			//Creating object of an Actions class
			Actions action = new Actions(driver);

			//Performing the mouse hover action on the target element.
		
			action.moveToElement(element2).build().perform();
			action.moveToElement(element2).release(element2);
            Thread.sleep(2000);
            //File srcFile5 = ((TakesScreenshot)element2).getScreenshotAs(OutputType.FILE);
			//Files.copy(srcFile5, new File("./5.png"));
			
			WebElement clickBtn2 = driver.findElement(By.cssSelector("#emthemesModez-verticalCategories-sidebar > ul > li:nth-child(5) > a")); 
			js.executeScript("arguments[0].click();", clickBtn2);
			action.moveByOffset(200, 200).release(clickBtn2);
			System.out.println(clickBtn2.getText());
			Thread.sleep(4000);
			driver.findElement(By.cssSelector("#topOfPage > div.body > div.container > div > main > div.papaSupermarket-categoryPage-description > p > img"));
			js.executeScript("window.scrollBy(0,250)", "");
			WebElement element3  = driver.findElement(By.cssSelector("img[class='__mce_add_custom__']"));
			File srcFile6 = ((TakesScreenshot)element3).getScreenshotAs(OutputType.FILE);
			//Thread.sleep(4000);
			Thread.sleep(2000);
			Files.copy(srcFile6, new File("./6.png"));
			capture(driver);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #limit"));
			//capture(driver);
			
			//WebElement clickBtn4  = driver.findElement(By.xpath("#limit > option:nth-child(2)"));
			//js.executeScript("arguments[0].click();", clickBtn4);
			//Thread.sleep(4000);
			//Thread.sleep(4000);
			
            
			Thread.sleep(2000);
			
			js.executeScript("window.scrollBy(0,400)", "");
			//WebElement clickBtn4 =driver.findElement(By.cssSelector("#form-select > option : nth-of-type(3)"));
			// #categories>li:nth-of-type(3
			//js.executeScript("arguments[0].click();", clickBtn4);
			
			Thread.sleep(2000);
			
			//m.menu();
			String handler1 = driver.getCurrentUrl();
			System.out.println(handler);
			
		    Thread.sleep(2000);	
		    js.executeScript("window.scrollBy(0,-400)", "");
			Thread.sleep(2000);
			String handler3 = driver.getCurrentUrl();
			System.out.println(handler3);
			driver.get(driver.getCurrentUrl());
			   
		    //m2.menu();
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,100)", "");
			WebElement x1 = driver.findElement(By.cssSelector("#emthemesModez-verticalCategories-sidebar > ul > li:nth-child(7) > a"));
			System.out.println(x1.getText());
			//Creating object of an Actions class
			Actions action2 = new Actions(driver);

			//Performing the mouse hover action on the target element.
		
			action2.moveToElement(x1).build().perform();
			Thread.sleep(5000);
			WebElement DadDrip =driver.findElement(By.cssSelector("#navPages-218-sidebar > li:nth-child(3) > a"));
			js.executeScript("arguments[0].click();", DadDrip);
			Thread.sleep(4000);
			capture(driver);
			Thread.sleep(4000);
			driver.navigate().back();
			
			action.moveToElement(x1).release(x1);
			
			js.executeScript("window.scrollBy(0,300)", "");
			js.executeScript("window.scrollBy(0,300)", "");
			Thread.sleep(4000);
			WebElement clickBtn6 = driver.findElement(By.linkText("Cloud Nurdz Disposables 3500 Puffs"));
			js.executeScript("arguments[0].click();", clickBtn6);
			for ( int y =0; y < 2; y++) {
				js.executeScript("window.scrollBy(0,200)", "");
				Thread.sleep(1000);
			}
			
			capture(driver);
			Thread.sleep(4000);
			js.executeScript("window.scrollBy(0,100)", "");
			js.executeScript("window.scrollBy(0,200)", "");
			capture(driver);
			WebElement clickBtn7 = driver.findElement(By.cssSelector("#topOfPage > div.body > div.container > div > main > div.productView-scope > div.productView.productView--full > div.productView-detailsWrapper > div.productView-beforeAlsoBought > section:nth-child(3) > div.productView-options.productView-options--1col > form.form.form--addToCart > div.emthemesModez-productView-optionsGrid > div > div > label:nth-child(3)"));
			js.executeScript("window.scrollBy(0,600)", "");
			js.executeScript("arguments[0].click();", clickBtn7);
			Thread.sleep(6000);
			WebElement clickBtn8 = driver.findElement(By.cssSelector("#topOfPage > div.body > div.container > div > main > div.productView-scope > div.productView.productView--full > div.productView-detailsWrapper > div.productView-beforeAlsoBought > section:nth-child(3) > div.productView-options.productView-options--1col > form.form.form--addToCart > div.form-field.form-field--increments > div > button:nth-child(3)"));
			js.executeScript("arguments[0].click();", clickBtn8);
			Thread.sleep(500);
			System.out.println("adding the items");
			for ( int i=0;i < 4; i++)
			{
	        js.executeScript("arguments[0].click();", clickBtn8);
			Thread.sleep(500);
			}
			capture(driver);
			driver.findElement(By.cssSelector("#form-action-addToCart")).click();
			capture(driver);
            System.out.println("add to card");
            driver.getWindowHandle();
            driver.switchTo().defaultContent();
            Thread.sleep(4000);
            System.out.println("checking cart");
            cart.checkcart();
			Thread.sleep(4000);
			 System.out.println("input name hype");
			driver.findElement(By.cssSelector("#search_query")).sendKeys("hyde");
			 System.out.println("click search ");
			driver.findElement(By.cssSelector("#search_query")).click(); 
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".emthemesModez-quickSearch:nth-child(3) .button")).click(); 
			Thread.sleep(2000);
			js.executeScript("window.scrollBy(0,300)", "");
			driver.findElement(By.cssSelector("div#search-results-heading")).getText();
			System.out.println(driver.findElement(By.cssSelector("div#search-results-heading")).getText());
			File srcFile7 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			Files.copy(srcFile7, new File("./7.png"));
			capture(driver);
			//m2.menu();
			//m.menu();
			int x =0;
			do {
				for ( int y =0; y < 35; y++) {
				js.executeScript("window.scrollBy(0,100)", "");
				Thread.sleep(200);
			}
			for ( int y =0; y < 35; y++) {
				js.executeScript("window.scrollBy(0,-100)", "");
				Thread.sleep(200);
			}
			x++;
			System.out.println("The loop is : " + x);
			} while (x < 2);

	
			Thread.sleep(4000);
			WebElement clickBtn9 =driver.findElement(By.cssSelector("span[class='navUser-item-loginLabel']")); 
			js.executeScript("arguments[0].click();", clickBtn9);
			Thread.sleep(1000);
			cart.checkcart();
			Thread.sleep(4000);
			driver.navigate().to("https://www.google.com/");
			Thread.sleep(2000);
			driver.navigate().back();
			driver.navigate().forward();
			
			driver.quit();
			System.out.println("ALL CLEAR");
			}	

		}

	


