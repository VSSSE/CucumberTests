package test.java;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/FirstTwo/",//path to the features
        format = {"json:target/integration_cucumber.json"},//what formatters to use
        tags = {"@similarsongs"})

public class LookUpSimilarSongsTest {

}
