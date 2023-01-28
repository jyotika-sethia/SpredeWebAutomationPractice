package sprede.stepdefinitions;

import java.util.HashMap;
import java.util.Map;

import sprede.automation.framework.TestSession;
import sprede.pageObjects.AcceptFriendReqPage;
import sprede.pageObjects.CreatePostPage;
import sprede.pageObjects.CreateTargetPage;
import sprede.pageObjects.HomePage;
import sprede.pageObjects.InviteFriendInTargetPage;
import sprede.pageObjects.ManageActiveParticipantPage;
import sprede.pageObjects.SendFriendReqPage;


public class StepDefinitionInit {
	
	
	Map<String, Object> options = new HashMap<String, Object>();
	
	protected static TestSession session;
	
    static HomePage homepage;
    
    static CreateTargetPage target;
    
    static CreatePostPage post;
    
    static SendFriendReqPage sendrequest;
    
    static InviteFriendInTargetPage invite;
    
    static AcceptFriendReqPage acceptreq;
    
    static ManageActiveParticipantPage manageActive;
    
	public TestSession getTestSession() throws Exception {

		if (session == null) {
			session = new TestSession();
			
		homepage =new HomePage(session);
			
		target = new CreateTargetPage(session);
		
		post = new CreatePostPage(session);
			
		sendrequest = new  SendFriendReqPage(session); 
		
		acceptreq = new AcceptFriendReqPage(session);
			
		invite = new InviteFriendInTargetPage(session);
		
		manageActive = new ManageActiveParticipantPage(session);
		
		} 

		return session;
	}
}
