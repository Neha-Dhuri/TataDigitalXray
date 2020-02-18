package com.qk.tatadigital.cucumber.steps;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.core.foundation.utils.R;
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
	TcpAppOfferPageBase offer;
	
	DesiredCapabilities capabilities;
	
	
	
	@Given("^I am a new user$")
	public void TCPApplicationLaunch() throws Exception {
		System.out.println("Appliction launched");

		M1CloudActivities mobile = new M1CloudActivities();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = mobile.setCapabilities("OnePlus7.properties");
		Launch = initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), TCPLoginPageBase.class);
//		Launch = initPage(getDriver(), TCPLoginPageBase.class);
	}
	
	@And("^I signed-in to TCP mobile app/website$")
	public void signIn() {
		Launch.EnterValidNumber();
		Launch.clicks_on_Get_OTP_buttonNew();
	}
	
	@When("^I successfully validated OTP$")
	public void GETOTP() {
		Launch.EnterOTPNumber();
	}

	@Then("^I should redirect to registration page$")
	public void redirectToRegPage() {
		login = initPage(Launch.getDriver(), TataRegisterPageBase.class);
		login.verifyRegPage();
//		login.getDriver().close();
	}
	
	@Given("^Registration page is displayed$")
	public void registrationPage() throws Exception {
		M1CloudActivities mobile = new M1CloudActivities();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = mobile.setCapabilities("OnePlus7.properties");
		System.out.println(capabilities);
		Launch = initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), TCPLoginPageBase.class);
		/*Launch.EnterValidNumber();
		Launch.clicks_on_Get_OTP_buttonNew();
		
		Launch.EnterOTPNumber();*/
	
		login = initPage(Launch.getDriver(), TataRegisterPageBase.class);
		login.verifyRegPage();
	}

	
	@When("^all the mandatory fields are filled$")
	public void enterDetails() {
		login.enter_firstname("pooja");
		login.enter_lastname("dhenge");
		login.enter_email_Id("p@qk.com");
		login.click_on_calender();
		login.click_on_ok();
	}

	@And ("^Save button is clicked$")
	public void ClickonSavebtn()
	{		
		login.click_on_done();
	}
	
	@Then ("^Homepage should be displayed$")
	public void verifyHomePage()
	{
		offer = initPage(Launch.getDriver(), TcpAppOfferPageBase.class);
		offer.verifyDashboard();
	}
	
}


