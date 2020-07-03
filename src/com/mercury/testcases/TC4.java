package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Passengers;

public class TC4 extends Basedriver {
	Flow_Passengers fp = new Flow_Passengers();
	
	@Test
	public void test_passengers() throws IOException, InterruptedException {
		fp.passengers_flow();
	}
	

}
