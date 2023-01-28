package sprede.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

import sprede.automation.framework.TestSession;
import sprede.helper.Helper;
import sprede.pageFactory.WebViewPage;

public class ManageActiveParticipantPage extends WebViewPage{

		
	public ManageActiveParticipantPage(TestSession session) throws Exception {
		super(session, "pageElementSpecs/event");
		
	}
	

	public void Login() throws InterruptedException
	{
		
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("loginButton"));
		Thread.sleep(3000);
		element("loginButton").click();
		element("userNameLogin").sendKeys("automationtesting@yopmail.com");
		element("passwordLogin").sendKeys("Sprede@123");
		element("loginToYourAccountButton").click();
	}
	
	public void event_Tab()
	{
		element("eventTab").click();
	}
	
	public void viewEvent() throws InterruptedException
	{
		
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("viewEvent"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", element("viewEvent"));
		Thread.sleep(3000);
//		JavascriptExecutor js= ((JavascriptExecutor)session.driver);
//		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//		Thread.sleep(3000);
//		element("viewEvent").click();
																																			
//		Actions act =  new Actions(driver);
//		act.moveToElement(element("viewEvent")).click().perform();
//		element("viewEvent").click();
		
//		Actions actions = new Actions(session.driver);
//		actions.moveToElement(element("viewEvent")).click().build().perform();
//		
//		Helper.scrollDown();

//		Thread.sleep(3000);
//		element("viewEvent").click();
		
	}
	
	public void manage_Participant()
	{
		
		element("manageParticipantbutton").click();
	}
	
	public void blockButton() throws InterruptedException, AWTException
	{
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("blockButton"));
		Thread.sleep(2000);
		executor.executeScript("arguments[0].click();", element("blockButton"));
//		Thread.sleep(3000);
//		element("blockButton").click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.mouseMove(600,580);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
	}
	
	public void blockedTab()
	{
		element("blockParticipantTab").click();
	}
	
	public String verify()
	{
		
		return element("name").getText();
	}

}
