package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_DeliveryAdressAndSameAsBillingAddress extends Basedriver {
	
	@FindBy(xpath=".//*[contains(@name,'delAddress1')]")
	WebElement tx_delAddress1;
	
	@FindBy(xpath=".//*[contains(@name,'delAddress2')]")
	WebElement tx_delAddress2;
	
	@FindBy(xpath=".//*[contains(@name,'delCity')]")
	WebElement tx_delCity;
	
	@FindBy(xpath=".//*[contains(@name,'delState')]")
	WebElement tx_delState;
	
	@FindBy(xpath=".//*[contains(@name,'delZip')]")
	WebElement tx_delZip;
	
	@FindBy(xpath=".//*[contains(@name,'delCountry')]")
	WebElement slct_delCountry;
	
	@FindBy(xpath=".//*[contains(@name,'billCountry')]//following::td//input[@name='ticketLess']")
	WebElement chx_sameasbilling;
	
	
	
	public Page_DeliveryAdressAndSameAsBillingAddress() {
		PageFactory.initElements(driver, this);
	}



	public WebElement getTx_delAddress1() {
		return tx_delAddress1;
	}



	public void setTx_delAddress1(WebElement tx_delAddress1) {
		this.tx_delAddress1 = tx_delAddress1;
	}



	public WebElement getTx_delAddress2() {
		return tx_delAddress2;
	}



	public void setTx_delAddress2(WebElement tx_delAddress2) {
		this.tx_delAddress2 = tx_delAddress2;
	}



	public WebElement getTx_delCity() {
		return tx_delCity;
	}



	public void setTx_delCity(WebElement tx_delCity) {
		this.tx_delCity = tx_delCity;
	}



	public WebElement getTx_delState() {
		return tx_delState;
	}



	public void setTx_delState(WebElement tx_delState) {
		this.tx_delState = tx_delState;
	}



	public WebElement getTx_delZip() {
		return tx_delZip;
	}



	public void setTx_delZip(WebElement tx_delZip) {
		this.tx_delZip = tx_delZip;
	}



	public WebElement getSlct_delCountry() {
		return slct_delCountry;
	}



	public void setSlct_delCountry(WebElement slct_delCountry) {
		this.slct_delCountry = slct_delCountry;
	}



	public WebElement getChx_sameasbilling() {
		return chx_sameasbilling;
	}



	public void setChx_sameasbilling(WebElement chx_sameasbilling) {
		this.chx_sameasbilling = chx_sameasbilling;
	}

}
