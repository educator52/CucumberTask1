package steps;

import cucumber.api.java.en.*;

public class Task1 {

    @Given("^I want to print to console$")
    public void i_want_to_print_to_console() throws Exception {
        System.out.println("I want to print to console");
    }

    @When("^I print to console$")
    public void i_print_to_console() throws Exception {
        System.out.println("I print to console");
    }

    @Then("^I get text in console$")
    public void i_get_text_in_console() throws Exception {
        System.out.println("I get text in console");
    }
}
