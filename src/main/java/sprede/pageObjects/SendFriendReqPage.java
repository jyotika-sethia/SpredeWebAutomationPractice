package sprede.pageObjects;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class SendFriendReqPage extends WebViewPage{
	
	    public SendFriendReqPage(TestSession session)  throws Exception {
		super(session, "pageElementSpecs/friends");
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
		
		public void FriendsTab()
		{
			new WebDriverWait(session.driver, 120).until(ExpectedConditions.visibilityOf(element("friendsTab")));
			element("friendsTab").click();
		}
		
		public void FindFriends()
		{
			new WebDriverWait(session.driver, 100).until(ExpectedConditions.visibilityOf(element("findFriends")));
			element("findFriends").click();
		}
		
		public void Search()
		{
			new WebDriverWait(session.driver, 100).until(ExpectedConditions.visibilityOf(element("search")));
			element("search").sendKeys("Tapu");
		}
		
		public void AddFriend()
		{
			new WebDriverWait(session.driver, 120).until(ExpectedConditions.visibilityOf(element("addFriend")));
			element("addFriend").click();
		}

		
		public void FriendRequestTab()
		{
			new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("friendsReqSent")));
			element("friendsReqSent").click();
		
			
		}
		public String VerifyRequest()
		{
//			return element("name").isDisplayed();
				return element("name").getText();
			
		}
		
		
		
	}


