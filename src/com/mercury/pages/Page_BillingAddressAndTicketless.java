package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_BillingAddressAndTicketless extends Basedriver {
	
	@FindBy(xpath=".//*[contains(@name,'billAddress1')]")
	WebElement tx_billAddress1;
	
	@FindBy(xpath=".//*[contains(@name,'billAddress2')]")
	WebElement tx_billAddress2;
	
	@FindBy(xpath=".//*[contains(@name,'billCity')]")
	WebElement tx_billCity;
	
	@FindBy(xpath=".//*[contains(@name,'billState')]")
	WebElement tx_billState;
	
	@FindBy(xpath=".//*[contains(@name,'billZip')]")
	WebElement tx_billZip;
	
	@FindBy(xpath=".//*[contains(@name,'billCountry')]")
	WebElement slct_billCountry;
	
	@FindBy(xpath=".//font[@face='Arial, Helvetica, sans-serif' and contains(text(),'Ticket')]//preceding::input[@name='ticketLess']")
	WebElement chx_ticketLess;
	
	public Page_BillingAddressAndTicketless() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTx_billAddress1() {
		return tx_billAddress1;
	}

	public void setTx_billAddress1(WebElement tx_billAddress1) {
		this.tx_billAddress1 = tx_billAddress1;
	}

	public WebElement getTx_billAddress2() {
		return tx_billAddress2;
	}

	public void setTx_billAddress2(WebElement tx_billAddress2) {
		this.tx_billAddress2 = tx_billAddress2;
	}

	public WebElement getTx_billCity() {
		return tx_billCity;
	}

	public void setTx_billCity(WebElement tx_billCity) {
		this.tx_billCity = tx_billCity;
	}

	public WebElement getTx_billState() {
		return tx_billState;
	}

	public void setTx_billState(WebElement tx_billState) {
		this.tx_billState = tx_billState;
	}

	public WebElement getTx_billZip() {
		return tx_billZip;
	}

	public void setTx_billZip(WebElement tx_billZip) {
		this.tx_billZip = tx_billZip;
	}

	public WebElement getSlct_billCountry() {
		return slct_billCountry;
	}

	public void setSlct_billCountry(WebElement slct_billCountry) {
		this.slct_billCountry = slct_billCountry;
	}

	public WebElement getChx_ticketLess() {
		return chx_ticketLess;
	}

	public void setChx_ticketLess(WebElement chx_ticketLess) {
		this.chx_ticketLess = chx_ticketLess;
	}
}
