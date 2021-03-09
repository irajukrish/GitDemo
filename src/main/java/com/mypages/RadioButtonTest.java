package com.mypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class RadioButtonTest extends TestBase{
	
	@Test
	public void RBTest() {
		
//		List<WebElement> Radiobuttons=driver.findElements(By.xpath("//td[@class='table5']/input[@type='radio']"));
//		for(WebElement rb : Radiobuttons) {
//			System.out.println(rb.getAttribute("value"));
//			
//		}
//		System.out.println(Radiobuttons.size());
//		int Count=Radiobuttons.size();
//		for (int i=0; i<Count; i++) {
//			Radiobuttons.get(i).click();
//			
//		}
		
		List<WebElement> Rbs=driver.findElements(By.xpath("//td[@class='table5']/input[@type='radio']"));
		int RbsCount=Rbs.size();
		
		for (int i=0; i<RbsCount; i++) {
			System.out.println(Rbs.get(i).getAttribute("value"));
			
			//Rbs.get(i).getAttribute("value").
			
			if(Rbs.get(i).getAttribute("value").equals("Beer"))
			{
			Rbs.get(i).click();
			System.out.println("Found Beer");
			}
			else
			{
				System.out.println("couldn't find Beer");
			}
			
		}
		
		
		
	}

}
