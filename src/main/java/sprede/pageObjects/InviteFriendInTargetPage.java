package sprede.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class InviteFriendInTargetPage extends WebViewPage{

	WebDriver driver = null;
	public InviteFriendInTargetPage(TestSession session) throws Exception {
		super(session,"pageElementSpecs/target" );
		// TODO Auto-generated constructor stub
	}
	
	public void login()
	{
		element("loginButton").click();
		element("userNameLogin").sendKeys("automationtesting@yopmail.com");
		element("passwordLogin").sendKeys("Sprede@123");
		element("loginToYourAccountButton").click();
	}
	
	public void target_tab()
	{
		element("targetTab").click();
	}
	
	public void view_more()
	{
		element("viewmore").click();
	}
	
	public void editTarget()
	{
		element("editTarget").click();
	}
	
	public void plusIcon()
	{
		element("plusButton").click();
	}
	
	public void selectFriend() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
		robot.mouseMove(400,420);
		robot.mousePress(0);robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		robot.mouseMove(700,670);
		robot.mousePress(0);robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
	}
	
	public void update_Target()
	{
		element("updateTarget").click();
	}

}
