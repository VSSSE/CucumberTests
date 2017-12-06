package test.java;


import static org.junit.Assert.fail;

import java.util.logging.Logger;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefs {
   // public static WebDriver driver = null;
   private static final Logger LOGGER = Logger.getLogger(StepDefs.class.getName());


    @Before
    public void setup() {
        //System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        //driver = new FirefoxDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanup() {
        //driver.close();
    }

    @Given("^I'm at the start page$")
    public void user_is_on_start_page() {
        // TODO
    	LOGGER.info("Entering: I'm at the start page");
    }


    @When("^I enter a movie title \"([^\"]*)\"$")
    public void user_enters_a_movie_title(String arg1) throws Throwable {
        // TODO
    	LOGGER.info("Entering: I enter a movie title '"
    			+ arg1 + "'");
    }

    @And("^I press the search soundtracks button$")
    public void user_presses_the_soundtracks_search_button() throws Throwable {

    	LOGGER.info("Entering: I press the search soundtracks button");

    }

    @Then("^I get a list of soundtracks$")
    public void user_gets_the_list_of_songs() throws Throwable {
        // TODO
    	LOGGER.info("Entering: I get a list of soundtracks");
    }

    @Then("^I see the message \"([^\"]*)\"$")
    public void user_sees_a_message(String arg1) throws Throwable {
        // TODO
    	LOGGER.info("Entering: I see the message '" 
    			+ arg1 + "'");
    }

    @Given("^I see the soundtracks list for the movie \"([^\"]*)\"$")
    public void movie_soundtrack_was_found(String arg1){

    	LOGGER.info("Entering: I see the soundtracks list for the movie '" 
    			+ arg1 + "'");

    }

    @When("^I click on the first soundtrack$")
    public void user_presses_the_show_similar_songs_button() throws Throwable {

    	LOGGER.info("Entering: I click on the first soundtrack");

    }

    @Then("^I see a list of similar songs$")
    public void user_gets_the_list_of_similar_songs() throws Throwable {

    	LOGGER.info("Entering: I see a list of similar songs");

    }

}
