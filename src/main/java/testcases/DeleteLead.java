package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import ProjectWrappers.ProjWrappers;


public class DeleteLead  extends ProjWrappers
{
	@Test(groups="sanity",dependsOnGroups="smoke")
	public void deletelead() throws Exception
	{
    
	clickByLink("Leads");
	clickByLink("Find Leads");
	clickByXpath("//div[@class='x-tab-strip-wrap']/ul/li[2]/a[2]/em/span/span");
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	exe.executeScript("document.getElementById('ext-gen262').value = '0';");
	//enterById("ext-gen266", "044");
	enterById("ext-gen270", "9894613364");
	clickById("ext-gen334");
	clickByLink("ext-gen980");
	clickByLink("Delete");
	
	}

}
