package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_SecurePurchaseAndLogout extends Basedriver {
	
	@FindBy(xpath=".//*[contains(@name,'delCountry')]//following::td//input[@name='buyFlights']")
	WebElement btn_securepurchase;
	
	@FindBy(xpath=".//*[contains(@src,'Logout')]")
	WebElement btn_logout;
	
	public Page_SecurePurchaseAndLogout() {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getBtn_securepurchase() {
		return btn_securepurchase;
	}

	public void setBtn_securepurchase(WebElement btn_securepurchse) {
		this.btn_securepurchase = btn_securepurchse;
	}

	public WebElement getBtn_logout() {
		return btn_logout;
	}

	public void setBtn_logout(WebElement btn_logout) {
		this.btn_logout = btn_logout;
	}

}
