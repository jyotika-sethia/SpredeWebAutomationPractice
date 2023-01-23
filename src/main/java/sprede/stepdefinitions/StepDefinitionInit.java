package sprede.stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import sprede.automation.framework.TestSession;
import sprede.pageObjects.CreatePostPage;
import sprede.pageObjects.CreateTargetPage;
import sprede.pageObjects.HomePage;


public class StepDefinitionInit {
	
	
	Map<String, Object> options = new HashMap<String, Object>();
	
	protected static TestSession session;
	
    static HomePage homepage;
    
    static CreateTargetPage target;
    
    static CreatePostPage post;
    
	public TestSession getTestSession() throws Exception {

		if (session == null) {
			session = new TestSession();
			
			homepage =new HomePage(session);
			
			target = new CreateTargetPage(session);
			
			post = new CreatePostPage(session);
		} 

		return session;
	}
}
