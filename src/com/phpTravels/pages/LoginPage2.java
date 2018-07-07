package com.phpTravels.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

// this class will store 

@Test
public class LoginPage2 {
	WebDriver driver;
	By username = By.name("username");
	By password = By.xpath("/html/body/div[4]/div[1]/div[1]/form/div[1]/div[5]/div/div[2]/input");
	By SubmitButton = By.xpath("/html/body/div[4]/div[1]/div[1]/form/div[1]/div[5]/button");
	// Create a constructor
	// call this constructor from TCs
	// This constructor will initialize the WebDriver

	public LoginPage2(WebDriver driver) {
		this.driver=driver;
	}
	public void loginIn1Go(String hesaru, String pass ){
		driver.findElement(username).sendKeys(hesaru);
		driver.findElement(password).sendKeys(pass);
		driver.findElement(SubmitButton).click();
	}
	/*public void typeUserName(String USN){
		driver.findElement(username).sendKeys(USN);
	}
	public void typePassword(String PW){
		driver.findElement(password).sendKeys(PW);
	}
	public void clickOnSubmitButton(){
		driver.findElement(SubmitButton).click();
	}*/
}
