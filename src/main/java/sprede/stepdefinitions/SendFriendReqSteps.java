package sprede.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SendFriendReqSteps extends StepDefinitionInit{
	
	@Given("user goes to sprede website")
	public void user_goes_to_sprede_website() {
	   sendrequest.website();
	  
	}

	@When("user login on to the website")
	public void user_login_on_to_the_website() {
	   sendrequest.Login();
	  
	}

	@Then("user click on Friends Tab")
	public void user_click_on_friends_tab() {
	   sendrequest.FriendsTab();
	  
	}

	@Then("user click on find friends")
	public void user_click_on_find_friends() {
	   sendrequest.FindFriends();
	  
	}

	@And("user enter friend name in search bar")
	public void user_enter_friend_name_in_search_bar() {
	   sendrequest.Search();
	  
	}

	@And("user click on Add Friends")
	public void user_click_on_add_friends() {
	   sendrequest.AddFriend();
	  
	}

	@Then("user verifies the friend request sent")
	public void user_verifies_the_friend_request_sent() {
		 sendrequest.FriendRequestTab();
		 Assert.assertEquals("Tapu Mehta",sendrequest.VerifyRequest());
	}

}
