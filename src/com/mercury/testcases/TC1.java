package com.mercury.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.mercury.basedriver.Basedriver;
import com.mercury.flows.Flow_Login;

public class TC1 extends Basedriver {
	
	@Test
	public void test_Login() throws IOException {
		Flow_Login fl = new Flow_Login();
		fl.login_flow();
	}

}
