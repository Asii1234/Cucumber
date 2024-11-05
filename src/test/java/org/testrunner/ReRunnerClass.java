package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "@Failed\\fb.txt",
glue = "org.sep",dryRun = false,
plugin = {"pretty","html:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\HTML Report",
		"junit:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\Junit Report\\fb.xml",
		"json:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\Json Report\\fb.json",
		"rerun:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Failed\\fb.txt"})
public class ReRunnerClass {

}
