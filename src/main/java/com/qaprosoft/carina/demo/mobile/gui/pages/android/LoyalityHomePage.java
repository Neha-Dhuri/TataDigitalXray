package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Loyality_HomeBasePage;

//import com.qk.tatadigital.mobile.gui.common.Loyality_HomeBasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;


@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = Loyality_HomeBasePage.class)
public class LoyalityHomePage extends Loyality_HomeBasePage {


	public LoyalityHomePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
		}


  @FindBy(xpath = "//android.widget.TextView[@text='Loyalty Transaction History']")
  private ExtendedWebElement click_on_loyalty_tran_history;
 
  @FindBy(xpath = "//android.widget.TextView[@text='Loyalty Redemption']")
  private ExtendedWebElement click_on_loyalty_redemption;
   


 
  @Override
public void click_on_loyalty_tran_history()
{
pause(1);
click_on_loyalty_tran_history.click();
pause(2);

}

 
  @Override
public void click_on_loyalty_redemption()
{
pause(1);
click_on_loyalty_redemption.click();
pause(2);

}



}

