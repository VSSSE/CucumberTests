package main.java.view;

import java.util.logging.Logger;

import main.java.container.SimilarSongsPageContainer;
import org.openqa.selenium.support.PageFactory;

import main.java.container.SoundtracksPageContainer;
import main.java.container.StartPageContainer;
import main.java.utils.BrowserDriver;


public class SimilarSongsView {
	private static final Logger LOGGER = Logger.getLogger(SimilarSongsView.class.getName());
	
	private static final SimilarSongsPageContainer similarSongsContainer = PageFactory.initElements(BrowserDriver.getCurrentDriver(), SimilarSongsPageContainer.class);

	public static void isDisplayed() {
		// TODO Auto-generated method stub
		LOGGER.info("Checking soundtracks page is displayed");
		//Here needs to be a wait routine
		if(BrowserDriver.getCurrentDriver().getTitle().contains("Search Results for soundtrack"))
		{
			LOGGER.info("Similar songs page is displayed");
		}
		else {
			LOGGER.info("Similar songs page is not displayed");
		}
	}

	public static void Listexists() {
		LOGGER.info("Check soundtrackslist exist");
		BrowserDriver.waitForElement(similarSongsContainer.resultList);
	} 
	
	
	
}
