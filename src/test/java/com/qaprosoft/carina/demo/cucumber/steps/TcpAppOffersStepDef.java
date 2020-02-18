package com.qaprosoft.carina.demo.cucumber.steps;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TCPLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TcpAppOfferPageBase;
import com.qaprosoft.carina.demo.utils.M1CloudActivities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class TcpAppOffersStepDef extends CucumberRunner {
	
	
	TcpAppOfferPageBase offer;
	
	@Given("^Open The TCP App HomePage$")
	public void tcpApppage() throws Exception {
		System.out.println("Appliction launched");
		M1CloudActivities mobile = new M1CloudActivities();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = mobile.setCapabilities("OnePlus7.properties");
		//getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host"));
		//Launch = initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), TCPLoginPageBase.class);
		offer= initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), TcpAppOfferPageBase.class);
		System.out.println("done");
		Thread.sleep(10000);
	}
	
	@Then("^I click on Offers button$")
	public void ClickonOffersButton() {
	
		offer.clickonOffersButton();
	}
	
	@Then("^I Click On Offline offer")
	public void ClickonofflineButton(){
		offer.pause(5);
		offer.clickonofflineButton();
		
		
	}
	@Then("^Click on Collect Offer$")
	public void Clickoncollectoffer(){
		
		offer.clickoncollectoffer();
	}
	
	
	
	@And("^Click on Stores NearBy$")
	public void ClickonStoresNearBy(){
		offer.clickonStoresNearBy();
		
	}
	
	

}
