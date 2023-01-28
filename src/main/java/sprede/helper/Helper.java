package sprede.helper;

import java.util.Random;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import sprede.stepdefinitions.StepDefinitionInit;



public class Helper extends StepDefinitionInit{
	
	/**
	 * Method is used to wait still page is loading. Wait for the second specified.
	 */
	public static void waitForPageLoaded() {
        ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
                    public Boolean apply(WebDriver driver) {
                        return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString().equals("complete");
                    }
                };
        try {
            Thread.sleep(1000);
            WebDriverWait wait = new WebDriverWait(session.driver, 180);
            boolean result = wait.until(expectation);
            System.out.println(result+ " *******************Page is loaded completly***************");
        } catch (Throwable error) {
            org.junit.Assert.fail("Timeout waiting for 90 secondes to Page Load Request to complete.");
        }
    }
	
	public static void scrollDown()
	{
		((JavascriptExecutor) session.driver).executeScript("window.scroll(0,800)","");				
	}
	
	public static void scrollUp()
	{
		((JavascriptExecutor) session.driver).executeScript("window.scroll(0,-250)","");				
	}

    public static void threadWait(int waitsec) {
        threadWait(waitsec, null);
    }

    public static void threadWait(int waitsec, String message) {
    	if (System.getProperty("implicitWait")!= null && Integer.parseInt(System.getProperty("implicitWait")) >= 0){
    		waitsec = Integer.parseInt(System.getProperty("implicitWait"));
    	}
        if (message != null) {
            System.out.println("\nWAITING " + waitsec + " seconds - " + message);
        } else {
            System.out.println("\nWAITING " + waitsec + " seconds for page synchronization!!!");
        }
        System.out.println(new String(new char[waitsec]).replace("\0", "="));
        for (int i = 0; i < waitsec; i++) {
            try {
                Thread.sleep(1000);
                System.out.print("=");
            } catch (InterruptedException ex) {
            }
        }
        System.out.println("");
    }

 
    
    /**
     * Method is used to generate a uniqueNumber upto 7 digit
     * @return
     */
	public static int uniqueNumber()
	{
		Random rnd = new Random();
		int n = 1000000 + rnd.nextInt(9000000);
		return n;
	}
}
