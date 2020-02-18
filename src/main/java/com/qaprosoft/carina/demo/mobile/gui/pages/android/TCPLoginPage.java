package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.utils.mobile.MobileUtils;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TCPLoginPageBase;


@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = TCPLoginPageBase.class)

public class TCPLoginPage extends TCPLoginPageBase {

	@FindBy(id="com.tatadigital.tcp:id/edtCountryCode")
	private ExtendedWebElement Launch;

	@FindBy(id="com.tatadigital.tcp:id/edtCountryData")
	private ExtendedWebElement CountryCode;

	@FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[1]/android.widget.TextView[3]")
	private ExtendedWebElement SelectCountryCode;

	@FindBy(id = "com.tatadigital.tcp:id/edtMobileNumber")
	private ExtendedWebElement InvalidNumber;

	@FindBy(id = "com.tatadigital.tcp:id/btnGetOtp")
	private ExtendedWebElement GetOTP;

	@FindBy(id = "com.tatadigital.tcp:id/edtMobileNumber")
	private ExtendedWebElement EnterNonNumericNo;

	@FindBy(id = "com.tatadigital.tcp:id/edtMobileNumber")
	private ExtendedWebElement ValidNumber;
	
	@FindBy(id = "com.tatadigital.tcp:id/edtOTP")
	private ExtendedWebElement EnterOTP;
	
	@FindBy(id = "com.tatadigital.tcp:id/btnDone")
	private ExtendedWebElement DoneClick;

	public TCPLoginPage(WebDriver driver) {
		super(driver);

	}

	@Override
	public void TCPApplicationLaunch() {
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	@Override
	public void ClickCountryCodeField() {
		Launch.click();
		Launch.click();
	}

	@Override
	public void SelectCountryCodeField() {
		pause(10);
		CountryCode.click();
		pause(10);
		CountryCode.type("India");
		pause(10);
		System.out.println("Showing Select Country code");
		MobileUtils.hideKeyboard();
	}

	@Override
	public void ShowSelectCountryCodeField() {
		SelectCountryCode.click();

	}

	@Override
	public void EnterInvalidNumber() {
		InvalidNumber.click();
		InvalidNumber.type("123456789");
		MobileUtils.hideKeyboard();
	}

	@Override
	public void GetOTPMethod(){
		GetOTP.click();
	}

	@Override
	public void validationMessage() {
		System.out.println("Please Enter Valid Number");
	}

	@Override
	public void NonNumericNo() {
		EnterNonNumericNo.click();
		EnterNonNumericNo.type("123@345$&6%");
		MobileUtils.hideKeyboard();
		GetOTP.click();
	}

	@Override
	public void NoCharacterallow() {
		System.out.println("characters should not be entered in mobile number field");
	}

	@Override
	public void EnterValidNumber() {
		ValidNumber.click();
		/*ValidNumber.type("9594673571");
		MobileUtils.hideKeyboard();
		ValidNumber.pause(5);
		*/
		 Random rnd = new Random();

         char [] digits = new char[6];

         digits[0] = (char) (rnd.nextInt(9) + '1');

         for(int i=1; i<digits.length; i++) {

             digits[i] = (char) (rnd.nextInt(10) + '0');

         }

                     ValidNumber.type("9594"+ new String(digits));
                     ValidNumber.pause(5);
	}
	
	public void clicks_on_Get_OTP_buttonNew() {
		GetOTP.click();
	}

	@Override
	public void EnterOTPNumber() {
		//EnterOTP.click();
		//EnterOTP.pause(10);
		EnterOTP.type("1234");
		pause(5);
		DoneClick.click();
		pause(30);
		}

}
