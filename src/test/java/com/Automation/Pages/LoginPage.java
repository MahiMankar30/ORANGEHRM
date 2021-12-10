package com.Automation.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	//Declaration
	@FindBy(id="txtUsername")
	private WebElement unTB;
	
	@FindBy(id="txtPassword")
	private WebElement pwTB;
	
	@FindBy(id="btnLogin")
	private WebElement loginBtn;
	public void openurl()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	
	
	//Utilization
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLogin()
	{
		loginBtn.click();
	}	
	}
