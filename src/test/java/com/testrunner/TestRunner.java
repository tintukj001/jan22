package com.testrunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features= "./EmiratesFeature/emirates.feature",
		glue= "com.stepdefnition"
		)

public class TestRunner extends AbstractTestNGCucumberTests {

}
