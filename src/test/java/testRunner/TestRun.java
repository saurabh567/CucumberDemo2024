package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {".//features/login.feature"}, glue="stepDefinitions",
plugin = { "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class TestRun {
	

}
