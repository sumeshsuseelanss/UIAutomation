package com.UI.stepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class PhpTravelLoginStepDefintion {
    PhpTravelLoginStepDefintion()
    {
        System.out.println("constructor of PhpTravelLoginStepDefintion");
    }
    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        Hooks.driver.manage().window().maximize();
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {

    }

    @When("^User enters UserName and Password$")
    public void user_enters_UserName_and_Password() throws Throwable {

    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {

    }

}
