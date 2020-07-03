package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Flight;

public class TC2 extends Basedriver {
	
@Test
public void test_flightdetails() throws IOException, InterruptedException {
	Flow_Flight fl = new Flow_Flight();
	fl.triptype();
	fl.passengers();
	fl.departfrom();
	fl.departmonth();
	fl.departday();
	fl.arrivein();
	fl.returnmonth();
	fl.returnday();
	fl.serviceclass();
	fl.airlines();	
}
}
