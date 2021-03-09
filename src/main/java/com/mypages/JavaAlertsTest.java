package com.mypages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class JavaAlertsTest extends TestBase{
	
	@Test
	public void JAT(){
		
		driver.findElement(By.xpath("//*[@value='Confirmation Alert']")).click();
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
		
	}
	
	

}
