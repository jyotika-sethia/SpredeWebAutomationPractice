package sprede.pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class FollowOrgPage extends WebViewPage{

	public FollowOrgPage(TestSession session) throws Exception {
		super(session, "pageElementSpecs/followorg");
	
	}
	
	public void Login() throws InterruptedException
	{
		
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("loginButton"));
		Thread.sleep(3000);
		element("loginButton").click();
		element("userNameLogin").sendKeys("automationtesting@yopmail.com");
		element("passwordLogin").sendKeys("Sprede@123");
		element("loginToYourAccountButton").click();
	}

	public void VoxboxTab() throws InterruptedException
	{
		Thread.sleep(3000);
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("voxBox")));
		element("voxBox").click();
		Thread.sleep(3000);
		
	}
	
	public void seeAll() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("seeAll"));
		Thread.sleep(4000);
		element("seeAll").click();
		Thread.sleep(2000);
	}

	public void search() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("search"));
		Thread.sleep(3000);
		element("search").sendKeys("user");
		Thread.sleep(2000);
	}
	
	public void select() throws InterruptedException
	{
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("select"));
		Thread.sleep(2000);
		element("select").click();
		Thread.sleep(3000);
	}
	
	public void follow() throws InterruptedException
	{
		Thread.sleep(3000);
		JavascriptExecutor executor = (JavascriptExecutor)session.driver;
		executor.executeScript("arguments[0].style.border='3px solid red'", element("follow"));
		Thread.sleep(2000);
		element("follow").click();
		
	}
	
	public boolean verify()
	{
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("voxBox")));
		return element("verify").isDisplayed();
	}
	
}
