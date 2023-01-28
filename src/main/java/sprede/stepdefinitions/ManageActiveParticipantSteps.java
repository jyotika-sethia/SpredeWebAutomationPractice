package sprede.stepdefinitions;

import java.awt.AWTException;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ManageActiveParticipantSteps extends StepDefinitionInit{
	
	@Given("User logs into the website")
	public void user_logs_into_the_website() throws InterruptedException {
		manageActive.Login();  
	    
	}

	@When("user clicks on event tab")
	public void user_clicks_on_event_tab() {
	   manageActive.event_Tab();
	    
	}

	@Then("user goes to View Event under My Events")
	public void user_goes_to_view_event_under_my_events() throws InterruptedException {
	   manageActive.viewEvent();
	    
	}

	@And("user click on Manage Participant")
	public void user_click_on_manage_participant() {
	   manageActive.manage_Participant();
	    
	}

	@Then("user block an active participant")
	public void user_block_an_active_participant() throws InterruptedException, AWTException {
	   manageActive.blockButton();
	    
	}

	@Then("user verifies the blocked participant")
	public void user_verifies_the_blocked_participant() {

		manageActive.blockedTab();
		String expected="Tapu T";
		String actual=manageActive.verify();
		Assert.assertEquals("Friend addes to Friend List",expected, actual);
	   Assert.assertEquals("Tapu T",manageActive.verify());   
	}

}
