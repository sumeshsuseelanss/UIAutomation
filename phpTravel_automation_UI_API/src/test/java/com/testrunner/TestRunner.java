package com.testrunner;



import com.cucumber.listener.Reporter;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


import java.io.File;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/com/UI/feature"
        ,glue={"com/UI/stepDefinition"},
        plugin = { "com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/report.html"},
        monochrome = true
)

public class TestRunner {

    public String getReportConfigPath(){
        String reportConfigPath=  "D:/git/UIAutomation/phpTravel_automation_UI_API/src/test/java/com/configs/ extent-config.xml";
        if(reportConfigPath!= null) return reportConfigPath;
        else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");
    }
    @AfterClass
        public static void writeExtentReport() {
        Reporter.loadXMLConfig(new File("D:/git/UIAutomation/phpTravel_automation_UI_API/src/test/java/com/configs/ extent-config.xml"));
        Reporter.setSystemInfo("User Name", System.getProperty("user.name"));
        Reporter.setSystemInfo("Time Zone", System.getProperty("user.timezone"));
        Reporter.setSystemInfo("Machine", "Windows 10" + "64 Bit");
        Reporter.setSystemInfo("Selenium", "3.7.0");
        Reporter.setSystemInfo("Maven", "3.5.2");
        Reporter.setSystemInfo("Java Version", "1.8.0_151");
        }
}