package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_ContinueToReserveFlight extends Basedriver {
	
	
		@FindBy(xpath=(".//*[contains(@name,'findFlights')]"))
		WebElement btn_findFlights;		
	
		@FindBy(xpath=(".//*[contains(@name,'outFlight') and contains(@value,'Unified')]"))
		WebElement chx_outFlight;
		
		@FindBy(xpath=(".//*[contains(@name,'inFlight') and contains(@value,'Unified')]"))
		WebElement chx_inFlight;
		
		@FindBy(xpath=(".//*[contains(@name,'reserveFlight')]"))
		WebElement btn_reserveFlight;
		
		public Page_ContinueToReserveFlight() {
			PageFactory.initElements(driver, this);
		}

		public WebElement getBtn_findFlights() {
			return btn_findFlights;
		}

		public void setBtn_findFlights(WebElement btn_findFlights) {
			this.btn_findFlights = btn_findFlights;
		}

		public WebElement getChx_outFlight() {
			return chx_outFlight;
		}

		public void setChx_outFlight(WebElement chx_outFlight) {
			this.chx_outFlight = chx_outFlight;
		}

		public WebElement getChx_inFlight() {
			return chx_inFlight;
		}

		public void setChx_inFlight(WebElement chx_inFlight) {
			this.chx_inFlight = chx_inFlight;
		}

		public WebElement getBtn_reserveFlight() {
			return btn_reserveFlight;
		}

		public void setBtn_reserveFlight(WebElement btn_reserveFlight) {
			this.btn_reserveFlight = btn_reserveFlight;
		}
	

}
