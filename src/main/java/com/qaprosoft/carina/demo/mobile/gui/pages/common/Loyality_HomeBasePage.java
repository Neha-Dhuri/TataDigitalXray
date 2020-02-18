package com.qaprosoft.carina.demo.mobile.gui.pages.common;
import java.util.HashMap;

import org.openqa.selenium.WebDriver;

import com.qaprosoft.carina.core.gui.AbstractPage;

public abstract class Loyality_HomeBasePage extends AbstractPage {

public Loyality_HomeBasePage(WebDriver driver) {
super(driver);

}

public abstract void click_on_loyalty_tran_history();

public abstract void click_on_loyalty_redemption();

}
