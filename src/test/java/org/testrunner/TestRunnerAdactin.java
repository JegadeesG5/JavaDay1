package org.testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "json:src\\test\\resources\\Reports\\Report.json"},  
                          features = "src\\test\\resources\\Feature\\Adactin.feature", dryRun = false, 
                              glue = {"org.stepdef.com"}, monochrome = false)

public class TestRunnerAdactin {

}
