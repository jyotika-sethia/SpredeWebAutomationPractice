package sprede.pageObjects;

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
		element("userNameLogin").sendKeys("automationtesting@yopmail.com");
		element("passwordLogin").sendKeys("Sprede@123");
		element("loginToYourAccountButton").click();
	}
	
	public void FriendsTab()
	{
		new WebDriverWait(session.driver, 120).until(ExpectedConditions.visibilityOf(element("friendsTab")));
		element("friendsTab").click();
	}
	
	public void FriendReqRecieved()
	{
		element("friendReqRecieved").click();
	}
	
	public void Accept_Req()
	{
		element("acceptReq").click();
	}
	
	public void friendList()
	{
		element("friendList").click();
	}
	
	public String VerifyList()
	{
		return element("friendDisplayed").getText();
	}
}
