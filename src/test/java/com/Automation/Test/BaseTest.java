package com.Automation.Test;

import org.testng.annotations.BeforeMethod;

import com.Automation.Generic.DriverUtils;

public class BaseTest 
{
	@BeforeMethod
	public void setUp()
	{
		DriverUtils.createDriver();
	}
	
	/*@AfterMethod
	  public void cleanUp()
	  {
	 DriverUtils.getDriver().quit();
	 }*/
	
}
