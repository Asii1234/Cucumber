package org.testrunner;

import java.util.List;

import org.helping.JvmReport;
import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\src\\test\\resources\\Features",
glue = "org.sep",dryRun = false,
plugin = {"pretty","html:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\HTML Report",
		"junit:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\Junit Report\\fb.xml",
		"json:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\Json Report\\fb.json",
		"rerun:C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Failed\\fb.txt"})
public class Runner {

	@AfterClass
	public static void report() {
JvmReport.generateJvmReport("C:\\Users\\Admin\\eclipse-workspace\\n\\10AMCucumberBatch\\Reports\\Json Report\\fb.json");
	}
	
}
