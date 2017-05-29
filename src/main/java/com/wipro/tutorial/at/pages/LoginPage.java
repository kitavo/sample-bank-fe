package com.wipro.tutorial.at.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.wipro.tutorial.at.configuration.pageobjects.PageObject;

@PageObject
public class LoginPage extends AbstractPage {
	
	private final String LOGIN_URL = "http://localhost:8080/samplebank/index";
	
	@FindBy(how = How.ID, using = "username")
	private WebElement usernameInput;
	
	@FindBy(id = "password")
	private WebElement passwordInput;
		
	@FindBy(className = "sb-button")
	private WebElement loginBtn;
	
	public void navigateTo() {
		LOG.info("Navigating user to page: " + LOGIN_URL);
		webDriverProvider.get().get(LOGIN_URL);
	}
	
	public LoginPage username (String username) {
		LOG.info("Username: " + username);
		
		usernameInput.clear();
		usernameInput.sendKeys(username);
		
		return this;
	}
	
	public LoginPage password (String password) {
		LOG.info("Password: " + password);
		
		passwordInput.clear();
		passwordInput.sendKeys(password);
		
		return this;
	}
	
	public LoginPage clickLoginButton() {
		loginBtn.click();
		LOG.info("Clicked on Login button.");
		return this;
	}
}
