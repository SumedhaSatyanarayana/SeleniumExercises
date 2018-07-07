package com.thpTravels.TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.phpTravels.pages.LoginPageNew;

import Helper.BrowserFactory;

public class VerifyLoginToPHP {
  @Test
  public void checkValidUser() {
	  // This will launch browser and specific url
	  WebDriver driver= BrowserFactory.start_brow("chrome", "http://www.phptravels.net/login");
	  // Created page object using page factory
	  LoginPageNew lgn_pg = PageFactory.initElements(driver, LoginPageNew.class);
	  // call the method
	  lgn_pg.login_php("user@phptravels.com", "demouser");
  }
}
