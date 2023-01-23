package sprede.pageObjects;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class CreatePostPage extends WebViewPage {

	public CreatePostPage(TestSession session) throws Exception {
		super(session, "pageElementSpecs/sprede");
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
		element("enterText").sendKeys("Testing 123");

	}
	
	public void TargetLinking()
	{
		element("targetLink").sendKeys("Test123");
		
		
	}
	
	public void EventLinking()
	{
		
	element("eventLink").sendKeys("Test456");
		
	}
	
//	public void photoUpload()
//	{
//	
//		element("post-upload").click();
//		element("photo.select").click();
//	}
	
	public void CreatePost()
	{
		element("createPost").click();
	}
}
