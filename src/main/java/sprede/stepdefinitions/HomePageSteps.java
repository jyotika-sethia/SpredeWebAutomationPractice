package sprede.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class HomePageSteps extends StepDefinitionInit {

	@Given("^user is on sprede home page$")
	public void user_is_on_sprede_home_page() throws Throwable {
	    Assert.assertTrue(homepage.verifyHomePage());
	}

	@When("^user clicks on login option$")
	public void user_clicks_on_login_option() throws Throwable {
	    homepage.clicksOnLoginOption();
	}

	@Then("^user verifies login screen$")
	public void user_verifies_login_screen() throws Throwable {
	   Assert.assertTrue(homepage.verifyLoginScreen());
	}

	@When("^user enters email$")
	public void user_enters_email() throws Throwable {
	    homepage.enterEmail();
	}

	@When("^user enters password$")
	public void user_enters_password() throws Throwable {
	    homepage.enterPassword();
	}

	@When("^clicks login option$")
	public void clicks_login_option() throws Throwable {
	    homepage.ClickOnloginToYourAccountButton();
	}

	@Then("^user verifies logged in vox page$")
	public void user_verifies_logged_in_vox_page() throws Throwable {
	   Assert.assertTrue(homepage.verifyLoggedInUserVoxPage());
	}
}
