package com.mercury.flows;

import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_ContinueToReserveFlight;

public class Flow_ReserveFlights extends Basedriver {
	
	
	public void reserveflights_flow() throws InterruptedException {
		Page_ContinueToReserveFlight pcr= new Page_ContinueToReserveFlight();
		pcr.getBtn_findFlights().click();
		Thread.sleep(1000);
		pcr.getChx_outFlight().click();
		Thread.sleep(1000);
		pcr.getChx_inFlight().click();
		Thread.sleep(1000);
		pcr.getBtn_reserveFlight().click();
		
		System.out.println("Continued to reserve selected flights.");
		Reporter.log("Continued to reserve selected flights.");
		
	}

}
