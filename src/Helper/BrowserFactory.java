package Helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {
	static WebDriver driver;
	public static WebDriver start_brow (String browser, String url){
		if (browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "J:\\eclipse\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();		
		}
		else if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "J:\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "J:\\IEDriverServer_x64_3.7.0\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		else{
			System.setProperty("webdriver.gecko.driver", "J:\\eclipse\\geckodriver-v0.19.1-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		driver.get(url);
		return driver; 
	}
	

}
