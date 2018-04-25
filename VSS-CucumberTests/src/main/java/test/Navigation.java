package main.java.test;
 
import org.apache.commons.text.similarity.SimilarityScore;

import main.java.utils.BrowserDriver;
import main.java.view.SimilarSongsView;
import main.java.view.SoundtracksView;
import main.java.view.StartView; 

public class Navigation {


	

	public void given_I_see_the_soundtracks_list_for_the_movie(String moviename) {
		given_I_m_at_the_start_page();
		when_I_enter_a_movie_title(moviename);
		and_I_press_the_search_soundtracks_button();
		then_I_get_a_list_of_soundtracks();
	}

	public void when_I_click_on_the_first_soundtrack() {
		SoundtracksView.clickFirstListEntry();
	}

	public void then_I_see_a_list_of_similar_songs() {
		SimilarSongsView.isDisplayed();
		SimilarSongsView.Listexists();
	}

	public void given_I_m_at_the_start_page() {
		BrowserDriver.loadPage("https://it18-webeng1.dhbw-stuttgart.de/");
		StartView.isDisplayed();
	}

	public void when_I_enter_a_movie_title(String movietitle) {
		StartView.enterMovieTitle(movietitle); 
	}

	public void and_I_press_the_search_soundtracks_button() {
		StartView.submitForm(); 
	}

	public void then_I_get_a_list_of_soundtracks() { 
		SoundtracksView.isDisplayed();
		SoundtracksView.Listexists();
	}

	public void then_I_see_the_message(String message) {
		StartView.findErrorMessage(message); 
	}
}
