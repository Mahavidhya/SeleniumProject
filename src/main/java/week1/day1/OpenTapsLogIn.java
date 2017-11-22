package week1.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;





public class OpenTapsLogIn {

	
	static ChromeDriver driver;
	public static void main(String[] args) throws WebDriverException, IOException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Navigate to url
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		//Enter user name
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Login to the page
		driver.findElementByClassName("decorativeSubmit").click();
		Screenshot();
		//Create object to hold the string value
		String logintext=driver.findElementByXPath("//*[@id='form']/h2").getText();
		//Compare the result and print result
		System.out.println(logintext);
		if(logintext.contains("Demo Sales Manager"))
		{
			//Message for true condition
			Screenshot();
			System.out.println("TC passed");
		}
		else
		{   
			//Message for false condition
			Screenshot();
			System.out.println("TC failed");

		}
		driver.findElementByXPath("//*[@id='button']/a").click();

		//createLead();
		//Editlead();
		MergeLead();
		//Deletelead();
		//Duplicatelead();
		

	}
	public static void createLead() throws WebDriverException, IOException
	{
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("Inatechsolutions");
		driver.findElementById("createLeadForm_firstName").sendKeys("Maha");
		driver.findElementById("createLeadForm_lastName").sendKeys("vidhya");
		Screenshot();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.findElementByName("submitButton").submit();
		String viewlead=driver.findElementById("viewLead_companyName_sp").getText();
		Screenshot();
		System.out.println(viewlead);
		if(viewlead.contains("Inatechsolutions"))
		{

			System.out.println("TC passed");
		}
		else
		{
			System.out.println("TC failed");

		}
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		Screenshot();
		driver.close();
	}

	public static void Screenshot() throws WebDriverException, IOException
	{
		// Now you can do whatever you need to do with it, for example copy somewhere
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("./Screen/image1" + System.currentTimeMillis()+".jpg")); 
	}


	public static void  Editlead() throws InterruptedException {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Navigate to URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		//Enter the Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click on the Login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on the Image
		driver.findElementByXPath("//*[@id='button']/a/img").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByXPath("//*[@id='ext-gen248']").sendKeys("Vinod Kumar");
		driver.findElementByXPath("//*[@id='ext-gen334']").click();
		Thread.sleep(3000);
		//driver.findElementByXPath("//*[@class='x-grid3-cell-inner x-grid3-col-partyId']/div[1]/table/tbody/tr[1]/td[1]/div/a").click();
		driver.findElementByLinkText("Vinod Kumar").click();
		driver.findElementByLinkText("Edit").click();
		JavascriptExecutor exe = (JavascriptExecutor) driver;

		exe.executeScript("document.getElementById('updateLeadForm_companyName').value = 'Test Leaf VK';");
		driver.findElementByClassName("smallSubmit").click();
		driver.close();
	}

	public static void MergeLead() throws InterruptedException {
		// TODO Auto-generated method stub
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Merge Leads").click();
		Thread.sleep(3000);
		driver.findElementById("ext-gen599").click();
		String winHandleBefore = driver.getWindowHandle();

		for(String winHandle : driver.getWindowHandles())
		{
			driver.switchTo().window(winHandle);
			driver.get("http://www.leaftaps.com/crmsfa/control/LookupLeads?id=&parm0=LookupLeads");
		}
		// Perform the actions on new window

		// Close the new window, if that window no more required
		driver.close();

		// Switch back to original browser (first window)
		driver.switchTo().window(winHandleBefore);

		// Continue with original browser (first window)

	}

	public static void Deletelead ()
	{
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Navigate to URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		//Enter the Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click on the Login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on the Image
		driver.findElementByXPath("//*[@id='button']/a/img").click();
		// TODO Auto-generated method stub
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		//Thread.sleep(3000);
		driver.findElementByXPath("//div[@class='x-tab-strip-wrap']/ul/li[2]/a[2]/em/span/span").click();
		JavascriptExecutor exe = (JavascriptExecutor) driver;

		exe.executeScript("document.getElementById('ext-gen262').value = '0';");
		driver.findElementById("ext-gen266").sendKeys("044");
		driver.findElementById("ext-gen270").sendKeys("97866875885");
		driver.findElementById("ext-gen334").click();

		//driver.findElementByXPath("//*[@class='x-grid3-scroller']/div[1]/div[1]/table/tbody/tr/td/div/a").click();
		driver.findElementByLinkText("10271").click();
		driver.findElementByLinkText("Delete").click();
		driver.findElementByLinkText("Find Leads").click();
		//driver.findElementById("ext-gen246").sendKeys("10269");
		//driver.findElementByLinkText("Find Leads").click();
	}

	public static void Duplicatelead() {

		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Navigate to URL
		driver.get("http://www.leaftaps.com/opentaps/control/main");
		//Enter the Username
		driver.findElementById("username").sendKeys("DemoSalesManager");
		//Enter the Password
		driver.findElementById("password").sendKeys("crmsfa");
		//Click on the Login
		driver.findElementByClassName("decorativeSubmit").click();
		// Click on the Image
		driver.findElementByXPath("//*[@id='button']/a/img").click();
		driver.findElementByLinkText("Leads").click();
		driver.findElementByLinkText("Find Leads").click();
		driver.findElementByLinkText("Email").click();
		driver.findElementByXPath("//*[@id='ext-gen282']").sendKeys("vinodck@gmail.com");
		driver.findElementById("ext-gen334").click();
		driver.findElementByLinkText("11096").click();
		driver.findElementByLinkText("Duplicate Lead").click();
		String log1= driver.findElementById("sectionHeaderTitle_leads").getText();
		//Print the get text
		System.out.println(log1);
		JavascriptExecutor jse2 = (JavascriptExecutor)driver;
		jse2.executeScript("scroll(0, 850)");
		driver.findElementByClassName("smallSubmit").click();

	}

}







