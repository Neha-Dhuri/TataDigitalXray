package com.qaprosoft.carina.demo;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import com.qaprosoft.carina.core.foundation.cucumber.CucumberBaseTest;
import com.qaprosoft.carina.core.foundation.utils.R;
import com.qaprosoft.carina.demo.utils.M1CloudActivities;

import cucumber.api.CucumberOptions;


@CucumberOptions(
features = {
		"src/test/resources/features/TCP_features/1_TADI-8,TADI-9.feature"
//		,
//		"src/test/resources/features/TCP_features/CLoyality.feature",
//	"src/test/resources/features/TCP_features/Doffers.feature"
		},
        glue = "com.qk.tatadigital.cucumber.steps",
        format={"pretty",
                "html:target/cucumber-core-test-report",
                "pretty:target/cucumber-core-test-report.txt",
                "json:target/cucumber-core-test-report.json",
                "junit:target/cucumber-core-test-report.xml"} 
        )


public class TCP_CucumberTest1 extends CucumberBaseTest {
}