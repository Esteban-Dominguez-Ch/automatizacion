package com.automatizacion;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features",
    glue = "com.automatizacion.steps",
    plugin = {"pretty", "html:target/cucumber-report.html"}
)
public class RunCucumberTest {
}