package sprede.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class CreatePostPage extends WebViewPage {

	public CreatePostPage(TestSession session) throws Exception {
		super(session, "pageElementSpecs/post");
	}
	
	public boolean website()
	{
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("homePageHeaderImg")));
		return (session.driver.getCurrentUrl().equalsIgnoreCase("https://dev.sprede-x.com/"))
		&&(element("homePageHeaderImg").isDisplayed());
	}
	
	public void Login()
	{
		
		element("loginButton").click();
		element("userNameLogin").sendKeys("automationtesting@yopmail.com");
		element("passwordLogin").sendKeys("Sprede@123");
		element("loginToYourAccountButton").click();
	}
	


	public void enterText()
	{
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("enterText")));
		element("enterText").sendKeys("Trial 1");

	}
	
	public void TargetLinking() throws InterruptedException, AWTException
	{
		element("targetLink").click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.mouseMove(550,620);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		
		
	}
	
	public void EventLinking() throws InterruptedException, AWTException
	{
		element("eventLink").click();
		Thread.sleep(2000);
		Robot robot = new Robot();
		robot.mouseMove(700,580);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		
	}
	
	
	public void CreatePost() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("createPost"));
		element("createPost").click();
		Thread.sleep(7000);
	}
}
