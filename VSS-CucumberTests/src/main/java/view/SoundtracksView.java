package main.java.view;

import java.util.logging.Logger;

import org.openqa.selenium.support.PageFactory;

import main.java.container.SoundtracksPageContainer;
import main.java.utils.BrowserDriver;


public class SoundtracksView {
	private static final Logger LOGGER = Logger.getLogger(SoundtracksView.class.getName());
	
	private static final SoundtracksPageContainer soundtracksContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SoundtracksPageContainer.class);

	public static void isDisplayed() {
		// TODO Auto-generated method stub
		LOGGER.info("Checking soundtracks page is displayed");
		
		if(BrowserDriver.getCurrentDriver().getTitle().contains("Search Results for movie title"))
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

	public static void clickFirstListEntry() {
		LOGGER.info("Click on first list entry");
		BrowserDriver.waitForElement(soundtracksContainer.firstEntry);	
		soundtracksContainer.firstEntry.click();
	} 
	
	
	
}
