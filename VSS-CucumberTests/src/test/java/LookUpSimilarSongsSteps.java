package test.java;



import java.util.logging.Logger;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import main.java.test.NaviagtorFactory;

public class LookUpSimilarSongsSteps {
   // public static WebDriver driver = null;
   private static final Logger LOGGER = Logger.getLogger(LookUpSimilarSongsSteps.class.getName());

   @Given("^I see the soundtracks list for the movie \"([^\"]*)\"$")
   public void given_I_see_the_soundtracks_list_for_the_movie(String moviename){

   	LOGGER.info("Entering: I see the soundtracks list for the movie '" 
   			+ moviename + "'");
	NaviagtorFactory.getNavigator().given_I_see_the_soundtracks_list_for_the_movie(moviename);

   }

   @When("^I click on the first soundtrack$")
   public void when_I_click_on_the_first_soundtrack() throws Throwable {

   	LOGGER.info("Entering: I click on the first soundtrack");
	NaviagtorFactory.getNavigator().when_I_click_on_the_first_soundtrack();

   }

   @Then("^I see a list of similar songs$")
   public void then_I_see_a_list_of_similar_songs() throws Throwable {

   	LOGGER.info("Entering: I see a list of similar songs");
	NaviagtorFactory.getNavigator().then_I_see_a_list_of_similar_songs();

   }

}
