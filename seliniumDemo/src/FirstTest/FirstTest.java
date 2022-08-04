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

import com.google.common.io.Files;


public class FirstTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile, new File("./1.png"));
		
		
		WebElement element = driver.findElement(By.cssSelector(".lnXdpd"));
		
		File srcFile1 = ((TakesScreenshot)element).getScreenshotAs(OutputType.FILE);
		Files.copy(srcFile1, new File("./logo.png"));
		
		
//		JavascriptExecutor js = (JavascriptExecutor)driver;
//		WebElement luckyBtn = driver.findElement(By.name("btnI"));
//		js.executeScript("arguments[0].click();", luckyBtn);
//		luckyBtn.click();
//		
//		driver.navigate().to("https://automationstepbystep.com/");
		
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
//		driver.navigate().back();
//		Thread.sleep(2000);
//		driver.navigate().forward();
		
		Thread.sleep(2000);
		//driver.close();
	    driver.quit();
		
//		
			
		

	}

}
