package com.Automation.Test;

import org.testng.annotations.Test;

import com.Automation.Generic.PropertyReader;
import com.Automation.Pages.AdminPage;
import com.Automation.Pages.LoginPage;

public class LoginTest extends BaseTest
{
	

	
	
	@Test
	public void VerifyLogin()
	{
		LoginPage loginPage = new LoginPage();
		AdminPage a1=new AdminPage();
	
		loginPage.openurl();
		
		/*AdminPage a1=new AdminPage();
	
		/*loginPage.enterUsername("Admin");
		loginPage.enterPassword("admin123");*/
		PropertyReader.initProperty();
		loginPage.enterUsername(PropertyReader.getProperty("login.username"));
		loginPage.enterPassword(PropertyReader.getProperty("login.password"));
		
		
		loginPage.clickLogin();
		a1.Action();
		PropertyReader.initProperty();
		a1.enterEname(PropertyReader.getProperty("add.employeename"));
		a1.enterUname(PropertyReader.getProperty("add.username"));
		a1.enterPwd(PropertyReader.getProperty("add.password"));
		a1.enterCPwd(PropertyReader.getProperty("add.confirmpassword"));
		
		 a1.clickSave();
		
		 /*a1.Action();
		 a1.SelectRole();
		 a1.enterEname("David Morris");
		 a1.enterUname("Ronaldo");
		 a1.SelectStatus();
		 a1.enterPwd("Messi@12-34");
		 a1.enterCPwd("Messi@12-34");
		 a1.clickSave();*/
		
	}
}
