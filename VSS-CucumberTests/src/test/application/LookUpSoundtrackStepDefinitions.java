package test.application;


import static org.junit.Assert.fail;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LookUpSoundtrackStepDefinitions {
   // public static WebDriver driver = null;

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
    	fail("Not implemented");
    }

    @When("^I enter a movie title \"([^\"]*)\"$")
    public void user_enters_a_movie_title(String arg1) throws Throwable {
        // TODO
    	fail("Not implemented");
    }

    @And("^I press the search soundtracks button$")
    public void user_presses_the_soundtracks_search_button() throws Throwable {
    	fail("Not implemented");

    }
 
    @Then("^I get a list of soundtracks$")
    public void user_gets_the_list_of_songs() throws Throwable {
        // TODO
    	fail("Not implemented");
    }

    @Then("^I see the message \"([^\"]*)\"$")
    public void user_sees_a_message(String arg1) throws Throwable {
        // TODO
    	fail("Not implemented");
    }
    
    

}
