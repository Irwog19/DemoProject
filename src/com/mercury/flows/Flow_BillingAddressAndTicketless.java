package com.mercury.flows;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;
import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_BillingAddressAndTicketless;

public class Flow_BillingAddressAndTicketless extends Basedriver {

	public void billingaddressandticketlesstravel() throws IOException {
		Page_BillingAddressAndTicketless pba = new Page_BillingAddressAndTicketless();

		pba.getTx_billAddress1().clear();
		pba.getTx_billAddress1().sendKeys(getdata("Address", 1, 1));

		pba.getTx_billAddress2().sendKeys(getdata("Address", 1, 2));

		pba.getTx_billCity().clear();
		pba.getTx_billCity().sendKeys(getdata("Address", 1, 3));

		pba.getTx_billState().clear();
		pba.getTx_billState().sendKeys(getdata("Address", 1, 4));

		pba.getTx_billZip().clear();
		pba.getTx_billZip().sendKeys(getdata("Address", 1, 5));

		Select country = new Select(pba.getSlct_billCountry());
		country.selectByVisibleText(getdata("Address", 1, 6));

		pba.getChx_ticketLess().click();

		System.out.println("Billing address details furnished.");
		Reporter.log("Billing address details furnished.");

	}
}
