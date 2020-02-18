package com.qaprosoft.carina.demo.mobile.gui.pages.android;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType;
import com.qaprosoft.carina.core.foundation.utils.factory.DeviceType.Type;
import com.qaprosoft.carina.core.foundation.webdriver.decorator.ExtendedWebElement;
//import com.qk.tatadigital.mobile.gui.common.TcpAppOfferPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TcpAppOfferPageBase;

@DeviceType(pageType = Type.ANDROID_PHONE, parentClass = TcpAppOfferPageBase.class)
public class TcpAppOfferPage extends TcpAppOfferPageBase{

	public TcpAppOfferPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//android.widget.TextView[@text='Offers']")
	private ExtendedWebElement offersButton;
	
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[2]/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.LinearLayout[1]/androidx.recyclerview.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.widget.TextView")
	private ExtendedWebElement offlineButton;
	
	@FindBy(id="com.tatadigital.tcp:id/btnTwo")
	private ExtendedWebElement collectofferbutton;
	
	@FindBy(xpath="//android.widget.Button[@resource-id='com.tatadigital.tcp:id/btnOne']")
	private ExtendedWebElement storesnearbybutton;
	
	@Override
	public void verifyDashboard() {
		// TODO Auto-generated method stub
		Assert.assertEquals(offersButton.isPresent(), true);
	}

	@Override
	public void clickonOffersButton() {
		// TODO Auto-generated method stub
		offersButton.click();
	}

	@Override
	public void clickonofflineButton() {
		// TODO Auto-generated method stub
		offlineButton.click();;
	}

	@Override
	public void clickoncollectoffer() {
		// TODO Auto-generated method stub
		collectofferbutton.click();
	}

	@Override
	public void clickonStoresNearBy() {
		// TODO Auto-generated method stub
		storesnearbybutton.click();
		pause(10);
	}
	
	
	
	
	

}
