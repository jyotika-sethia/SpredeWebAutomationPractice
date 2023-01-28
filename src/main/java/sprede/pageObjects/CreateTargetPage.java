package sprede.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class CreateTargetPage extends WebViewPage{
	
	public CreateTargetPage(TestSession session)  throws Exception {
		super(session, "pageElementSpecs/target");
		
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
	
	public void TargetTab() 
	{
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("targetTab")));
		element("targetTab").click();
	}
	
	public void AddNewTarget() 
	{
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("addNew")));
		element("addNew").click();
	}
	
	public void Form() throws AWTException
	{
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("title")));
		element("title").sendKeys("Test12");
		
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("type")));
		
		element("type").click();
		element("type-select").click();
		
		element("category").click();
		element("category-type").click();
	
		element("subcategory").click();
		element("subcategory-type").click();
		
		element("target-units").sendKeys("1500");
		
		element("from-date").click();
		element("selectfrom-date").click();
		
		element("to-date").click();
		element("selectto-date").click();
		
		element("description").sendKeys("Testing123 Testing456");
		
		element("upload-photo").click();
		
		  String image ="C:\\Users\\sethi\\Downloads\\testing.jfif";
	      StringSelection s = new StringSelection(image);
	      
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
	      
	      Robot r = new Robot();
	     
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
	      
	      		
		element("incentive").click();
		
				
	
	}
	
	public void Create_Target()
	{
//		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("createTarget")));
		element("createTarget").click();
	}
	
	public String targetPage()
	{
		return element("targetTitle").getText();
	
	}
	

	

	

}
