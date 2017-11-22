package google;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Grid {
	
	
		@Test
		public void gridimplementation() throws MalformedURLException
		{
		/*System.setProperty("webdriver.chrome.driver", "./drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();*/
		DesiredCapabilities dc=new DesiredCapabilities();
		//dc.setPlatform(Platform.WINDOWS);
		dc.setPlatform(Platform.MAC);
		dc.setBrowserName("chrome");
		//RemoteWebDriver driver=new RemoteWebDriver(new URL("http://172.16.30.202:4456/wd/hub"),dc);
		//RemoteWebDriver driver=new RemoteWebDriver(new URL("http://11a07611-945a-4a94-9999-09b77d7d5e1e/wd/hub"),dc);
		RemoteWebDriver driver=new RemoteWebDriver(new URL("http://mahavidhya:aed92697-2ecd-4ae3-b901-bdc39ec33029@ondemand.saucelabs.com/wd/hub"),dc);
		driver.get("http://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement item1=driver.findElementByXPath("//*[@id='selectable']/li[1]");
		WebElement item5=driver.findElementByXPath("//*[@id='selectable']/li[5]");
		Actions builder=new Actions(driver);
		builder.clickAndHold(item1).release(item5).build().perform();
		}

		}




