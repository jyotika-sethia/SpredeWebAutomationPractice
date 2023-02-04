package sprede.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class CreateEventPage extends WebViewPage{

	public CreateEventPage(TestSession session) throws Exception {
		super(session, "pageElementSpecs/Event");
		
	}
	
	public void event_tab() throws InterruptedException
	{
		element("viewMore").click();
		Thread.sleep(2000);
		element("eventTab").click();
		Thread.sleep(2000);
		element("viewMore").click();
		
	}
	
	public void addEvent()
	{
		element("addEvent").click();
	}
	
	public void eventName()
	{
		element("eventName").sendKeys("TestingEvent");
	}
	
	public void eventCategory()
	{
		element("eventCategory").sendKeys("Soul");
	}
	
	public void targetLinking() throws InterruptedException, AWTException
	{
		element("targetLinking").sendKeys("TestTrial12");;
		Thread.sleep(2000);
		Robot r= new Robot();
		r.mouseMove(1000,480);
		r.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		r.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public void eventType() throws InterruptedException
	{
		element("eventType").click();
		Thread.sleep(2000);
		element("eType").click();
		
	}
	
	public void time() throws InterruptedException, AWTException
	{
		element("startTime").click();
		
		Robot robot = new Robot();
	    Thread.sleep(5000);
	    robot.mouseMove(750,450);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    Thread.sleep(5000);
	    robot.mouseMove(800,680);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public void startDate() throws InterruptedException
	{
		element("startDate").click();
		Thread.sleep(2000);
		element("selectfrom").click();
	}
	
	public void endDate() throws InterruptedException
	{
		element("endDate").click();
		Thread.sleep(2000);
		element("next").click();
		Thread.sleep(2000);
		element("selectto").click();
	}
	
	public void eventDesc()
	{
		element("eventDescription").sendKeys("Testing the description of event");;
	}
	
	public void uploadPhoto() throws AWTException, InterruptedException
	{
		
		  element("coverPhoto").click();
		  
		  String image ="C:\\Users\\sethi\\Downloads\\testing.jfif";
	      StringSelection s = new StringSelection(image);
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);

	      Robot r = new Robot();
	      Thread.sleep(2000);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.delay(250);
	      r.keyRelease(KeyEvent.VK_ENTER);
	      r.keyPress(KeyEvent.VK_CONTROL);
	      r.keyPress(KeyEvent.VK_V);
	      r.keyRelease(KeyEvent.VK_CONTROL);
	      r.keyRelease(KeyEvent.VK_V);
	      r.delay(250);
	      r.keyPress(KeyEvent.VK_ENTER);
	      r.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void location()
	{
		element("location").sendKeys("Mumbai");;
	}
	
	public void modePreferred()
	{
		element("preferredMode").click();
	}
	
	public void frequency()
	{
		element("frequency").click();
	}
	
	public void mode_of_Participation()
	{
		element("modeParticipate").click();
	}
	
	public void payment()
	{
		element("payment").click();
	}
	
	public void incentive()
	{
		element("incentive").click();
	}
	
	public void title()
	{
		element("title").sendKeys("Title1");;
	}
	
	public void task()
	{
		element("task").sendKeys("Task1");;
	}
	
	public void step()
	{
		element("step").sendKeys("Step1");;
	}
	
	public void submit()
	{
		element("submit").click();
	}
	
	public String verify()
	{
		return session.driver.getCurrentUrl();
		
	}
	
	
}
