package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class Loginsteps {
    @Given("user is on Landing page")
    public void user_is_on_landing_page() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Landing page");
        //throw new io.cucumber.java.PendingException();
    }

    @When("^user login to application with (.+) and (.+)$")
    public void user_login_to_application_with_and(String string, String string2) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("logged in as"+string);
        //throw new io.cucumber.java.PendingException();
    }

    @Then("application Home page displayed")
    public void application_home_page_displayed() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Home page displayed");
        //throw new io.cucumber.java.PendingException();
    }

    @Then("username displayed on toolbar")
    public void username_displayed_on_toolbar() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("username displayed");
        //throw new io.cucumber.java.PendingException();
        //throw new ArithmeticException("/ by zero");
    }
    @When("user login with {string} and {string}")
    public void user_is_on_login_with_and(String username, String password) {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("logged in with "+username+" & "+ password);
        //throw new io.cucumber.java.PendingException();
    }

    @When("user entered the details to register")
    public void user_entered_the_details_to_register(List<String> data) {
        // Write code here that turns the phrase above into concrete actions
        // For automatic transformation, change DataTable to one of
        // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
        // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
        // Double, Byte, Short, Long, BigInteger or BigDecimal.
        //
        // For other transformations you can register a DataTableType.
        System.out.println(data.get(0));
        System.out.println(data.get(1));
        System.out.println(data.get(2));
        System.out.println(data.get(3));
        System.out.println(data.get(4));
        //throw new io.cucumber.java.PendingException();
    }
    @Given("user is on already exists")
    public void user_is_on_already_exists() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("verified the DB status")
    public void verified_the_db_status() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
