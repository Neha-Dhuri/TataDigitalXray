package com.qaprosoft.carina.demo;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;
import cucumber.api.CucumberOptions;


@CucumberOptions(features = "src/test/resources/features/Qtrac.feature",
        glue = "com.qaprosoft.carina.demo.cucumber.steps",
        		format={"pretty",
                "html:target/cucumber-core-test-report",
                "pretty:target/cucumber-core-test-report.txt",
                "json:target/cucumber-core-test-report.json",
                "junit:target/cucumber-core-test-report.xml"}
        )

public class QtracCucumberTest extends CucumberBaseTest {
	//@Parameters({"DeviceName"})
	/*public void setCustCaps() throws Exception{
		M1CloudActivities mobile = new M1CloudActivities();
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities = mobile.setCapabilities("Samsung_Galaxy_J4_Plus.properties");
		getDriver("DEFAULT", capabilities, R.CONFIG.get("selenium_host"));
	}*/}
