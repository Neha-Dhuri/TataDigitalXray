package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoyalityDetailBasePage;

//import com.qk.tatadigital.mobile.gui.common.LoyalityDetailBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoyalityDetailBasePage.class)
public class LoyalityDetailPage extends LoyalityDetailBasePage {


	public LoyalityDetailPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		}


//  @FindBy(xpath = "//android.widget.TextView[@text='0 - 2 Years']")
//  private ExtendedWebElement enter_firstname;
// 
//  @FindBy(xpath = "//android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup/android.view.ViewGroup/android.widget.TextView")
//  private ExtendedWebElement enter_lastname;
// 
//  @FindBy(xpath = "//android.widget.Button[@text='OK']")
//  private ExtendedWebElement enter_email_Id;
// 
//  @FindBy(xpath = "//android.widget.TextView[@text='Child Name']")
//  private ExtendedWebElement click_on_calender;
// 
//  @FindBy(xpath = "//android.widget.FrameLayout/android.view.ViewGroup[2]/android.view.ViewGroup[5]/android.view.ViewGroup/android.view.ViewGroup[4]/android.widget.EditText")
//  private ExtendedWebElement click_on_ok;
 
  @FindBy(xpath = "//hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.view.ViewGroup")
  private ExtendedWebElement click_on_first_tab;
  
  @FindBy(xpath = "//android.widget.TextView[@text='IHCL']")
  private ExtendedWebElement click_on_IHCL;
  
  @FindBy(xpath = "//android.widget.Button[@text='REDEEM']")
  private ExtendedWebElement click_on_redeem;
  
  
  @Override
 public void click_on_redeem()
 {
 pause(1);
 click_on_redeem.click();
 pause(2);


 }
  
  @Override
 public void click_on_IHCL()
 {
 pause(1);
 click_on_IHCL.click();
 pause(2);
 }

 
//  @Override
//public void enter_firstname(String fname)
//{
//pause(1);
//enter_firstname.click();
//pause(2);
//enter_firstname.type(fname);
//
//}
//
// 
//  @Override
//public void enter_lastname(String lname)
//{
//pause(1);
//enter_lastname.click();
//pause(2);
//enter_lastname.type(lname);
//
//}
//
// 
//  @Override
//public void enter_email_Id(String email)
//{
//pause(1);
//enter_email_Id.click();
//pause(2);
//enter_email_Id.type(email);
//
//}
//
// 
// @Override
//public void click_on_calender()
//{
//pause(1);
//click_on_calender.click();
//}
//
//
//@Override
//public void click_on_ok()
//{
//pause(1);
//click_on_ok.click();
//pause(2);
//}
@Override
public void click_on_first_tab()
{
pause(1);
click_on_first_tab.click();
pause(2);
}


}
