package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Creditcard;

public class TC5 extends Basedriver {
	Flow_Creditcard fc= new Flow_Creditcard();
	
	@Test
	public void test_creditcard() throws InterruptedException, IOException {
		fc.creditcard_flow();
	}

}
