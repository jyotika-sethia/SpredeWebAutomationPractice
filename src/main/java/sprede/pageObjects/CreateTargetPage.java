package sprede.pageObjects;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.JavascriptExecutor;
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
	
	public void TargetTab() throws InterruptedException 
	{
		element("viewMore").click();
		Thread.sleep(3000);
//		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("targetTab")));
		element("targetTab").click();
		Thread.sleep(3000);
		element("viewMore").click();
	}
	
	public void AddNewTarget() throws InterruptedException 
	{
		Thread.sleep(3000);
//		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("addNew")));
		element("addNew").click();
	}
	
	public void title() 
	{
		element("title").sendKeys("TestTrial12");
		
	}
	public void targetType() throws InterruptedException
	{
		element("type").click();
		Thread.sleep(3000);
		element("type-select").click();
		
	}	
	public void category() throws InterruptedException
	{
		element("category").click();
		Thread.sleep(3000);
		element("category-type").click();
	}	
	public void subCategory() throws InterruptedException
	{
		element("subcategory").click();
		Thread.sleep(3000);
		element("subcategory-type").click();
	}
	public void targetUnits() throws InterruptedException
	{
		element("target-units").sendKeys("1500");
	}
	public void fromDate() throws InterruptedException
	{
		element("from-date").click();
		Thread.sleep(3000);
		element("selectfrom-date").click();
	}
	public void toDate() throws InterruptedException
	{
		element("to-date").click();
		Thread.sleep(3000);
		element("next").click();
		Thread.sleep(3000);
		element("selectto-date").click();
	}
	public void description()
	{
		element("description").sendKeys("Testing123 Testing456");
	}
	public void uploadPhoto() throws InterruptedException, AWTException
	{
		JavascriptExecutor execute = (JavascriptExecutor)session.driver;
		execute.executeScript("arguments[0].style.border='3px solid red'", element("upload-photo"));
		element("upload-photo").click();
		Thread.sleep(3000);
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
	      
	}
	
	public void incentive() throws InterruptedException
	{
	      element("incentive").click();
	}	

	
	public void Create_Target() throws InterruptedException
	{
		JavascriptExecutor execute = (JavascriptExecutor)session.driver;
		execute.executeScript("arguments[0].style.border='3px solid red'", element("createTarget"));
		Thread.sleep(3000);

		element("createTarget").click();
	}
	
	public String targetPage() throws InterruptedException
	{
		return session.driver.getCurrentUrl();
	
	}
	

	

	

}
