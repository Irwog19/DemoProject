package com.mercury.flows;
import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Login;

public class Flow_Login extends Basedriver {
	Page_Login pl = new Page_Login();
	
	public void login_flow() throws IOException {
		
		pl.getTx_userName().sendKeys(getdata("Credentials",1,0));
		//pl.getTx_userName().sendKeys("gowrikoyada@gmail.com");
		
		// validation
		String actualuserName = driver.findElement(By.xpath(".//*[@name='userName']")).getAttribute("value");
		Assert.assertEquals(getdata("Credentials",1,0),actualuserName);
		System.out.println("Username value is as expected.");
	
		
		pl.getTx_password().sendKeys(getdata("Credentials",1,1));
		//pl.getTx_password().sendKeys("test123");
		
		//validation
		String actualpassword = driver.findElement(By.xpath(".//*[@name='password']")).getAttribute("value");
		Assert.assertEquals(getdata("Credentials",1,1), actualpassword);
		System.out.println("password value is as expected.");
				
		
		pl.getBtn_login().click();	
		
		System.out.println("User logged in successfully.");
		Reporter.log("User logged in successfully.");
		
	}

}
