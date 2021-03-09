package com.mypages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EndtoEndTests extends TestBase{
	
	@Test
	public void LinksTest() {
		List<WebElement> Atags=driver.findElements(By.tagName("a"));
		
		System.out.println("Links Counts are " + Atags.size());
		
		WebElement Header=driver.findElement(By.xpath("//header[@class='gh-w gh-simpleH']"));
		List<WebElement> Htags=Header.findElements(By.tagName("a"));
		System.out.println("Header Links Counts are " + Atags.size());
		
		
		WebElement Footer=driver.findElement(By.id("glbfooter"));
		List<WebElement> Ftags=Footer.findElements(By.tagName("a"));
		System.out.println("Footer Links Counts are " + Ftags.size());
		
//		for(WebElement f: Ftags) {
//			System.out.println("Footer Links Lists are " + f.getText());
//			
//		}
		
		for(int i=0; i<Ftags.size(); i++) {
			System.out.println("Footer Links Lists are " + Ftags.get(i).getText());
			
		}
		
	}

}
