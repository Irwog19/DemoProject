package com.mercury.flows;

import java.io.IOException;

//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

import com.mercury.basedriver.Basedriver;
import com.mercury.pages.Page_Flight;

public class Flow_Flight extends Basedriver {
	Page_Flight pl = new Page_Flight();

	public void triptype() throws InterruptedException {
		Thread.sleep(2000);
		pl.getChx_oneway().click();
		Thread.sleep(1000);
		pl.getChx_roundtrip().click();

	}

	public void passengers() throws IOException, InterruptedException {
		Thread.sleep(1000);
		Select passengers = new Select(pl.getSlct_passCount());
		passengers.selectByValue(getdata("Flight",1,1));

	}

	public void departfrom() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Select depart = new Select(pl.getSlct_fromPort());
		depart.selectByValue(getdata("Flight",1,2));

	}

	public void departmonth() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Select departuremonth = new Select(pl.getSlct_fromMonth());
		departuremonth.selectByValue(getdata("Flight",1,3));
	}

	public void departday() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Select departureday = new Select(pl.getSlct_fromDay());
		departureday.selectByValue(getdata("Flight",1,4));

	}

	public void arrivein() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Select arrive = new Select(pl.getSlct_toPort());
		arrive.selectByVisibleText(getdata("Flight",1,5));
	}

	public void returnmonth() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Select returningmonth = new Select(pl.getSlct_toMonth());
		returningmonth.selectByValue(getdata("Flight",1,6));
	}

	public void returnday() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Select returningday = new Select(pl.getSlct_toDay());
		returningday.selectByValue(getdata("Flight",1,7));
	}

	public void serviceclass() throws InterruptedException {
		Thread.sleep(1000);
		pl.getChx_serviceclass().click();
	}

	public void airlines() throws InterruptedException, IOException {
		Thread.sleep(1000);
		Select airlinetype = new Select(pl.getSlct_airline());
		airlinetype.selectByVisibleText(getdata("Preferences",1,1));
		
		System.out.println("Flight details furnished successfully.");
		Reporter.log("Flight details furnished successfully.");

	}

}
