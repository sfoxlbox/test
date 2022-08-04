package testNG;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;



public class menu2 extends cart{
	

	
	public  void menu() throws InterruptedException {
		
		 final	JavascriptExecutor js = (JavascriptExecutor)driver;
		
		//System.setProperty("webdriver.chrome.driver", "C://Dev_Tools//chromedriver_win32//chromedriver.exe");
	
			WebElement clickBtn5 = driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort"));
			js.executeScript("arguments[0].click();", clickBtn5);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort > option:nth-child(1)")).click();
			
			System.out.println();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort")).click();
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort > option:nth-child(2)")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort")).click();
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort > option:nth-child(3)")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort")).click();
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort > option:nth-child(4)")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort")).click();
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort > option:nth-child(5)")).click();
			Thread.sleep(2000);
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort")).click();
			driver.findElement(By.cssSelector(".emthemesModez-productsFilter:nth-child(1) > #emthemesModez-productsFilter-form #sort > option:nth-child(6)")).click();
			
}
}

