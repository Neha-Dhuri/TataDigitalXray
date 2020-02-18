package com.qaprosoft.carina.demo.mobile.gui.pages.common;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class TcpAppOfferPageBase extends AbstractPage{

	public TcpAppOfferPageBase(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public abstract void clickonOffersButton();
	
	public abstract void clickonofflineButton();
	
	public abstract void clickoncollectoffer();
	
	public abstract void clickonStoresNearBy();
	public abstract void verifyDashboard();
}
