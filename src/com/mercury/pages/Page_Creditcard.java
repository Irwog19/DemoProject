package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_Creditcard extends Basedriver{
	
	//credit card info
	@FindBy(xpath=".//*[contains(@name,'creditCard')]")
	WebElement slct_creditCard;
	
	@FindBy(xpath=".//*[contains(@name,'creditnumber')]")
	WebElement tx_creditnumber;
	
	@FindBy(xpath=".//*[contains(@name,'cc_exp_dt_mn')]")
	WebElement slct_expirymonth;
	
	@FindBy(xpath=".//*[contains(@name,'cc_exp_dt_yr')]")
	WebElement slct_expiryyear;
	
	@FindBy(xpath=".//*[contains(@name,'cc_frst_name')]")
	WebElement tx_ccfirstname;
	
	@FindBy(xpath=".//*[contains(@name,'cc_mid_name')]")
	WebElement tx_ccmidname;
	
	@FindBy(xpath=".//*[contains(@name,'cc_last_name')]")
	WebElement tx_cclastname;

	public Page_Creditcard() {
		PageFactory.initElements(driver, this);
	}

	public WebElement getTx_ccfirstname() {
		return tx_ccfirstname;
	}

	public void setTx_ccfirstname(WebElement tx_ccfirstname) {
		this.tx_ccfirstname = tx_ccfirstname;
	}

	public WebElement getTx_ccmidname() {
		return tx_ccmidname;
	}

	public void setTx_ccmidname(WebElement tx_ccmidname) {
		this.tx_ccmidname = tx_ccmidname;
	}

	public WebElement getTx_cclastname() {
		return tx_cclastname;
	}

	public void setTx_cclastname(WebElement tx_cclastname) {
		this.tx_cclastname = tx_cclastname;
	}

	public WebElement getSlct_creditCard() {
		return slct_creditCard;
	}

	public void setSlct_creditCard(WebElement slct_creditCard) {
		this.slct_creditCard = slct_creditCard;
	}

	public WebElement getTx_creditnumber() {
		return tx_creditnumber;
	}

	public void setTx_creditnumber(WebElement tx_creditnumber) {
		this.tx_creditnumber = tx_creditnumber;
	}

	public WebElement getSlct_expirymonth() {
		return slct_expirymonth;
	}

	public void setSlct_expirymonth(WebElement slct_expirymonth) {
		this.slct_expirymonth = slct_expirymonth;
	}

	public WebElement getSlct_expiryyear() {
		return slct_expiryyear;
	}

	public void setSlct_expiryyear(WebElement slct_expiryyear) {
		this.slct_expiryyear = slct_expiryyear;
	}
}
