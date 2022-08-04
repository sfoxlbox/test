package ebay.productAppDemo.po;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver; 
	
	public HomePage (WebDriver driver) {  // creating constractor
		this.driver = driver;            
		PageFactory.initElements(driver, this); //
	}
		@FindBy (how =How.XPATH, using= "//input[@placeholder='First Name']")
		WebElement firstname;
		// it is the same as  
		//WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		@FindBy (how =How.XPATH, using= "//input[@placeholder='Last Name']")
		WebElement lastname;
		// it is the same as  
		//WebElement Lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		
		@FindBy (how =How.XPATH, using= "//textarea[@ng-model='Adress']")
		WebElement address;
		// it is the same as  
		//WebElement Adress = driver.findElement(By.xpath("//textarea[@ng-model='Adress']"));
		
		@FindBy (how =How.XPATH, using= "//input[@ng-model='EmailAdress']")
		WebElement emailaddress;
		// it is the same as  
		//WebElement EmailAdress = driver.findElement(By.xpath("//input[@ng-model='EmailAdress']"));
		
		@FindBy (how =How.XPATH, using= "//input[@ng-model='Phone']")
		WebElement phone;
		// it is the same as  
		//WebElement Phone = driver.findElement(By.xpath("//input[@ng-model='Phone']"));
		
		@FindBy (how =How.XPATH, using= "//input[@ng-model='radiovalue' and @value='Male']")
		WebElement gender;
		// it is the same as  
		//WebElement Gender = driver.findElement(By.xpath("//input[@ng-model='radiovalue' and @value='Male']"));
		
		@FindBy (how =How.XPATH, using= "//input[@id='checkbox2']")
		WebElement hobbies;
		// it is the same as  
		//WebElement Hobbies = driver.findElement(By.xpath("//input[@id='checkbox2']"));
		
		@FindBy (how =How.XPATH, using= "//div[@id='msdd']")
		WebElement Languages;
		
		@FindBy (how =How.XPATH, using= "//select[@ng-model='Skill']")
		WebElement Skills;
		
		@FindBy (how =How.XPATH, using= "//option[@value='Adobe InDesign']")
		WebElement AdobeInDesign;
		
		public void hover ()
		{
			Actions action = new Actions(driver);
			action.moveByOffset(0, 0).click().build().perform();
		}
		
		public void SetFirstName ( String fName)
		{
			firstname.sendKeys(fName);
		}
		public void SetLastName ( String lName)
		{
			lastname.sendKeys(lName);
		}
		public void SetAddress ( String adrs)
		{
			address.sendKeys(adrs);
		}
		
		public void SetEmail ( String email)
		{
			emailaddress.sendKeys(email);
		}
		public void SetPhone ( String Phonenum)
		{
			phone.sendKeys(Phonenum);
		}
		public void SetGender ()
		{
			gender.click();
		}
		
		public void SetHobbies ()
		{
			hobbies.click();
		}
		
		public void SetLangauge ()
		{
			Languages.click();
			driver.findElement(By.linkText("English")).click();
		}
		public void Skills ()
		{
			Skills.clear();
			Skills.click();
		}
		
		public void AdobeInDesign ()
		{
			AdobeInDesign.click();
		}
		
	}
