package com.UI.stepDefinition;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Hooks {
    public static String currentProjectPath;
    public static WebDriver driver;
    public static String URL;
    public static String Browser;
    public static String Automation;


    @Before
    public void beforeScenario() {
        try (InputStream input = new FileInputStream("/home/sumesh/Documents/Kafka/phpTravel_automation_UI_API/src/test/resources/environment.properties")) {
            Properties prop = new Properties();
            prop.load(input);
            URL = prop.getProperty("url");
            Automation = prop.getProperty("Automation");
            Browser = prop.getProperty("browser");
            if (Browser.equalsIgnoreCase("chrome")) {
                System.setProperty("webdriver.chrome.driver", "/home/sumesh/Documents/Kafka/phpTravel_automation_UI_API/src/chromedriver_linux64/chromedriver");
                driver = new ChromeDriver();
                driver.get(URL);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

    }

    @After
    public void afterScenario() {
        System.out.println("This will run after the Scenario");
    }
}
