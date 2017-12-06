package test.java;


import java.util.logging.Logger;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.test.NaviagtorFactory;

public class LookUpSoundtracksSteps {
   // public static WebDriver driver = null;
   private static final Logger LOGGER = Logger.getLogger(LookUpSoundtracksSteps.class.getName());


    @Given("^I'm at the start page$")
    public void given_I_m_at_the_start_page() {
        // TODO
    	LOGGER.info("Entering: I'm at the start page");
    	NaviagtorFactory.getNavigator().given_I_m_at_the_start_page();
    }


    @When("^I enter a movie title \"([^\"]*)\"$")
    public void when_I_enter_a_movie_title(String movietitle) throws Throwable {
    	LOGGER.info("Entering: I enter a movie title '"
    			+ movietitle + "'");
		NaviagtorFactory.getNavigator().when_I_enter_a_movie_title(movietitle);
    }

    @And("^I press the search soundtracks button$")
    public void and_I_press_the_search_soundtracks_button() throws Throwable {

    	LOGGER.info("Entering: I press the search soundtracks button");
		NaviagtorFactory.getNavigator().and_I_press_the_search_soundtracks_button();

    }

    @Then("^I get a list of soundtracks$")
    public void then_I_get_a_list_of_soundtracks() throws Throwable {
        // TODO
    	LOGGER.info("Entering: I get a list of soundtracks");
		NaviagtorFactory.getNavigator().then_I_get_a_list_of_soundtracks();
    }

    @Then("^I see the message \"([^\"]*)\"$")
    public void then_I_see_the_message(String message) throws Throwable {
        // TODO
    	LOGGER.info("Entering: I see the message '" 
    			+ message + "'");
		NaviagtorFactory.getNavigator().then_I_see_the_message(message);
    }


}
