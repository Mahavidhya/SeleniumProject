package shot;


import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.assertthat.selenium_shutterbug.utils.web.ScrollStrategy;

public class Screens {

	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://layout.jquery-dev.com/demos/iframes_many.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//WebElement searchBox=driver.findElementById("lst-ib");
		//searchBox.sendKeys("WebElement searchBox");
		//Shutterbug.shootPage(driver, ScrollStrategy.BOTH_DIRECTIONS).save();
		//Shutterbug.shootPage(driver,ScrollStrategy.BOTH_DIRECTIONS)
		//.blur(searchBox)
		//.highlight(searchBtn)
		//.monochrome(googleLogo)
		//.highlightWithText(googleLogo, Color.blue, 3, "Monochromed logo",Color.blue, new Font("SansSerif", Font.BOLD, 20))
		//.highlightWithText(searchBox, "Blurred secret words")
		//.withTitle("Google home page - " + System.currentTimeMillis())
		//.withName("home_page")
		//.withThumbnail(0.7)
		//.save("D:\\Selenium\\Seleni\\Screen");

		//driver.quit();
		//}*/

		List<WebElement> frameslistOfPage = driver.findElementsByTagName("iframe");
		// prints the count of list
		//System.out.println("Number of frames :  " + frameslistOfPage.size());
		int countOfFrames = frameslistOfPage.size();
		for(   WebElement link : frameslistOfPage )
		{
			driver.switchTo().frame(link);
			List<WebElement> frameslistOfPage1 = driver.findElementsByTagName("iframe");
			if (frameslistOfPage1.size()>0)
			{
				countOfFrames = countOfFrames + frameslistOfPage1.size();
			}
			driver.switchTo().defaultContent();                                               

		}
		System.out.println(" Total count Of Frames " + countOfFrames );      



		/*try{
		driver.get("http://layout.jquery-dev.com/demos/iframe_local.html");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();

		//driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("test");

		driver.switchTo().frame("childIframe");
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[3]/p/button").click();

		//driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.switchTo().defaultContent();
		driver.switchTo().frame("childIframe");
		Thread.sleep(3000);
		driver.findElementByXPath("/html/body/div[2]/p/button").click();
		driver.switchTo().defaultContent();



		List<WebElement> anchorlist =driver.findElementsByTagName("a");
		for(WebElement list :anchorlist )
		{
			System.out.println("Link is "+ list.getText());
			System.out.println("href is "+list.getAttribute("href"));
			System.out.println("css is "+list.getCssValue("color"));
			//System.out.println("text is "+list.getText(""));
			//System.out.println("text is "+list.getTagName());
			//System.out.println("text is "+list.getClass());
			System.out.println("text is "+list.getLocation());
			//it populate some value at the time of moving the mouse over the screen
			//System.out.println("onmousedown is "+list.getAttribute("onmousedown"));

		}
	}

	catch (Exception e)
	{  
		File scrFile = driver.getScreenshotAs(OutputType.FILE);  
		FileUtils.copyFile(scrFile, new File("./Screen/image1" + System.currentTimeMillis()+".jpg"));
		System.out.println("Screenshot is captured for failed testcase");
	}  */


		/*try{
			driver.get("http://google.co.in");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			driver.manage().window().maximize();

			//driver.findElement(By.xpath("//input[@id='gbqfq']")).sendKeys("test");
			System.out.println("Entered data in textfield");   
			driver.findElement(By.id("lst-ibg")).sendKeys("test",Keys.ENTER);
		}   
		catch (Exception e)
		{  
			File scrFile = driver.getScreenshotAs(OutputType.FILE);  
			FileUtils.copyFile(scrFile, new File("./Screen/image1" + System.currentTimeMillis()+".jpg"));
			System.out.println("Screenshot is captured for failed testcase");
		} */

	}  }

// TODO Auto-generated method stub




