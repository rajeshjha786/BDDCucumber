package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = {
		"C:/Users/rajes/workspace/BDDCucumber/src/test/resources/Features/login.feature" }, glue = {
				"StepDefinitions" }, plugin = { "pretty", "html:target/htmlreport.html" })

public class Runner extends AbstractTestNGCucumberTests {

}
