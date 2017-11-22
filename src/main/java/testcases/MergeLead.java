package testcases;

import org.testng.annotations.Test;

import ProjectWrappers.ProjWrappers;


public class MergeLead extends ProjWrappers {
	

	@Test(groups="regression")
	public  void MergeLeads() throws Exception
      {
		clickByLink("Leads");
		clickByLink("Merge Leads");
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[1]/td[2]/a");
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10029");
		clickById("ext-gen114");
		clickByLink("10029");
		driver.switchTo().window(winHandleBefore);
		clickByXpath("//*[@class='twoColumnForm']/tbody/tr[2]/td[2]/a");
		String winHandleBefore1 = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		enterById("ext-gen25", "10027");
		clickById("ext-gen114");
		clickByLink("10027");
		driver.switchTo().window(winHandleBefore1);
		clickByLink("Merge");
		driver.switchTo().alert().accept();
		}

}
