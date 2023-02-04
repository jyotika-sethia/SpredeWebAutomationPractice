package sprede.stepdefinitions;

import java.awt.AWTException;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import junit.framework.Assert;
import sprede.helper.Helper;

public class CreateEventSteps extends StepDefinitionInit {
	
	@Then("user click on event tab")
	public void user_click_on_event_tab() throws InterruptedException {
	   event.event_tab();
	    
	}

	@Then("user click on add new event")
	public void user_click_on_add_new_event() throws InterruptedException {
	   Thread.sleep(2000);
	   event.addEvent();
	    
	}
   
	@And("user enter Event Creation detail")
	public void user_enter_event_creation_detail() throws InterruptedException, AWTException {
	   event.eventName();
	   Thread.sleep(2000);
	   event.eventCategory();
	   Thread.sleep(2000);
	   event.targetLinking();
	   Thread.sleep(2000);
	   event.eventType();
	   event.time();
	   Thread.sleep(2000);
	   event.startDate();
	   Thread.sleep(2000);
	   event.endDate();
	   Thread.sleep(2000);
	   event.eventDesc();
	   Thread.sleep(2000);
	   event.uploadPhoto();
	   Thread.sleep(2000);
	   event.location();
	   Thread.sleep(2000);
	   event.modePreferred();
	     
	}

	@And("user enter Event Configuration detail")
	public void user_enter_event_configuration_detail() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(2000);
		event.frequency();
		Thread.sleep(2000);
		event.mode_of_Participation();
		Thread.sleep(2000);
		event.payment();
		Thread.sleep(2000);
		event.incentive();
	   
	}

	@And("user enter Event Template detail")
	public void user_enter_event_template_detail() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(2000);
		event.title();
		Thread.sleep(2000);
		event.task();
		Thread.sleep(2000);
		event.step();
	   
	}
	
	@And("user click on Create Event")
	public void user_click_on_create_event() throws InterruptedException {
		Helper.scrollDown();
		Thread.sleep(2000);
		event.submit();
		Thread.sleep(3000);
	    
	}

	@Then("user verifies event is created")
	public void user_verifies_event_is_created() throws InterruptedException {
		Thread.sleep(6000);
		String expected="https://dev.sprede-x.com/view-event";
		String actual=event.verify();
		System.out.println("Actual title is "+actual);
		Thread.sleep(3000);
		Assert.assertEquals("Target is not created",expected, actual);
	    
	}

}
