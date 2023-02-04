package sprede.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
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
		
		public void FriendsTab() throws InterruptedException
		{
			element("viewMore").click();
			Thread.sleep(3000);
			element("viewMore").click();
		}
		
		public void FindFriends() throws InterruptedException
		{
			Thread.sleep(4000);
			
			element("findFriends").click();
			
		}
		
		public void Search() throws InterruptedException
		{
			Thread.sleep(4000);
			
			element("search").sendKeys("Tapu");
		}
		
		public void AddFriend() throws InterruptedException
		{
			JavascriptExecutor executor = (JavascriptExecutor)session.driver;
			executor.executeScript("arguments[0].style.border='3px solid red'", element("addFriend"));
			Thread.sleep(4000);
			new WebDriverWait(session.driver, 120).until(ExpectedConditions.visibilityOf(element("addFriend")));
			element("addFriend").click();
		}

		
		public void FriendRequestTab() throws InterruptedException
		{
			Thread.sleep(3000);
//			JavascriptExecutor executor = (JavascriptExecutor)session.driver;
//			executor.executeScript("arguments[0].style.border='3px solid red'", element("friendReqSent"));
//			new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("friendsReqSent")));
			element("friendsReqSent").click();
		
			
		}
		public String VerifyRequest()
		{
//			return element("name").isDisplayed();
				return element("name").getText();
			
		}
		
		
		
	}


