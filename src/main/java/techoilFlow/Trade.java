package techoilFlow;

import org.openqa.selenium.JavascriptExecutor;

import techoilWrappers.TechOilWrappers;

public class Trade extends TechOilWrappers{
	
	public  void AddTrade(String cmpy,String fname,String lname) throws Exception 
	{
	clickByLink("Trade");
	clickByLink("Physical Trades");
	clickById("btnAddNewgrdphysicalDeal");
	clickByXpath("//*[@id='radioBuy']/div[1]/div");
	enterById("createLeadForm_firstName", fname);
	enterById("createLeadForm_lastName", lname);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	clickByClassName("smallSubmit");
		}

}
