package sprede.pageObjects;

import java.time.Duration;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.automation.framework.TestSession;
import sprede.pageFactory.WebViewPage;

public class HomePage extends WebViewPage {

	public HomePage(TestSession session) throws Exception {
		super(session, "pageElementSpecs/sprede");
		// TODO Auto-generated constructor stub
	}
    
	public boolean verifyHomePage() throws InterruptedException {
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("homePageHeaderImg")));
		return (session.driver.getCurrentUrl().equalsIgnoreCase("https://dev.sprede-x.com/"))
				&&(element("homePageHeaderImg").isDisplayed());
	}

	public void clicksOnLoginOption() {
		element("loginButton").click();
	}

	public boolean verifyLoginScreen() {
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("userNameLogin")));
		return element("userNameLogin").isDisplayed();
	}

	public void enterEmail() {
		element("userNameLogin").sendKeys("automantesting@yopmail.com");
		
	}

	public void enterPassword() {
		element("passwordLogin").sendKeys("Sprede@123");
		
	}

	public void ClickOnloginToYourAccountButton() {
		element("loginToYourAccountButton").click();
		
	}

	public boolean verifyLoggedInUserVoxPage() {
		new WebDriverWait(session.driver, 80).until(ExpectedConditions.visibilityOf(element("spredeHeaderLogo")));
		System.out.println("Vox page title:"+session.driver.getCurrentUrl()+" "+session.driver.getCurrentUrl().equalsIgnoreCase("https://dev.sprede-x.com/voxbox"));
		return (session.driver.getCurrentUrl().equalsIgnoreCase("https://dev.sprede-x.com/voxbox"));
	}
	
	

}
