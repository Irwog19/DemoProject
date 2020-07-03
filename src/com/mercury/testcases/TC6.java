package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_BillingAddressAndTicketless;

public class TC6 extends Basedriver {
	Flow_BillingAddressAndTicketless fba= new Flow_BillingAddressAndTicketless();
	
	@Test
	public void test_BillingAddressAndTicketless() throws IOException {
		fba.billingaddressandticketlesstravel();
	}

}
