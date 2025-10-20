package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;



public class Base_page extends Page{

    public Base_page(WebDriver driver) {
        super(driver);
    }

    @Override
    Select select(By locator) {
        addInfo("Selenium Webdriver going to create a Select object for WebElement with " + locator + " Locator");
        return new Select(getElement(locator));
    }

    @Override
    void click(By locator) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(getElement(locator)));
        }
        catch (NoSuchElementException e){
            System.err.println("No such element found:"+locator);
        }
    }


    @Override
    public WebElement getElement(By locator) {
        try {
            driver.findElement(locator);
        }
        catch (NoSuchElementException e){
            System.err.println("No such element found:"+locator);
        }
        catch (Exception e) {
            System.err.println("Unexpected error in getWebElement: " + e.getMessage());
        }
        return null;
    }

    @Override
    List<WebElement> getElements(By locator) {
        try {
            driver.findElements(locator);
        }
        catch (NoSuchElementException e){
            System.err.println("No such element found:"+locator);
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }

        return null;
    }

    @Override
    public String getTitle() {
        return driver.getTitle();
    }


    @Override
    String getText(By locator) {
        return driver.findElement(locator).getText().strip();
    }

    @Override
    public void setWait(By selector) {
        try {
            addInfo("Selenium Webdriver going to wait for visibility of WebElement with " + selector + " Locator");
            wait.until(ExpectedConditions.visibilityOf(getElement(selector)));
            addInfo("Selenium Webdriver confirmed visibility of WebElement with " + selector + " Locator");

        } catch (NoSuchElementException e) {
            System.err.println("Element not clickable: " + selector);
        } catch (Exception e) {
            System.err.println("Unexpected error during Wait: " + e.getMessage());
        }

    }
}
