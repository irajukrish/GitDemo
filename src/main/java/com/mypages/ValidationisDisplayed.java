package com.mypages;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidationisDisplayed extends TestBase{
	
	@Test
	public void ViD() throws InterruptedException {
		
		System.out.println("Before " + driver.findElements(By.xpath("//label[@for='fromAnotherCity1']")).size());
		driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[3]")).click();
		System.out.println("After " + driver.findElements(By.xpath("//label[@for='fromAnotherCity1']")).size());
		Thread.sleep(5000);
		Boolean A=driver.findElement(By.xpath("//label[@for='fromAnotherCity1']")).isDisplayed();
		System.out.println("Is Displaying " + A);
		Boolean B=driver.findElement(By.xpath("(//span[@class='tabsCircle appendRight5'])[3]")).isEnabled();
		System.out.println("Is Enabled " + B);
		
	}

}
