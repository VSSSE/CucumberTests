package main.java.view;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import main.java.container.StartPageContainer;
import main.java.utils.BrowserDriver;


public class StartView {
	private static final Logger LOGGER = Logger.getLogger(StartView.class.getName());
	
	private static final StartPageContainer startContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), StartPageContainer.class);
	
	public static void isDisplayedCheck(){
		LOGGER.info("Checking start page is displayed");
		
		if(BrowserDriver.getCurrentDriver().getTitle().contains("Mockup Landing"))
		{
			LOGGER.info("Start page is displayed");
		}
		else {
			LOGGER.info("Start page is not displayed");
		}
		 
		//BrowserDriver.waitForElement(loginContainer.loginPageDiv);
		//startContainer.loginPageDiv.isDisplayed();
	}
	/*
	public static void login(String username, String password){
		LOGGER.info("Logging in with username:" + username + " password:" + password);
		loginContainer.usernameInput.sendKeys(username);
		loginContainer.passwordInput.sendKeys(password);
		loginContainer.submitButton.click();
		LOGGER.info("Login submitted");
	}
	
	public static void checkLoginSuccess(){
		LOGGER.info("Check login was successful");
		HomeView.isDisplayedCheck();	
	}
	
	public static void checkLoginErrors(){
		LOGGER.info("Check login errors displayed");
		BrowserDriver.waitForElement(loginContainer.getUsernameValidationDiv());
		BrowserDriver.waitForElement(loginContainer.getPasswordValidationDiv());
	}
	*/
}
