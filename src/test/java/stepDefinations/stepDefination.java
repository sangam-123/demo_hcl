package stepDefinations;

import cucumber.api.PendingException; 
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class stepDefination {

    @Given("^User is on NetBanking landing page$")
    public void user_is_on_netbanking_landing_page() throws Throwable {
        System.out.println("navigated to login url"); 
    }

    @When("^User login into application with \"(.*)\" and password \"(.*)\"$")
    public void user_login_into_application_with_and_password(String arg1, String arg2) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        //throw new PendingException();
    	System.out.println(arg1);
    	System.out.println(arg2);
    	
    }

    @Then("^Homepage is populated$")
    public void homepage_is_populated() throws Throwable {
    	  System.out.println("validated home page"); 
    }
    

    @Then("^Cards displayed are \"([^\"]*)\"$")
    public void cards_displayed_are(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
      System.out.println(arg1);
    }

}

	
