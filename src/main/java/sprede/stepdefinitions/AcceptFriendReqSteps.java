package sprede.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AcceptFriendReqSteps extends StepDefinitionInit {

	@Given("user logs in")
	public void user_logins() {
		acceptreq.Login();
	}

	@When("user click on Friend Tab")
	public void user_click_on_friend_tab() {
		acceptreq.FriendsTab(); 
	    
	}

	@Then("user click on Friends Request Recieved")
	public void user_click_on_friends_request_recieved() {
		acceptreq.FriendReqRecieved();
	    
	}

	@And("user click on accept")
	public void user_click_on_accept() {
		acceptreq.Accept_Req();
	    
	}

	@Then("user verifies the friend in Friend List")
	public void user_verifies_the_friend_in_friend_list() {
		acceptreq.friendList();
		String expected="Neelam Jain";
		String actual=acceptreq.VerifyList();
		Assert.assertEquals("Friend addes to Friend List",expected, actual);
//		Assert.assertTrue("Friend Request accepted",acceptreq.VerifyList());
	}
}
