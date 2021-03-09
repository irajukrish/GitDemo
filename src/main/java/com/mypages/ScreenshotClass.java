package com.mypages;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;

public class ScreenshotClass extends TestBase {

	
	@Test
	public void SS() throws IOException {
		
		File srcfile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//File desc=new File("D:\\OG\\2019\\Sep\\1.png");
		FileUtils.copyFile(srcfile, new File("D:\\OG\\2019\\Sep\\1.png"));
		
	}
}
