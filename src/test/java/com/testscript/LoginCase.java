package com.testscript;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import com.library.BaseClass;

public class LoginCase extends BaseClass
{
	@Test
	public void aboflogincase() throws InterruptedException
	{
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//span[text()='Sign In/Register']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(text(),'Already Registered?')]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='sign-in-form-emailAddress'])[2]")).sendKeys("sowmi.29asnm@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[@id='sign-in-form-password'])[2]")).sendKeys("pass2992");
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//button[@title='Sign In'])[2]")).click();
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Hi ')]"))).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		Thread.sleep(3000);
	}
}