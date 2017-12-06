package test.java;
import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/Resources/FirstTwo/",//path to the features
        format = {"json:target/integration_cucumber.json"},//what formatters to use
        tags = {"@run"})

public class CucumberRunner {



}
