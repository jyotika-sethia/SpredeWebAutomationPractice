package sprede.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class AcceptFriendReqPage extends WebViewPage{

	public AcceptFriendReqPage(TestSession session) throws Exception
	{
		super(session, "pageElementSpecs/friends");
		
	}
	
	
	public void Login()
	{
		
		element("loginButton").click();
		element("userNameLogin").sendKeys("tapu@yopmail.com");
		element("passwordLogin").sendKeys("Tapu123$");
		element("loginToYourAccountButton").click();
	}
	
	public void FriendsTab() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("viewMore"));
		Thread.sleep(2000);
		element("viewMore").click();
		Thread.sleep(3000);
		element("friendsTab").click();
		Thread.sleep(3000);
		element("viewMore").click();
	}
	
	public void FriendReqRecieved() throws InterruptedException
	{
		Thread.sleep(3000);
		element("friendReqRecieved").click();
	}
	
	public void Accept_Req() throws InterruptedException
	{
		Thread.sleep(3000);
		element("acceptReq").click();
	}
	
	public void friendList() throws InterruptedException
	{
		Thread.sleep(3000);
		element("friendList").click();
	}
	
	public String VerifyList() throws InterruptedException
	{
		Thread.sleep(3000);
		return element("friendDisplayed").getText();
	}
}
