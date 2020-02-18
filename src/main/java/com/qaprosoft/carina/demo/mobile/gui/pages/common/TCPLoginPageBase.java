package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class TCPLoginPageBase extends AbstractPage {

	public TCPLoginPageBase(WebDriver driver) {
		super(driver);
	}

	public abstract void TCPApplicationLaunch();

	public abstract void ClickCountryCodeField();

	public abstract void SelectCountryCodeField();

	public abstract void ShowSelectCountryCodeField();

	public abstract void EnterInvalidNumber();
	
	public abstract void GetOTPMethod();
	
	public abstract void validationMessage();
	
	public abstract void NonNumericNo();
	
	public abstract void NoCharacterallow();
	
	public abstract void EnterValidNumber();
	
	public abstract void clicks_on_Get_OTP_buttonNew();
	
	public abstract void EnterOTPNumber();
	
}
