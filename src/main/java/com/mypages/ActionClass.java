package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionClass extends TestBase{
	
	@Test
	public void ActionTest() {
	Actions A=new Actions(driver);
	A.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']"))).build().perform();
	A.moveToElement(driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"))).click().keyDown(Keys.LEFT_SHIFT).sendKeys("Selenium").build().perform();
	A.moveToElement(driver.findElement(By.xpath("//*[@id='nav-link-accountList']"))).contextClick().build().perform();
	}

}
