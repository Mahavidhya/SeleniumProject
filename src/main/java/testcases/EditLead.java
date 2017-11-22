package testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectWrappers.ProjWrappers;


public class EditLead extends ProjWrappers{
	
	@Test(dataProvider="Editfetchdata")//(groups="sanity",dependsOnGroups="smoke")
	public void editlead(String fname) throws Exception
	{
	clickByLink("Leads");
	clickByLink("Find Leads");
	//enterByXpath("//label[contains(text(),'First name:')]");
	//label[contains(text(),'First name:')]/following-sibling::div[@class="x-form-element"]//input
	//label[contains(text(),'First name:')])[3]/following-sibling::div/input
	//enterByXpath("//label[contains(text(),'First name:')]/following-sibling::div[@class='x-form-element']//input", "Mahavidhya");
	enterByXpath("//*[@id='ext-gen248']", fname);
	clickByXpath("//*[@id='ext-gen334']");
	clickByLink(fname);
	clickByLink("Edit");
	JavascriptExecutor exe = (JavascriptExecutor) driver;
	exe.executeScript("document.getElementById('updateLeadForm_companyName').value = 'Test Leaf VK';");
	clickByClassName("smallSubmit");
		}
	
	@DataProvider(name="Editfetchdata")
	public String[][] getDataEdit()
	{
		String[][] data=new String[1][1];
		data[0][0]="Maha";
		return data;
	}
}
