package com.qk.tatadigital.cucumber.step;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoyalityDetailBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Loyality_HomeBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.QtracLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TCPLoginPageBase;
//import com.qaprosoft.carina.demo.mobile.gui.pages.common.TCP_LoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TataRegisterPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TcpAppOfferPageBase;
import com.qaprosoft.carina.demo.utils.M1CloudActivities;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

//import com.qaprosoft.carina.demo.mobile.gui.pages.common.TCP_LoginPageBase;

public class TCP_CucumberStepdef extends CucumberRunner {

	TCPLoginPageBase Launch;
	TataRegisterPageBase login;
	LoyalityDetailBasePage detail;
	Loyality_HomeBasePage home;
	TcpAppOfferPageBase offer;
	
	@Given("^TCP app is launched$")
	public void TCPApplicationLaunch() throws Exception {
		System.out.println("Appliction launched");
		M1CloudActivities mobile = new M1CloudActivities();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = mobile.setCapabilities("Honor7C_Android.properties");
		//getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host"));
		Launch = initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), TCPLoginPageBase.class);
		// getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host"));
//		Launch = initPage(getDriver(), TCPLoginPageBase.class);
	}

	@When("^user clicks/taps on Country code field$")
	public void ClickCountryCode() {
		System.out.println("Click on Country code field");
//		Launch.ClickCountryCodeField();
	}

	@And("^selcts the country code$") public void SelectCountryCode() {
		System.out.println("Select Country code field");
//		Launch.SelectCountryCodeField(); 
		}

	@Then("^selected country code should be displayed in Country code field$")
	public void ShowSelectCountryCode() {
		System.out.println("Show Select Country code field");
//		Launch.ShowSelectCountryCodeField(); 
		}


	@When("^user enters valid number with respect to country code$")
	public void ValidNumber() {
		Launch.EnterValidNumber();
	}

	@And("^clicks on  Get OTP buttontwo$")
	public void clicks_on_Get_OTP_button() {
		Launch.clicks_on_Get_OTP_buttonNew();
	}
	
	@Then("^Enter Otp field should be displayed$")
	public void GETOTP() {
		Launch.EnterOTPNumber();
	}
	
	
	@When("^I entered one character in First_name and Last_name$")
	public void enter_details() {
		System.out.println("test start");
		login = initPage(Launch.getDriver(), TataRegisterPageBase.class);
		login.enter_firstname("pooja");
		login.enter_lastname("dhenge");
	}
	@Then("^enter Email_id$")
	public void enter_email_Id() {
		login.enter_email_Id("p@qk.com");
	}
	
	@Then ("^enter date_of_birth$")
	public void enter_dob()
	{
		login.click_on_calender();
		login.click_on_ok();
	}
	
	@And ("^I clicked on save button$")
	public void ClickonSavebtn()
	{
		login.click_on_done();
	}
	

	
	@Then("^I click on Offers button$")
	public void ClickonOffersButton() {
		
		offer = initPage(Launch.getDriver(), TcpAppOfferPageBase.class);
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
		offer.navigateBack();
		offer.navigateBack();
		offer.navigateBack();
	}


@Then("^landed to Loyalty Page$")
public void homepage()  {
	detail = initPage(Launch.getDriver(), LoyalityDetailBasePage.class);
	home = initPage(Launch.getDriver(), Loyality_HomeBasePage.class);
   home.click_on_loyalty_tran_history();
   detail.click_on_first_tab();
//   detail.quitDriver();
}


/////////////////////////////////////////////////////////////////


@Then("^I click on loylity redemption$")
public void redemption()  {
	
	System.out.println("hiiiiii.....................");
	home.click_on_loyalty_redemption();
	detail.click_on_IHCL();
	detail.click_on_redeem();
	
}

	
	
}


