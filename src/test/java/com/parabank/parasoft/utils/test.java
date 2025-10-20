package com.parabank.parasoft.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class test {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
        driver.manage().window();
        System.out.println(driver.findElement(By.cssSelector(".title")).getText());
        driver.quit();
    }
}
