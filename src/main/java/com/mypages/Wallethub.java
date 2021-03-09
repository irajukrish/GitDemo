package com.mypages;

import java.awt.Desktop.Action;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Wallethub {
	
	public static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://wallethub.com/profile/test_insurance_company/");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.name("em")).sendKeys("rajuspi@gmail.com");
		driver.findElement(By.name("pw")).sendKeys("Rajuwallethub!1");
		driver.findElement(By.xpath("//span[contains(text(),'Login')]")).click();
		WebElement WhatsYourRating=driver.findElement(By.xpath("(//review-star[@class='rvs-svg']//*[@class='rvs-star-svg'])[4]"));
		Actions action=new Actions(driver);
		for (int i=1; i<=4;i++) {
			//action.moveToElement(WhatsYourRating).build().perform();
			action.moveToElement(driver.findElement(By.xpath("(//review-star[@class='rvs-svg']//*[@class='rvs-star-svg'])["+i+"]"))).build().perform();
			Thread.sleep(1000);
		}
		
		
		WhatsYourRating.click();
		driver.findElement(By.xpath("(//span[@class='dropdown-placeholder'])[2]")).click();
		driver.findElement(By.xpath("//ul/*[contains(text(),'Health Insurance')]")).click();
		WebElement WriteYourReview=driver.findElement(By.xpath("//div/textarea[starts-with(@class, 'textarea')]"));
//		WriteYourReview.sendKeys("Health insurance is a medical insurance policy that offers financial "
//				+ "coverage for medical expenses when the policyholder is hospitalised. Health Insurance "
//				+ "Companies cover the insured with the facility of cashless hospitalization at a network "
//				+ "hospital or provide a reimbursement for the incurred expenses.");
		
		
		WriteYourReview.sendKeys("Health Insurance is a kind of insurance that provides coverage for medical expenses "
				+ "to the policy holder. Depending on the health insurance plan chosen the policy holder can get coverage "
				+ "for critical illness expenses, surgical expenses, hospital expenses etc.");
		
		driver.findElement(By.xpath("//div[contains(text(),'Submit')]")).click();
		
		driver.findElement(By.xpath("//div[contains(text(),'Continue')]")).click();
		
		WebElement Userid=driver.findElement(By.xpath("(//span[contains(text(),'Rajendran')])[1]"));
		WebElement Profile=driver.findElement(By.xpath("(//a[contains(text(),'Profile')])[1]"));
		action.moveToElement(Userid).moveToElement(Profile).click().build().perform();
		WebElement Comment=driver.findElement((By.xpath("//p[@class='pr-rec-type']")));
		System.out.println(Comment.getText());
		
		
	}


}
