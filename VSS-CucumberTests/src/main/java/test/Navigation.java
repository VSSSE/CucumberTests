package main.java.test;

import main.java.constants.CredentialsType;
import main.java.constants.Outcome;
import main.java.utils.BrowserDriver;
import main.java.view.LoginView;

public class Navigation {
	private User user;

	public void given_I_navigate_to_the_mock_application(){
		BrowserDriver.loadPage("http://localhost/MockApplication/html/MockApplication.html");
		LoginView.isDisplayedCheck();
	}

	public void when_I_try_to_login(String credentialsType) {
		CredentialsType ct = CredentialsType.credentialsTypeForName(credentialsType);
		switch(ct){
			case VALID:
				user = Users.createValidUser();
			break;
			case INVALID:
				user = Users.createInvalidUser();
			break;
		}
		LoginView.login(user.getUsername(), user.getPassword());
	}
	
	public void then_I_login(String outcomeString){
		Outcome outcome = Outcome.outcomeForName(outcomeString);
		switch(outcome){
			case SUCCESS:
				LoginView.checkLoginSuccess();
			break;
			case FAILURE:
				LoginView.checkLoginErrors();
			break;
		}
	}
	

	public void given_I_see_the_soundtracks_list_for_the_movie(){
	}

	public void given_I_see_the_soundtracks_list_for_the_movie(String moviename) {
		// TODO Auto-generated method stub
		
	}

	public void when_I_click_on_the_first_soundtrack() {
		// TODO Auto-generated method stub
		
	}

	public void then_I_see_a_list_of_similar_songs() {
		// TODO Auto-generated method stub
		
	}

	public void given_I_m_at_the_start_page() {
		// TODO Auto-generated method stub
		
	}

	public void when_I_enter_a_movie_title(String movietitle) {
		// TODO Auto-generated method stub
		
	}

	public void and_I_press_the_search_soundtracks_button() {
		// TODO Auto-generated method stub
		
	}

	public void then_I_get_a_list_of_soundtracks() {
		// TODO Auto-generated method stub
		
	}

	public void then_I_see_the_message(String message) {
		// TODO Auto-generated method stub
		
	}
}
