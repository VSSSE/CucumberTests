package test.application;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.application.*;

public class LookUpSoundtracksStepDefinitions {
    public static WebDriver driver = null;

    @Before
    public void setup() {
        System.setProperty("webdriver.gecko.driver", "./geckodriver.exe");
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @After
    public void cleanup() {
        driver.close();
    }

    @Given("^User is on the start page$")
    public void user_is_on_start_page() throws Throwable {
        // TODO
    }

    @When("^User enters a movie title$")
    public void user_enters_a_movie_title(String arg1) throws Throwable {
        // TODO
    }

    @And("^User presses the search button$")
    public void user_presses_the_search_button() {

    }

    @And("^Soundtracks were not found in the database$")
    public void not_found(){
        
    }
    @And("^Soundtracks were found in the database$")
    public void found(){
        
    }

    @Then("^User gets the list of songs$")
    public void user_gets_the_list_of_songs() throws Throwable {
        // TODO
    }

}
