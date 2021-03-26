package TestCases;

import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import keywords.ApplicationKeywords;

public class CreatePortfolioTest {
	
	
	@Test
	public void createPortfolioTest() throws FileNotFoundException
	{
		
		
		ApplicationKeywords apps = new ApplicationKeywords();// init prop
					
	    apps.openBrowser("Chorme");
	    apps.navigate("url");
	    apps.type("username", "TestingAshish");
	    apps.type("password", "tEST@1234");
		apps.click("login_submit");
		
		apps.Close();
	}
	

}
