package stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {

    @Given("user is at login page")
    public void user_is_at_login_page() {
        System.out.println("Navigate to login page");
    }


    @When("user enters username")
    public void user_enters_username() {
        System.out.println("entering username");
    }

    @When("user enters password")
    public void user_enters_password() {
        System.out.println("Entering password");
    }

    @When("user click on login button")
    public void user_click_on_login_button() {
        System.out.println("Clicking on login button");
    }

    @Then("user redirects to home page")
    public void user_redirects_to_home_page() {
        System.out.println("Validating on Home page");
    }


}
