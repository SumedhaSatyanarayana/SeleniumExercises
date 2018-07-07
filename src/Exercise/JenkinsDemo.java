package Exercise;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class JenkinsDemo {
  @Test
  public void f() {
	  WebDriver driver;
		System.setProperty("webdriver.gecko.driver", "J:\\eclipse\\geckodriver-v0.19.1-win64\\geckodriver.exe");
		driver = new FirefoxDriver();		
		//Thread.sleep(1000);
		driver.get("https://www.tutorialspoint.com/");
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div/div/form/input[2]")).sendKeys("Selenium");
		String ExpectedTitle = driver.getTitle();
		System.out.println("Title : "+ExpectedTitle);
  }
}
