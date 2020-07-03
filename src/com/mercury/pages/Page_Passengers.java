package com.mercury.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.mercury.basedriver.Basedriver;

public class Page_Passengers extends Basedriver {
	
	// passenger 1
	@FindBy(xpath=".//*[contains(@name,'passFirst0')]")
	WebElement tx_passFirst0;
	
	@FindBy(xpath=".//*[contains(@name,'passLast0')]")
	WebElement tx_passLast0;
	
	@FindBy(xpath=".//*[contains(@name,'pass.0.meal')]")
	WebElement slct_passmeal0;
	
	// passenger 2
		@FindBy(xpath=".//*[contains(@name,'passFirst1')]")
		WebElement tx_passFirst1;
		
		@FindBy(xpath=".//*[contains(@name,'passLast1')]")
		WebElement tx_passLast1;
		
		@FindBy(xpath=".//*[contains(@name,'pass.1.meal')]")
		WebElement slct_passmeal1;
		
		public Page_Passengers() {
			PageFactory.initElements(driver, this);
			
			
		}

		public WebElement getTx_passFirst0() {
			return tx_passFirst0;
		}

		public void setTx_passFirst0(WebElement tx_passFirst0) {
			this.tx_passFirst0 = tx_passFirst0;
		}

		public WebElement getTx_passLast0() {
			return tx_passLast0;
		}

		public void setTx_passLast0(WebElement tx_passLast0) {
			this.tx_passLast0 = tx_passLast0;
		}

		public WebElement getSlct_passmeal0() {
			return slct_passmeal0;
		}

		public void setSlct_passmeal0(WebElement slct_passmeal0) {
			this.slct_passmeal0 = slct_passmeal0;
		}

		public WebElement getTx_passFirst1() {
			return tx_passFirst1;
		}

		public void setTx_passFirst1(WebElement tx_passFirst1) {
			this.tx_passFirst1 = tx_passFirst1;
		}

		public WebElement getTx_passLast1() {
			return tx_passLast1;
		}

		public void setTx_passLast1(WebElement tx_passLast1) {
			this.tx_passLast1 = tx_passLast1;
		}

		public WebElement getSlct_passmeal1() {
			return slct_passmeal1;
		}

		public void setSlct_passmeal1(WebElement slct_passmeal1) {
			this.slct_passmeal1 = slct_passmeal1;
		}

}
