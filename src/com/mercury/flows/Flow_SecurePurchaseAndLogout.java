package com.mercury.flows;

import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_SecurePurchaseAndLogout;

public class Flow_SecurePurchaseAndLogout extends Basedriver {	
	
	public void securepurchaseandlogout_flow() throws InterruptedException {
		Page_SecurePurchaseAndLogout psl= new Page_SecurePurchaseAndLogout();
		Thread.sleep(2000);
		psl.getBtn_securepurchase().click();
		Thread.sleep(2000);
		psl.getBtn_logout().click();
		
		System.out.println("Tickets purchased and logged out.");
		Reporter.log("Tickets purchased and logged out.");
	}
}
