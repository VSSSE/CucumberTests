package test.application;
 
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.*;

public class LookUpSimilarSongsStepDefinition {
    //private static WebDriver driver = null;

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

    
    @Given("^I see the soundtracks list for the movie \"([^\"]*)\"$")
    public void movie_soundtrack_was_found(String arg1){
    	fail("Not implemented");
    }

    @When("^I click on the first soundtrack$")
    public void user_presses_the_show_similar_songs_button() throws Throwable {
    	fail("Not implemented");

    }

    @Then("^I see a list of similar songs$")
    public void user_gets_the_list_of_similar_songs() throws Throwable {
    	fail("Not implemented");
    	
    }
 

}
