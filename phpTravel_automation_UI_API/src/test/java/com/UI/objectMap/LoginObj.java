package com.UI.objectMap;

import com.UI.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginObj {
   public static String test ="sumesh";
   public static WebElement loginMyAccountBtn = Hooks.driver.findElement(By.xpath(".//*[contains(text(),'Sign In')]"));
   public static WebElement emailText = Hooks.driver.findElement(By.name("UserName"));
   public static WebElement passwordText = Hooks.driver.findElement(By.name("Password"));
   public static WebElement submitBtn = Hooks.driver.findElement(By.xpath(".//button[contains(text(),'Login')]"));
}
