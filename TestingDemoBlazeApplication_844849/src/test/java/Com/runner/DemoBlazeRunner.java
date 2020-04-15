package Com.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/main/resources/Feature/Testcase.feature",
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html","html:test-output","json:json_output/cucumber.json","junit:junit_xml/cucumber.xml"},
tags= {"@tc01_demoblazeloginusingexcel,@tc02_demoblazeloginandlogout,@tc03_demoblazeupdatecart,@tc04_demoblazeplacetheorder"},
monochrome=true,
glue= {"Com.Stepdefinition"}

)
public class DemoBlazeRunner {

	@AfterClass
	public static void writeExtentReport() {
	    Reporter.loadXMLConfig("src\\main\\resources\\extent-config.xml");
	}
}
