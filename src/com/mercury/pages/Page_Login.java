package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_Login extends Basedriver {
	
	@FindBy(name="userName")
	WebElement tx_userName;
	
	@FindBy(name="password")
	WebElement tx_password;
	
	@FindBy(xpath=".//*[contains(@name,'login')]")
	WebElement btn_login;
	
	public Page_Login() {
		PageFactory.initElements(driver, this);
		
	}

	public WebElement getTx_userName() {
		return tx_userName;
	}

	public void setTx_userName(WebElement tx_userName) {
		this.tx_userName = tx_userName;
	}

	public WebElement getTx_password() {
		return tx_password;
	}

	public void setTx_password(WebElement tx_password) {
		this.tx_password = tx_password;
	}

	public WebElement getBtn_login() {
		return btn_login;
	}

	public void setBtn_login(WebElement btn_login) {
		this.btn_login = btn_login;
	}
	
	

}
