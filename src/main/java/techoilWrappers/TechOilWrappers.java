package techoilWrappers;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import wrappers.GenericWrappersInaTech;

public class TechOilWrappers extends GenericWrappersInaTech {
	
	@BeforeMethod
	public void login(String Browser,String url,String username,String password) throws Exception
	{
		invokeApp(Browser,url);
		enterById("username", username);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
		clickByXpath("//*[@id='button']/a/img");
	}
	
	@AfterMethod
	
	public void closeapp()
	{
		closeBrowser();
	}
	

}
