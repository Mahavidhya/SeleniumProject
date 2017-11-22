package testcases;


import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import ProjectWrappers.ProjWrappers;
import package2.printing;



public class OpenTaps extends ProjWrappers
{
	
	@BeforeClass
	public  void setData() throws Exception 
	{
		excelsheetname="CreateLead";
	}
	
	
	//@Test(dataProvider="fetchdata",dataProviderClass=printing.class)//(groups="smoke")
	
	@Test(dataProvider="fetchdata")
	public  void createLead(String cmpy,String fname,String lname) throws Exception 
	{
	clickByLink("Create Lead");
	enterById("createLeadForm_companyName", cmpy);
	enterById("createLeadForm_firstName", fname);
	enterById("createLeadForm_lastName", lname);
	((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight)");
	clickByClassName("smallSubmit");
		}
	
	
	/*@DataProvider(name="fetchdata")
	public String[][] getData()
	{
		String[][] data=new String[2][3];
		data[0][0]="Inatech";
		data[0][1]="Maha";
		data[0][2]="vidhya";
		data[1][0]="Ntier";
		data[1][1]="priya";
		data[1][2]="dharshini";
		return data;
	}*/
	
	
	}


		

	


	


