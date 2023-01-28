package sprede.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import sprede.automation.framework.TestSession;

public class CreateTargetSteps extends StepDefinitionInit
{

	@Given("user is on the sprede")
	public void user_is_on_the_sprede() throws Throwable {
		target.website();
		
	 	    
	}
	@When("user login")
	public void userlogin() throws Throwable {
		target.Login();
	}
	
	@Then("user click on target tab")
	public void user_click_on_target_tab() throws Throwable{
	    target.TargetTab();
	    
	}

	@Then("user click on add new target")
	public void user_click_on_add_new_target() throws Throwable{
		target.AddNewTarget();
	    
	}

	@Then("user fill the form with required details")
	public void user_fill_the_form_with_required_details() throws Throwable{
		target.Form();
	    
	}

	@Then("user click on Create Target")
	public void user_click_on_create_target() throws Throwable{
	    
	    target.Create_Target();
	}

	@Then("user verifies target is created")
	public void user_verifies_target_is_created() throws Throwable{
		String expected="Test12";
		String actual=target.targetPage();
		Assert.assertEquals("Target is created",expected, actual);
	    
	}
	
}
