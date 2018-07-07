package com.thpTravels.TestCases;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.phpTravels.pages.LoginPage2;

public class VerifyLogin2 {
  @Test
  public void verifyValidLogin() {
	  System.setProperty("webdriver.gecko.driver", "J:\\eclipse\\geckodriver-v0.19.1-win64\\geckodriver.exe");
	  WebDriver driver = new FirefoxDriver();
	  driver.manage().window().maximize();
	  driver.get("http://www.phptravels.net/login");
	  // time to login 
	  // So call it
	  LoginPage2 login = new LoginPage2(driver);
	  login.loginIn1Go("user@phptravels.com", "demouser");
	  //login.typeUserName("user@phptravels.com");
	  //login.typePassword("demouser");
	  //login.clickOnSubmitButton();
	  System.out.println("success");
	  //driver.close();
  }
}
