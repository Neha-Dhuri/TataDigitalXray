package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class TataRegisterPageBase extends AbstractPage {
	
public TataRegisterPageBase(WebDriver driver){
	super(driver);
}
//	public abstract void typeNo(String num);
//
//	public abstract void EnterOtp(String otp) ;
//
//	public abstract void clickonDoneBtn();
//	
//	public abstract void Enterdetails(String string, String string2);
//	
//	
//	public abstract void enter_emialid(String string);
//	public abstract void enter_dob(String i);
//	public abstract void ClickonSavebtn();
	public abstract void enter_firstname(String fname);
	
	public abstract void enter_lastname(String lname);
	
	public abstract void enter_email_Id(String email);
	
	public abstract void click_on_calender();
	public abstract void verifyRegPage();
	public abstract void click_on_ok();
	public abstract void click_on_done();
}
