package com.testrunner;



import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "/home/sumesh/Documents/Kafka/phpTravel_automation_UI_API/src/test/java/com/UI/feature"
        ,glue={"com/UI/stepDefinition"}
)

public class TestRunner {

}