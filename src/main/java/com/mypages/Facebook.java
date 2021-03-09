package com.mypages;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Facebook {
	
	public static WebDriver driver;

	public static void main(String[] args) throws IOException {
		
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent.html"); 
		ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        ExtentTest test = extent.createTest("MyFirstTest", "Facebook");
        
        
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver\\chromedriver.exe");
		Map<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values.notifications", 2);
		ChromeOptions options = new ChromeOptions();
		options.setExperimentalOption("prefs", prefs);
		driver = new ChromeDriver(options);
		try {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//driver.get("http://uatreplica.enterodirect.com/login");	
		driver.get("https://www.facebook.com/");
		test.log(Status.INFO, "Facebook Login Page");
		test.pass("Navigated FB to Login Page");
		driver.findElement(By.id("email")).sendKeys("rajuspi@gmail.com");
		driver.findElement(By.id("pass")).sendKeys("manidan@007");
		test.fail("details", MediaEntityBuilder.createScreenCaptureFromPath("Loginbutton.png").build());
		test.addScreenCaptureFromPath("Loginbutton.png");
		extent.flush();
		driver.findElement(By.xpath("//*[@data-testid='royal_login_button']")).click();
		
		test.log(Status.INFO, "Facebook Home Page");
		test.pass("Navigated FB to Home Page");
		//driver.findElement(By.name("xhpc_message")).click();
		//driver.findElement(By.name("xhpc_message")).sendKeys("Hello World!");
		//driver.findElement(By.xpath("//*[@class='_45wg _69yt']/button")).click();
		
		
		}
		//NoSuchElementException
		catch(NoSuchElementException e) {
			System.out.println("Error NoSuchElementException");
		}
		catch(Exception e) {
			System.out.println("Error Exception" + e);
		}
		finally {
			driver.quit();
			System.out.println("Clear and Close driver");
		}
		
	}

}
