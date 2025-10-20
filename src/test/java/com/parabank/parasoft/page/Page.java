package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.Status;
import com.parabank.parasoft.report.ReportTestManager;
import java.lang.reflect.InvocationTargetException;
import java.time.Duration;

import java.util.List;

public abstract class Page {
    WebDriver driver;
    WebDriverWait wait;
    Page(WebDriver driver){
        this.driver=driver;
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));

    };
    abstract Select select(By locator);
    abstract WebElement getElement(By locator);
    abstract List<WebElement> getElements(By locator);
    abstract String getTitle();
    abstract void click(By locator);
    abstract String getText(By locator);
    public abstract void setWait(By selector);

    public <T extends Base_page> T goTo(Class<T> pageclass) {

        try {
            return pageclass.getDeclaredConstructor(WebDriver.class).newInstance(driver);
        }
        catch (InvocationTargetException | InstantiationException | IllegalAccessException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }

    }

    public void addInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.INFO, message);
        }
    }

    public void addFailInfo(String message) {
        if (ReportTestManager.getTest() != null) {
            ReportTestManager.getTest().log(Status.FAIL, message);
        }
    }


}
