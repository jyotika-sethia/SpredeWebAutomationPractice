package sprede.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FollowOrgStep extends StepDefinitionInit{

	@Given("Login into Sprede")
	public void login_into_sprede() throws InterruptedException {
	   followorg.Login(); 
	   
	}

	@When("user is on Voxbox page")
	public void user_is_on_voxbox_page() throws InterruptedException {
		Thread.sleep(3000);
	   followorg.VoxboxTab(); 
	   
	}

	@Then("user click on see all orgranization")
	public void user_click_on_see_all_orgranization() throws InterruptedException {
		Thread.sleep(3000);
		followorg.seeAll();
	   
	}

	@And("user search the organization")
	public void user_search_the_organization() throws InterruptedException {
		Thread.sleep(3000);
		followorg.search();
	   
	}

	@And("user click on the organization")
	public void user_click_on_the_organization() throws InterruptedException {
		Thread.sleep(3000);
		followorg.select();
	   
	}

	@Then("user click on follow")
	public void user_click_on_follow() throws InterruptedException {
	   followorg.follow(); 
	   Thread.sleep(5000);
	   Assert.assertTrue("Organization is followed",followorg.verify());
	   
	}
}
