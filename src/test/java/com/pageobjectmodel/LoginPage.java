package com.pageobjectmodel;

import org.openqa.selenium.support.PageFactory;
import com.library.BaseClass;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.WebElement;

public class LoginPage
{
	public LoginPage()
	{
		PageFactory.initElements(BaseClass.driver, this);
	}
	
	@FindBy(xpath="//span[text()='Sign In/Register']")
	public WebElement SignInRegister;
	@FindBy(xpath="//a[contains(text(),'Already Registered?')]")
	public WebElement AlreadyRegistered;
	@FindBy(xpath="(//input[@id='sign-in-form-emailAddress'])[2]")
	public WebElement EmailId;
	@FindBy(xpath="(//input[@id='sign-in-form-password'])[2]")
	public WebElement Password;
	@FindBy(xpath="(//button[@title='Sign In'])[2]")
	public WebElement SignIn;
	@FindBy(xpath="//span[contains(text(),'Hi ')]")
	public WebElement Hi;
	@FindBy(xpath="//a[text()='Sign Out']")
	public WebElement SignOut;
}