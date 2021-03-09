package com.mypages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class TestBase {
	
	public WebDriver driver;

	

	@BeforeTest
	public void Setup() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://uatreplica.enterodirect.com/login");		
		//driver.get("https://www.spicejet.com");
		//driver.get("http://www.echoecho.com/htmlforms10.htm");
		//driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		//driver.get("https://www.makemytrip.com/");
		//driver.get("https://www.amazon.in");
		//driver.get("https://accounts.google.com/signup/v2/webcreateaccount");
		//driver.get("https://jqueryui.com/droppable/");
		driver.get("https://in.ebay.com/");
	}
	
	@AfterTest
	public void teardown()
	{
		if(driver!=null) {
			//driver.quit();
		}
	}
	
	
}
