package sprede.stepdefinitions;

import java.awt.AWTException;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ValidatorFormSteps extends StepDefinitionInit{
	
	@Given("Login into the Sprede website")
	public void login_into_the_sprede_website() {
		validatorform.Login();
	}
	
	@When("user click on validator toggle")
	public void user_click_on_validator_toggle() throws InterruptedException
	{
		validatorform.EventValidator();
	}
	
	@Then("user fill the form")
	public void user_fill_the_form() throws InterruptedException, AWTException {
	    validatorform.Region();
	    Thread.sleep(2000);
	    validatorform.idType();;
	    Thread.sleep(2000);
	    Thread.sleep(2000);
	    validatorform.uploadId();
	    Thread.sleep(2000);
	    validatorform.currency();
	    Thread.sleep(2000);
	    validatorform.feesCharging();
	    Thread.sleep(2000);
	    validatorform.resumeUpload();
	    Thread.sleep(2000);
	    validatorform.date();
	    Thread.sleep(2000);
	    validatorform.startTime();
	    Thread.sleep(2000);
	    validatorform.endTime();
	    Thread.sleep(2000);
	    validatorform.timeZone();
	    Thread.sleep(3000);
	    validatorform.submit();
	   
	}
	
	@Then("user verify availability")
	public void user_verify_availability() throws InterruptedException {
	    Assert.assertTrue("Avaialbility is displayed",validatorform.verify());
	   
	}


}
