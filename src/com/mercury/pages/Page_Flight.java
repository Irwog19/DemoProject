package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_Flight extends Basedriver {
	
	@FindBy(xpath=".//*[@value='oneway']")
	WebElement chx_oneway;
	
	@FindBy(xpath=".//*[contains(@value,'roundtrip')]")
	WebElement chx_roundtrip; 
	
	@FindBy(xpath=".//*[contains(@name,'passCount')]")
	WebElement slct_passCount;
	
	@FindBy(xpath=".//*[contains(@name,'fromPort')]")
	WebElement slct_fromPort;
	
	@FindBy(xpath=".//*[contains(@name,'fromMonth')]")
	WebElement slct_fromMonth;
	
	@FindBy(xpath=".//*[contains(@name,'fromDay')]")
	WebElement slct_fromDay;
	
	@FindBy(xpath=".//*[contains(@name,'toPort')]")
	WebElement slct_toPort;
	
	@FindBy(xpath=".//*[contains(@name,'toMonth')]")
	WebElement slct_toMonth;
	
	@FindBy(xpath=".//*[contains(@name,'toDay')]")
	WebElement slct_toDay;
	
	@FindBy(xpath=".//*[contains(@name,'servClass')and @value='First']")
	WebElement chx_serviceclass;
	
	@FindBy(xpath=".//*[contains(@name,'airline')]")
	WebElement slct_airline;
	
	
	
	public Page_Flight() {
		PageFactory.initElements(driver, this);
	}



	public WebElement getChx_oneway() {
		return chx_oneway;
	}



	public void setChx_oneway(WebElement chx_oneway) {
		this.chx_oneway = chx_oneway;
	}



	public WebElement getChx_roundtrip() {
		return chx_roundtrip;
	}



	public void setChx_roundtrip(WebElement chx_roundtrip) {
		this.chx_roundtrip = chx_roundtrip;
	}



	public WebElement getSlct_passCount() {
		return slct_passCount;
	}



	public void setSlct_passCount(WebElement slct_passCount) {
		this.slct_passCount = slct_passCount;
	}



	public WebElement getSlct_fromPort() {
		return slct_fromPort;
	}



	public void setSlct_fromPort(WebElement slct_fromPort) {
		this.slct_fromPort = slct_fromPort;
	}



	public WebElement getSlct_fromMonth() {
		return slct_fromMonth;
	}



	public void setSlct_fromMonth(WebElement slct_fromMonth) {
		this.slct_fromMonth = slct_fromMonth;
	}



	public WebElement getSlct_fromDay() {
		return slct_fromDay;
	}



	public void setSlct_fromDay(WebElement slct_fromDay) {
		this.slct_fromDay = slct_fromDay;
	}



	public WebElement getSlct_toPort() {
		return slct_toPort;
	}



	public void setSlct_toPort(WebElement slct_toPort) {
		this.slct_toPort = slct_toPort;
	}



	public WebElement getSlct_toMonth() {
		return slct_toMonth;
	}



	public void setSlct_toMonth(WebElement slct_toMonth) {
		this.slct_toMonth = slct_toMonth;
	}



	public WebElement getSlct_toDay() {
		return slct_toDay;
	}



	public void setSlct_toDay(WebElement slct_toDay) {
		this.slct_toDay = slct_toDay;
	}



	public WebElement getChx_serviceclass() {
		return chx_serviceclass;
	}



	public void setChx_serviceclass(WebElement chx_serviceclass) {
		this.chx_serviceclass = chx_serviceclass;
	}



	public WebElement getSlct_airline() {
		return slct_airline;
	}



	public void setSlct_airline(WebElement slct_airline) {
		this.slct_airline = slct_airline;
	}

	

}
