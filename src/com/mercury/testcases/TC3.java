package com.mercury.testcases;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_ReserveFlights;

public class TC3 extends Basedriver {
	Flow_ReserveFlights frf= new Flow_ReserveFlights();
	
	@Test
	public void test_ReserveFlights() throws InterruptedException {
		frf.reserveflights_flow();
	}

}
