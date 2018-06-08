package com.myntra.testframework.factory;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import com.myntra.testframework.dataprovider.DataProviderFromConfig;

public class BrowserFactory {

	static WebDriver driver;
	
	public static WebDriver getDriver(String browserName) throws IOException
	{
		
		if(browserName.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
	   
		else if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", DataProviderFactory.getDataProviderFromConfig().getChromePath());
			driver=new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("ie"))
		{
			System.setProperty("webdriver.ie.driver", DataProviderFactory.getDataProviderFromConfig().getIEPath());
            driver=new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		return driver;
	 }
	
	public static void closeDriver(WebDriver driver)
	{
		driver.close();
	}
  }
