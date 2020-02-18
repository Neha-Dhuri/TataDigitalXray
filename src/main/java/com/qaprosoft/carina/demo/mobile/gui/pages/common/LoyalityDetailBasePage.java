package com.qaprosoft.carina.demo.mobile.gui.pages.common;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class LoyalityDetailBasePage extends AbstractPage {

public LoyalityDetailBasePage(WebDriver driver) {
super(driver);

}

//public abstract void enter_firstname(String fname);
//
//public abstract void enter_lastname(String lname);
//
//public abstract void enter_email_Id(String email);
//
//public abstract void click_on_calender();
//
//public abstract void click_on_ok();
//
//public abstract void click_on_done_secpage();

public abstract void click_on_redeem();

public abstract void click_on_IHCL();

public abstract void click_on_first_tab();

}
