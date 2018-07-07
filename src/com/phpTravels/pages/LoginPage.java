package com.phpTravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

// this class will store 

@Test
public class LoginPage {
	WebDriver driver;
	By username = By.name("username");
	By password = By.xpath("/html/body/div[4]/div[1]/div[1]/form/div[1]/div[5]/div/div[2]/input");
	By SubmitButton = By.xpath("/html/body/div[4]/div[1]/div[1]/form/div[1]/div[5]/button");
	// Create a constructor
	// call this constructor from TCs
	// This constructor will initialize the WebDriver

	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	public void typeUserName(){
		driver.findElement(username).sendKeys("user@phptravels.com");
	}
	public void typePassword(){
		driver.findElement(password).sendKeys("demouser");
	}
	public void clickOnSubmitButton(){
		driver.findElement(SubmitButton).click();
	}
}
