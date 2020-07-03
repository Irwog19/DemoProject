package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_DeliveryAdressAndSameAsBillingAddress;

public class TC7 extends Basedriver {
	Flow_DeliveryAdressAndSameAsBillingAddress fdb= new Flow_DeliveryAdressAndSameAsBillingAddress();
	
	@Test
	public void test_deliveryaddressandsameasbilling() throws IOException, InterruptedException {
		fdb.deliveryadressandsameAsbillingaddress_flow();
		
	}

}
