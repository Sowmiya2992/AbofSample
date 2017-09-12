package com.testscript;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.library.BaseClass;
import com.pageobjectmodel.LoginPage;

public class LoginScript extends BaseClass
{
	@Test
	public void abofloginscript() throws InterruptedException
	{
		LoginPage login = new LoginPage();
		login.SignInRegister.click();
		Thread.sleep(2000);
		login.AlreadyRegistered.click();
		Thread.sleep(2000);
		login.EmailId.sendKeys("sowmi.29asnm@gmail.com");
		Thread.sleep(2000);
		login.Password.sendKeys("pass2992");
		Thread.sleep(2000);
		login.SignIn.click();
		Thread.sleep(2000);
		Actions action = new Actions(driver);
		action.moveToElement(login.Hi).perform();
		Thread.sleep(2000);
		login.SignOut.click();
		Thread.sleep(2000);
	}
}