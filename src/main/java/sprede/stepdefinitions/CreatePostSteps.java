package sprede.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CreatePostSteps extends StepDefinitionInit{
	
	@Given("user is on sprede website")
	public void user_is_on_sprede_website() throws Throwable {
		post.website();
	}	
	
	@When("user login on the website")
	public void user_login_on_the_website() throws Throwable {
	   post.Login();
	   
	}


	@Then("user enter text")
	public void user_enter_text() throws Throwable {
	   post.enterText();
	   
	}

	@And("user select Target Linking")
	public void user_select_target_linking() throws Throwable {
	   post.TargetLinking();
	   
	}

	@And("user select Event Linking")
	public void user_select_event_linking() throws Throwable {
	   post.EventLinking();
	   
	}


	@Then("click on Post button")
	public void click_on_post_button() throws Throwable {
	   post.CreatePost();
	   
	}


}
