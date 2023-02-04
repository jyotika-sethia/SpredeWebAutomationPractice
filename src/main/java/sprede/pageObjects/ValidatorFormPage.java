package sprede.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class ValidatorFormPage extends WebViewPage{

	public ValidatorFormPage(TestSession session) throws Exception {
		super(session, "pageElementSpecs/validator");
		
	}

	public void Login()
	{
		
		element("loginButton").click();
		element("userNameLogin").sendKeys("RobSpence@yopmail.com");
		element("passwordLogin").sendKeys("Spence123$");
		element("loginToYourAccountButton").click();
	}
	
	public void EventValidator() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solidroboted'", element("validatorToggle"));
		element("validatorToggle").click();
		Thread.sleep(5000);
	}
	
	public void Region()
	{
		element("region").sendKeys("Mumbai");
	}

	public void idType()
	{
		element("idType").click();
	}
	
	public void uploadId() throws InterruptedException, AWTException
	{
		element("option").click();
		Thread.sleep(5000);
		
		Robot robot = new Robot();
		StringSelection s = new StringSelection("C:\\Users\\sethi\\Downloads\\picture.png");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      
		robot.mouseMove(1000,380);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		//upload nationalid
		robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    Thread.sleep(3000);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}   
	    
	public void currency() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
	    element("currency").click();
	    element("currency").sendKeys("Indian Rupee");
	    robot.mouseMove(350,500);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
	}	

	public void feesCharging() throws InterruptedException
	{
		element("ratehr").clear();
		Thread.sleep(3000);
		element("ratehr").sendKeys("120");
		Thread.sleep(3000);
		
		element("participant").click();
		Thread.sleep(3000);
		element("participant").sendKeys("150");
		Thread.sleep(3000);
		
		element("fixedrate").clear();
		Thread.sleep(3000);
		element("fixedrate").sendKeys("120000wrre");
	    Thread.sleep(3000);
	 }
	
	public void resumeUpload() throws AWTException, InterruptedException
	{
		Robot robot = new Robot();
		StringSelection s = new StringSelection("C:\\Users\\sethi\\Downloads\\Event Report.pdf");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	    element("resume").click();
	    Thread.sleep(5000);
	    //upload resume
		robot.mouseMove(1000,380);
		robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(2000);
		robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(5000);
		//upload nationalid
		robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    Thread.sleep(3000);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyRelease(KeyEvent.VK_V);
	    Thread.sleep(3000);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    Thread.sleep(3000);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}
	 
	public void date() throws InterruptedException
	{
	    element("date").click();
	    Thread.sleep(2000);
	}
	
	public void startTime() throws InterruptedException, AWTException
	{
		Robot robot = new Robot();
	    element("startTime").click();
	    Thread.sleep(5000);
	    robot.mouseMove(750,450);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    Thread.sleep(5000);
	    robot.mouseMove(800,680);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public void endTime() throws InterruptedException, AWTException
	{
		Robot robot = new Robot();
	    element("endTime").click();
	    Thread.sleep(2000);
	    robot.mouseMove(600,500);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    Thread.sleep(5000);
	    robot.mouseMove(800,680);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	    Thread.sleep(2000);
	}
	
	public void timeZone() throws InterruptedException, AWTException
	{
		Robot robot = new Robot();
	    element("timeZone").click();
	    Thread.sleep(5000);
	    robot.mouseMove(650,580);
	    robot.mousePress(InputEvent.BUTTON1_DOWN_MASK);
	    robot.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
	
	public void submit()
	{
	 
	    element("submit").click();
	}   
	    

	
	public boolean verify()
	{
		
		return (session.driver.getCurrentUrl().equalsIgnoreCase("https://dev.sprede-x.com/validator-availibility"));
	}
	
}