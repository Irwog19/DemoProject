package com.mercury.testcases;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_SecurePurchaseAndLogout;

public class TC8 extends Basedriver {
	Flow_SecurePurchaseAndLogout fsl= new Flow_SecurePurchaseAndLogout();
	
	@Test
	public void test_securepurchaseandlogout() throws InterruptedException {					
		fsl.securepurchaseandlogout_flow();
		
	}

}
