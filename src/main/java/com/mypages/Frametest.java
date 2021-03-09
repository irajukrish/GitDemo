package com.mypages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Frametest  extends TestBase{
	
	@Test
	public void iFrameTest() {
		
		WebElement fm=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		
		driver.switchTo().frame(fm);
		
		WebElement draggable=driver.findElement(By.xpath("//*[@id='draggable']"));
		
		draggable.click();
		
		WebElement droppable=driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions Act=new Actions(driver);
		Act.dragAndDrop(draggable, droppable).build().perform();
	}

}
