package week1.day1;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class IrctcLogIn {
	
	static ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException, WebDriverException, IOException {
		
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("https://www.irctc.co.in/eticketing/loginHome.jsf");
		//PhysicalTrade.Screenshot();
		driver.findElementByLinkText("Sign up").click();
		
		String text=driver.findElementByXPath("//*[@id='userRegistrationForm']/div[2]").getText();
		System.out.println(text);
		if(text.contains("User profile service is not allowed between - 09:30 AM - 11:30 AM"))
				{
			System.out.println("Not allowed to Signup");
			driver.manage().timeouts().implicitlyWait(300000, TimeUnit.SECONDS);
			driver.close();
				}
		else 
		{  
		driver.findElementById("userRegistrationForm:userName").sendKeys("Ertyhytrfr");
		driver.findElementById("userRegistrationForm:password").sendKeys("Ubm12345");
		driver.findElementById("userRegistrationForm:confpasword").sendKeys("Ubm12345");
		
		Select dropdown0 = new Select(driver.findElement(By.id("userRegistrationForm:securityQ")));
		dropdown0.selectByIndex(1);
		driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("Dog");
		driver.findElementById("userRegistrationForm:firstName").sendKeys("Dog");
		driver.findElementById("userRegistrationForm:middleName").sendKeys("Test");
		driver.findElementById("userRegistrationForm:lastName").sendKeys("Team");
		driver.findElementById("userRegistrationForm:gender:1").click();
		driver.findElementById("userRegistrationForm:maritalStatus:0").click();
		Select dropdown1 = new Select(driver.findElement(By.id("userRegistrationForm:dobDay")));
		dropdown1.selectByIndex(23);
		Select dropdown2 = new Select(driver.findElement(By.id("userRegistrationForm:dobMonth")));
		dropdown2.selectByIndex(9);
		Select dropdown3 = new Select(driver.findElement(By.id("userRegistrationForm:dateOfBirth")));
		dropdown3.selectByIndex(9);
		Select dropdown4 = new Select(driver.findElement(By.id("userRegistrationForm:occupation")));
		dropdown4.selectByIndex(3);
		Select dropdown5 = new Select(driver.findElement(By.id("userRegistrationForm:countries")));
		dropdown5.selectByIndex(1);
		driver.findElementById("userRegistrationForm:email").sendKeys("mahavidhya24@gmail.com");
		driver.findElementById("userRegistrationForm:mobile").sendKeys("9884567876");
		Select dropdown6 = new Select(driver.findElement(By.id("userRegistrationForm:nationalityId")));
		dropdown6.selectByIndex(1);
		driver.findElementById("userRegistrationForm:address").sendKeys("153");
		driver.findElementById("userRegistrationForm:pincode").sendKeys("600100",Keys.TAB);
		Thread.sleep(3000);
		Select dropdown7 = new Select(driver.findElement(By.id("userRegistrationForm:cityName")));
		dropdown7.selectByIndex(1);
		Thread.sleep(3000);
		Select dropdown8 = new Select(driver.findElement(By.id("userRegistrationForm:postofficeName")));
		dropdown8.selectByIndex(1);
		driver.findElementById("userRegistrationForm:landline").sendKeys("123456");
		((JavascriptExecutor) driver).executeScript("window.scrollBy(0,800)", "");
		//PhysicalTrade.Screenshot();
		driver.findElementById("nlpAnswer").click();
		Thread.sleep(10000);
		driver.findElementById("userRegistrationForm:j_idt501").click();	
		driver.switchTo().alert().accept();
		driver.switchTo().alert().accept();
		driver.findElementById("userRegistrationForm:saveBtnIe").click();
		}
	}
	//public static void Screenshot() throws WebDriverException, IOException
	//{
		// Now you can do whatever you need to do with it, for example copy somewhere
		//FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE),new File("./Screen/image1" + System.currentTimeMillis()+".jpg")); 
	//}

}
