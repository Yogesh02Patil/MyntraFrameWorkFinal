package com.myntra.testframework.utility;

import java.io.File;
import java.io.IOException;

import org.omg.CORBA.Current;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	
	
	public static String getScreenshot(WebDriver driver, String path) throws IOException
	{
		TakesScreenshot st=(TakesScreenshot) driver;
		
		File scr = st.getScreenshotAs(OutputType.FILE);
		
		String dest="C:\\Users\\Yogesh\\git\\MyntraFrameWorkFinal\\Screenshots\\"+path+".png";
		
		org.openqa.selenium.io.FileHandler.copy(scr, new File(dest));
		
		return dest;
	
		
		
		
		
		
		
		
		
	}
	

	
	
	
}
