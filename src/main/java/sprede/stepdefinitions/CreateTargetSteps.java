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
		target.title();
		Thread.sleep(2000);
		target.targetType();
		Thread.sleep(2000);
		target.category();
		Thread.sleep(2000);
		target.subCategory();
		Thread.sleep(2000);
		target.targetUnits();
		Thread.sleep(2000);
		target.fromDate();
		Thread.sleep(2000);
		target.toDate();
		Thread.sleep(2000);
		target.description();
		Thread.sleep(2000);
		target.uploadPhoto();
		Thread.sleep(2000);
		target.incentive();
	   
	}

	@Then("user click on Create Target")
	public void user_click_on_create_target() throws Throwable{
	    
	    target.Create_Target();
	}

	@Then("user verifies target is created")
	public void user_verifies_target_is_created() throws Throwable{
		Thread.sleep(6000);
		String expected="https://dev.sprede-x.com/target";
		String actual=target.targetPage();
		System.out.println("Actual title is "+actual);
		Thread.sleep(3000);
		Assert.assertEquals("Target is not created",expected, actual);
	    
	}
	
}
