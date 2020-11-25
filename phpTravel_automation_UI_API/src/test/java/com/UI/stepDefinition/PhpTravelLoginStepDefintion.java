package com.UI.stepDefinition;

import com.UI.Events.Events;
import com.UI.objectMap.LoginObj;
import com.UI.user.methods.Login;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class PhpTravelLoginStepDefintion {


    @Given("^User is on Home Page$")
    public void user_is_on_Home_Page() throws Throwable {
        Hooks.driver.manage().window().maximize();
    }

    @When("^User Navigate to LogIn Page$")
    public void user_Navigate_to_LogIn_Page() throws Throwable {
        Login.navigateLoginPage();
    }

    @When("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void user_enters_and(String userName, String password) throws Throwable {
        Login.enterUserNameAndPassword(userName,password);
    }

    @Then("^Message displayed Login Successfully$")
    public void message_displayed_Login_Successfully() throws Throwable {
      Login.validateHomePage();
    }

}
