package test.application;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import static org.junit.Assert.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import test.application.*;

public class LookUpSimilarSoungsStepDefinition {
    private static WebDriver driver = null;

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

    @Given("^Movie soundtracks were found$")
    public void movie_soundtracks_were_found(){
       
        
    }

    @When("^User presses the show similar songs button$")
    public void user_presses_the_show_similar_songs_button() throws Throwable {

    }

    @Then("^User gets a list of similar songs$")
    public List<String> user_gets_the_list_of_similar_songs(List<String> args1) throws Throwable {
        List<String> similarSongs = new ArrayList<String>();
        return similarSongs;

    }

    @Then("^User gets the message$")
    public void user_gets_the_message() throws Throwable {

    }

}
