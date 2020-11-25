package com.UI.Events;

import com.UI.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Iterator;
import java.util.Set;

public class Events {
    public static void mouseHover(WebElement webObject){
        Actions actions = new Actions(Hooks.driver);
        WebElement menuOption = webObject;
        actions.moveToElement(menuOption).perform();

    }
    public static String getPageTitle(){
        String pageTitle = Hooks.driver.getTitle();
        return pageTitle;
    }
    public static void clickEvent(WebElement webObject){
        webObject.click();
    }
    public static void enterText(WebElement webObject,String text){
        webObject.sendKeys(text);
    }

    public static void dragAndDrop(WebElement From, WebElement To ){
        Actions act=new Actions(Hooks.driver);
        act.dragAndDrop(From, To).build().perform();
    }
    public static void clickEnter(WebElement ele ){
       ele.sendKeys(Keys.ENTER);
    }

    public static void switchWindows(String handles){
        if(handles.contains("child")) {
             String parent = Hooks.driver.getWindowHandle();
            Set<String> s = Hooks.driver.getWindowHandles();
            Iterator<String> I1 = s.iterator();
            while (I1.hasNext()) {
                String child_window = I1.next();
                if (!parent.equals(child_window)) {
                    Hooks.driver.switchTo().window(child_window);
                    System.out.println("handles ---> "+Hooks.driver.switchTo().window(child_window).getTitle());
                }
            }
        }else{
            Set<String> ss = Hooks.driver.getWindowHandles();
            Iterator<String> I1 = ss.iterator();
            while (I1.hasNext()) {
                String child_window = I1.next();
                    Hooks.driver.switchTo().window(child_window);
                    System.out.println("handles ---> "+Hooks.driver.switchTo().window(child_window).getTitle());
                }
        }
    }
}
