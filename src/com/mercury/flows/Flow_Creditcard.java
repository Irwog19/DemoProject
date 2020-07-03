package com.mercury.flows;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Creditcard;

public class Flow_Creditcard extends Basedriver {
	Page_Creditcard pc = new Page_Creditcard();
	
	public void creditcard_flow() throws InterruptedException, IOException {
		Page_Creditcard pc = new Page_Creditcard();
		Thread.sleep(1000);
		
		// type
		Select creditcard = new Select(pc.getSlct_creditCard());
		creditcard.selectByVisibleText(getdata("CreditCard",1,0));
		
		// number
		pc.getTx_creditnumber().sendKeys(getdata("CreditCard",1,1));
		
		// expiry
		Select expirymonth = new Select(pc.getSlct_expirymonth());
		expirymonth.selectByVisibleText(getdata("CreditCard",1,2));
		
		Select expiryyear = new Select(pc.getSlct_expiryyear());
		expiryyear.selectByVisibleText(getdata("CreditCard",1,3));
		
		// card holder
		Thread.sleep(1000);
		pc.getTx_ccfirstname().sendKeys(getdata("CreditCard",1,4));
		pc.getTx_ccmidname().sendKeys(getdata("CreditCard",1,5));
		pc.getTx_cclastname().sendKeys(getdata("CreditCard",1,6));
		
		System.out.println("Credit card details furnisehd successfully.");
		Reporter.log("Credit card details furnisehd successfully.");
		
	}

}
