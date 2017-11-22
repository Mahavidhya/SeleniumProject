package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ProjectWrappers.ProjWrappers;
import wrappers.GenericWrappersInaTech;

public class DuplicateLead extends ProjWrappers {
	
	@Test(groups="regression")
	public void duplicatelead() throws Exception
	
	{
		
	clickByLink("Leads");
	clickByLink("Find Leads");
	clickByLink("Email");
	enterByXpath("//*[@id='ext-gen282']", "vinodck@gmail.com");
	clickByLink("Find Leads");
	clickByLink("10310");
	clickByLink("Duplicate Lead");
	String log1= driver.findElementById("sectionHeaderTitle_leads").getText();
	//Print the get text
	System.out.println(log1);
	JavascriptExecutor jse2 = (JavascriptExecutor)driver;
	jse2.executeScript("scroll(0, 850)");
	clickByClassName("smallSubmit");
		}


}
