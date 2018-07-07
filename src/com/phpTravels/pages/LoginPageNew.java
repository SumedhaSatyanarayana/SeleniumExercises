package com.phpTravels.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class LoginPageNew {
	WebDriver driver;
	@FindBy(name = "username") WebElement username;
	@FindBy(how=How.NAME,using="password") WebElement password;
	@FindBy(how=How.XPATH,using="/html/body/div[4]/div[1]/div[1]/form/div[1]/div[5]/button") WebElement btn;
	
	public LoginPageNew(WebDriver driver) {
		this.driver=driver;
	}
	
  @Test
  public void login_php(String uname, String psw) {
	  username.sendKeys(uname);
	  password.sendKeys(psw);
	  btn.click();
  }
}
