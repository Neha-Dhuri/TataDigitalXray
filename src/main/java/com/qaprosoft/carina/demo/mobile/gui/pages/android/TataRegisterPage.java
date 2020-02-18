package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
//import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataRegisterPageBase;

import junit.framework.Assert;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = TataRegisterPageBase.class)
public class TataRegisterPage extends TataRegisterPageBase {
	
	public TataRegisterPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	//String msg;
//
//	@FindBy(xpath="//android.widget.EditText[@text='Enter phone number here']")
//private ExtendedWebElement mobNo;
//	
//	@FindBy(xpath="//android.widget.TextView[@text='Get OTP']")
//	private ExtendedWebElement Getotp1;
//	
//	@FindBy(xpath="//android.widget.TextView[@text='Enter OTP here']")
//	private ExtendedWebElement enterotp;
//	
//	@FindBy(xpath="")
//	private ExtendedWebElement clickBtn;
	
//	@FindBy(xpath="//android.widget.TextView[@text='0 - 2 Years']")
//	private ExtendedWebElement fname;
//	@FindBy(xpath="//android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
//	private ExtendedWebElement lname;
//	@FindBy(xpath="//android.widget.Button[@text='OK']")
//	private ExtendedWebElement emailid1;
//	@FindBy(xpath="//android.widget.TextView[@text='Child Name']")
//	private ExtendedWebElement Date_of_birth;
//	
//	@FindBy(xpath="//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
//	private ExtendedWebElement savebtn;
	
	
	
  @FindBy(xpath = "//android.widget.EditText[@text='First Name']")
  private ExtendedWebElement enter_firstname;

  @FindBy(xpath = "//android.widget.EditText[@text='Last Name']")
  private ExtendedWebElement enter_lastname;

  @FindBy(xpath = "//android.widget.EditText[@text='Email ID']")
  private ExtendedWebElement enter_email_Id;

  @FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.view.ViewGroup/android.widget.EditText[4]")
  private ExtendedWebElement click_on_calender;

  @FindBy(xpath = "//android.widget.Button[@text='OK']")
  private ExtendedWebElement click_on_ok;
  
  @FindBy(xpath = "//android.widget.TextView[@text='Done']")
  private ExtendedWebElement click_on_done;
 
 
 
 public void verifyRegPage(){
	 Assert.assertEquals(enter_firstname.isPresent(), true);
 }
  
 
  @Override
public void enter_firstname(String fname)
{
pause(1);
enter_firstname.click();
pause(2);
enter_firstname.type(fname);

}


  @Override
public void enter_lastname(String lname)
{
pause(1);
enter_lastname.click();
pause(2);
enter_lastname.type(lname);

}


  @Override
public void enter_email_Id(String email)
{
pause(1);
enter_email_Id.click();
pause(2);
enter_email_Id.type(email);

}


 @Override
public void click_on_calender()
{
pause(1);
click_on_calender.click();
}


@Override
public void click_on_ok()
{
pause(1);
click_on_ok.click();
pause(2);
}

@Override
public void click_on_done()
{
pause(1);
click_on_done.click();
pause(2);
}
}

	
