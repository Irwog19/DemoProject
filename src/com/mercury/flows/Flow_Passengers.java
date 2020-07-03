package com.mercury.flows;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Passengers;

public class Flow_Passengers extends Basedriver {
	Page_Passengers pp= new Page_Passengers();
	
	public void passengers_flow() throws IOException, InterruptedException {
		Page_Passengers pp= new Page_Passengers();
		
		
		pp.getTx_passFirst0().sendKeys(getdata("Passengers",1,1));
		pp.getTx_passLast0().sendKeys(getdata("Passengers",1,2));
		Select meal1= new Select(pp.getSlct_passmeal0());
		meal1.selectByVisibleText(getdata("Passengers",1,3));
		
		Thread.sleep(1000);
		
		pp.getTx_passFirst1().sendKeys(getdata("Passengers",2,1));		
		pp.getTx_passLast1().sendKeys(getdata("Passengers",2,2));		
		Select meal2= new Select(pp.getSlct_passmeal1());
		meal2.selectByVisibleText(getdata("Passengers",2,3));

		System.out.println("Passenger details furnished.");
		Reporter.log("Passenger details furnished.");
				
	}

}
