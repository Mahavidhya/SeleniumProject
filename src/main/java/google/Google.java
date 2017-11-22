package google;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Google {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		
		
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		driver.get("http://jqueryui.com/");
		
		//Drag and Drop
		driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[1]/a").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement drag = driver.findElementById("draggable");
		Actions builder=new Actions(driver);
		builder.dragAndDropBy(drag, 383, 180).build().perform();
		
		//Resizable
		/*driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[3]/a").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement drag1 = driver.findElementByXPath("//*[@id='resizable']/div[3]");
		Actions builder=new Actions(driver);
		builder.clickAndHold(drag1).moveByOffset(-100, -100).build().perform();*/
		
		//Sortable
		/*driver.findElementByXPath("//*[@id='sidebar']/aside[1]/ul/li[5]/a").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement item1 = driver.findElementByXPath("//*[@id='sortable']/li[1]");
		WebElement item7 = driver.findElementByXPath("//*[@id='sortable']/li[7]");
		Actions builder=new Actions(driver);
		//builder.dragAndDropby(item1, item7).build().perform();
		builder.clickAndHold(item1).moveByOffset(item7.getLocation().x,item7.getLocation().y).release().build().perform();*/
		
		//Datepicker
	/*	driver.findElementByXPath("//*[@id='sidebar']/aside[2]/ul/li[6]/a").click();
		driver.switchTo().frame(driver.findElementByClassName("demo-frame"));
		WebElement drag1 = driver.findElementById("datepicker");
		Actions builder=new Actions(driver);
		builder.clickAndHold(drag1).moveByOffset(-100, -100).build().perform();
		*/
				
	}
}
