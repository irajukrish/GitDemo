package com.mypages;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class WindowsHandle extends TestBase{
	
	@Test
	public void WindowshandleTest() {
		
		String PW=driver.getWindowHandle();
		System.out.println("Parent Window is " + PW);
		driver.findElement(By.xpath("(//a[contains(text(),Help)])[2]")).click();
		Set<String> W=driver.getWindowHandles();
		Iterator<String> I=W.iterator();
		
		String ParentW=I.next();
		String ChildW=I.next();
		System.out.println("Parent Window is " + ParentW);
		System.out.println("Child Window is " + ChildW);
		driver.switchTo().window(ChildW);
		
		driver.findElement(By.xpath("//a[@class='appbar-helpcenter-sections__link appbar-helpcenter-sections--community']")).click();
		
		driver.switchTo().window(ParentW);
		//driver.switchTo().defaultContent();
		System.out.println("Page Title is " + driver.getTitle());
		driver.findElement(By.xpath("//*[@id=\"initialView\"]/footer/ul/li[2]/a")).click();
		
	}

}
