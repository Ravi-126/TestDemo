package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions
        (       features = "src/test/resources/webfeature",
                tags = "@regression",
                glue = "stepdefinition",
                plugin = {"pretty", "html:target/cucumber-reports/cucumber-html-report"}

        )

public class WebTestRunner{
}
