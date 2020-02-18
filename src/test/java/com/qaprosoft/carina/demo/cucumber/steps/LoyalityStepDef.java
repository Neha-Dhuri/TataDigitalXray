package com.qaprosoft.carina.demo.cucumber.steps;

import org.openqa.selenium.remote.DesiredCapabilities;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberRunner;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.LoyalityDetailBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.Loyality_HomeBasePage;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TCPLoginPageBase;
import com.qaprosoft.carina.demo.mobile.gui.pages.common.TcpAppOfferPageBase;
import com.qaprosoft.carina.demo.utils.M1CloudActivities;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoyalityStepDef extends CucumberRunner{
	
	LoyalityDetailBasePage detail=null;
	Loyality_HomeBasePage home=null;


/*
@Given("^start the given application$")
public void start() throws Exception {
System.out.println("hii***************************");
M1CloudActivities mobile = new M1CloudActivities();
DesiredCapabilities capabilities = new DesiredCapabilities();
capabilities = mobile.setCapabilities("OnePlus7.properties");
//getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host"));
detail = initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), LoyalityDetailBasePage.class);
home = initPage(getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host")), Loyality_HomeBasePage.class);
System.out.println("Appliction launched");

}*/

@Then("^landed to Loyalty Page$")
public void homepage()  {
   home.click_on_loyalty_tran_history();
   detail.click_on_first_tab();
   detail.quitDriver();
}


/////////////////////////////////////////////////////////////////
@Given("^launch_app$")
public void start2() throws Exception {
System.out.println("hii***************************");

detail = initPage(getDriver(), LoyalityDetailBasePage.class);
home = initPage(getDriver(), Loyality_HomeBasePage.class);
System.out.println("Appliction launched2");

}
@Then("^I click on loylity redemption$")
public void redemption()  {
	System.out.println("hiiiiii.....................");
	home.click_on_loyalty_redemption();
	detail.click_on_IHCL();
	detail.click_on_redeem();
	
}



}

