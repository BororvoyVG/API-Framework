package com.apiframework;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "com.epam.reportportal.cucumber.ScenarioReporter"}, features = "src/test/resources/features/placeholder.feature")
public class CucumberTest {

}
