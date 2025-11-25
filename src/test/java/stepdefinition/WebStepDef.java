package stepdefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class WebStepDef {

    @When("the age restriction pop-up is displayed")
    public void the_age_restriction_pop_up_is_displayed() {
        System.out.println("step1");
    }

    @Then("the user clicks on {string} on the age restriction pop-up")
    public void the_user_clicks_on_on_the_age_restriction_pop_up(String string) {

    }

    @Then("the login page is displayed")
    public void the_login_page_is_displayed() {

    }

    @When("the user enters valid username and password")
    public void the_user_enters_valid_username_and_password() {

    }

    @When("the user clicks on the Login button")
    public void the_user_clicks_on_the_login_button() {

    }

    @Then("the user should be successfully logged in")
    public void the_user_should_be_successfully_logged_in() {

    }

    @Then("the user should see the home page")
    public void the_user_should_see_the_home_page() {

    }

}
