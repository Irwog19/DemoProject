package com.mercury.flows;

import java.io.IOException;


import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_DeliveryAdressAndSameAsBillingAddress;

public class Flow_DeliveryAdressAndSameAsBillingAddress extends Basedriver {
	
	public void deliveryadressandsameAsbillingaddress_flow() throws IOException, InterruptedException {
		Page_DeliveryAdressAndSameAsBillingAddress pdb = new Page_DeliveryAdressAndSameAsBillingAddress();
		pdb.getTx_delAddress1().clear();
		pdb.getTx_delAddress1().sendKeys(getdata("Address",2,1));
		
		pdb.getTx_delAddress2().sendKeys(getdata("Address",2,2));
		
		pdb.getTx_delCity().clear();
		pdb.getTx_delCity().sendKeys(getdata("Address",2,3));
		
		pdb.getTx_delState().clear();
		pdb.getTx_delState().sendKeys(getdata("Address",2,4));
		
		pdb.getTx_delZip().clear();
		pdb.getTx_delZip().sendKeys(getdata("Address",2,5));
		
		Select country = new Select(pdb.getSlct_delCountry());
		country.selectByVisibleText(getdata("Address",2,6));
		
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		System.out.println("Alert accepted.");
		Reporter.log("Alert accepted.");
		
		
		pdb.getChx_sameasbilling().click();
		
		System.out.println("Delivery address details provided and 'same as billing' clicked.");
		Reporter.log("Delivery address details provided and 'same as billing' clicked.");
		
		
	}
}
