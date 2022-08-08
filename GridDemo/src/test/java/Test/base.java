package Test;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;


public class base {

	WebDriver driver;
		
	public WebDriver InitializeBrowser(String BrowserName) throws MalformedURLException  {
		DesiredCapabilities Browser = new DesiredCapabilities();
		
		if (BrowserName.equals("Chrome")) {
			Browser.setBrowserName("Chrome");
			Browser.setPlatform(Platform.WIN11);
			
		}else if (BrowserName.equals("firefox")) {
			Browser.setBrowserName("firefox");
			Browser.setPlatform(Platform.WIN11);
		}
	driver = new RemoteWebDriver(new URL("http://192.168.214.1:4444"), Browser);
	return driver;
	}
	

}
