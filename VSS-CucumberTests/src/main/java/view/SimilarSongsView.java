package main.java.view;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import main.java.container.SoundtracksPageContainer;
import main.java.container.StartPageContainer;
import main.java.utils.BrowserDriver;


public class SimilarSongsView {
	private static final Logger LOGGER = Logger.getLogger(SimilarSongsView.class.getName());
	
	private static final SoundtracksPageContainer soundtracksContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SoundtracksPageContainer.class);

	public static void isDisplayed() {
		// TODO Auto-generated method stub
		LOGGER.info("Checking soundtracks page is displayed");
		
		if(BrowserDriver.getCurrentDriver().getTitle().contains("Search Results for soundtrack"))
		{
			LOGGER.info("Soundtracks page is displayed");
		}
		else {
			LOGGER.info("Soundtracks page is not displayed");
		}
	}

	public static void Listexists() {
		LOGGER.info("Check soundtrackslist exist");
		BrowserDriver.waitForElement(soundtracksContainer.resultList);	
	} 
	
	
	
}
