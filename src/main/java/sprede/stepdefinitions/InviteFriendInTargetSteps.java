package sprede.stepdefinitions;

import java.awt.AWTException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InviteFriendInTargetSteps extends StepDefinitionInit{
	
	@Given("User log in into website")
	public void user_log_in_into_website() {
	   invite.login(); 
	   
	}

	@When("user click on target")
	public void user_click_on_target() throws InterruptedException {
	    invite.target_tab();
	   
	}

	@Then("user click on view more")
	public void user_click_on_view_more() throws InterruptedException{
	    invite.view_more();
	   
	}

	@And("user click on Edit Target")
	public void user_click_on_edit_target() throws InterruptedException{
	    invite.editTarget();
	   
	}

	@And("user click on + icon")
	public void user_click_on_icon() throws InterruptedException{
	    invite.plusIcon();
	   
	}

	@Then("user select friend")
	public void user_select_friend() throws AWTException, InterruptedException {
	    invite.selectFriend();
	   
	}

	@Then("user click on Update Target")
	public void user_click_on_update_target() throws InterruptedException{
	    invite.update_Target();
	   
	}

}
