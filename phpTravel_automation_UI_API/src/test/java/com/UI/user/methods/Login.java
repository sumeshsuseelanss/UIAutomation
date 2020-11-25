package com.UI.user.methods;

import com.UI.Events.Events;
import com.UI.objectMap.LoginObj;
import com.UI.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Login {


   public static void pagetTitle() throws InterruptedException {

   }

    public static void navigateLoginPage() throws InterruptedException {
       Events.clickEvent(Hooks.driver.findElement(By.xpath(".//*[contains(text(),'Sign In')]")));
       Thread.sleep(2000);


    }

   public static void enterUserNameAndPassword(String username, String password) throws InterruptedException {
      Events.enterText(Hooks.driver.findElement(By.name("UserName")),username);
      Events.enterText(Hooks.driver.findElement(By.name("Password")),password);
      Events.clickEvent(Hooks.driver.findElement(By.xpath(".//div[@id='undefined-third-google']")));
      Events.switchWindows("child");
      Events.enterText(Hooks.driver.findElement(By.name("identifier")),username);
      Events.clickEnter(Hooks.driver.findElement(By.name("identifier")));
      Thread.sleep(2000);
      Events.enterText(Hooks.driver.findElement(By.name("password")),password);
      Events.clickEnter(Hooks.driver.findElement(By.name("password")));
   }
   public static void validateHomePage() throws InterruptedException {
      Thread.sleep(6000);
      Events.switchWindows("parent");
      String expectedPageTitle = Events.getPageTitle();
      if(expectedPageTitle.contains("Trip.com Official Site"))
         System.out.println(expectedPageTitle);
   }
}
