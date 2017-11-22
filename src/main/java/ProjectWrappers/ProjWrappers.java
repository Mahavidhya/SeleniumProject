package ProjectWrappers;

import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import wrappers.GenericWrappersInaTech;

public class ProjWrappers extends GenericWrappersInaTech{
	
	public static String excelsheetname;
	
	@Parameters({"Browser","url","Uname","Pwd"})
	@BeforeMethod//(groups="common")
	public void login(String Browser,String url,String username,String password) throws Exception
	{
		invokeApp(Browser,url);
		enterById("username", username);
		enterById("password", password);
		clickByClassName("decorativeSubmit");
		clickByXpath("//*[@id='button']/a/img");
		
	}
	
	@AfterMethod//(groups={"smoke","sanity"})
	
	public void closeapp()
	{
		closeBrowser();
	}
	
	
	@DataProvider(name="fetchdata" )
	public Object[][] getData() throws InvalidFormatException, IOException
	{
		ReadExcel objread=new ReadExcel();
		return objread.readExcelData(excelsheetname);
		
	   
	}
	
	
	
   
	

}
