package main.java.view;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import main.java.container.StartPageContainer;
import main.java.utils.BrowserDriver;


public class StartView {
	private static final Logger LOGGER = Logger.getLogger(StartView.class.getName());
	
	private static final StartPageContainer startContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), StartPageContainer.class);

	public static void isDisplayed() {
		// TODO Auto-generated method stub
		LOGGER.info("Checking start page is displayed");
		
		if(BrowserDriver.getCurrentDriver().getTitle().contains("Mockup Landing"))
		{
			LOGGER.info("Start page is displayed");
		}
		else {
			LOGGER.info("Start page is not displayed");
		}
	} 
	
	public static void enterMovieTitle(String movieTitel) {
		LOGGER.info("Enter movie title:" + movieTitel + " in form");
		startContainer.movieTitleInput.sendKeys(movieTitel);
		
	}
 
	public static void submitForm() {
		startContainer.submitButton.click();
		LOGGER.info("Search soundtracks submitted");  
	}

	public static void findErrorMessage(String message) {
		LOGGER.info("Check errormessage exist");
		BrowserDriver.waitForElement(startContainer.errorMessage);	
		
	}
	 

	 
}
