package com.demo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;
	
	@FindBy(xpath = "//*[contains(text(),'Login')]")
	WebElement LoginButton;
	
	@FindBy(id = "user_email")
	WebElement UserEmailTextBox;
	
	@FindBy(id = "user_password")
	WebElement PasswordTextBox;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void logIn(String userEmail, String password) {
		LoginButton.click();
		UserEmailTextBox.sendKeys(userEmail);
		PasswordTextBox.sendKeys(password);
	}
}
