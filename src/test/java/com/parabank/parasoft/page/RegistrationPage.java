package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends Base_page {

    RegistrationPage(WebDriver driver) {
        super(driver);
        driver.get("https://parabank.parasoft.com/parabank/register.htm");
    }

    public String checkformTitle(){
        return getElement(By.cssSelector(".title")).getText();

    }

    public RegistrationPage fillFirstName(String value){
        getElement(By.cssSelector("input[id='customer.firstName']")).sendKeys(value);
        return this;

    }

    public RegistrationPage fillLastName(String value){
        getElement(By.cssSelector("input[id='customer.lastName']")).sendKeys(value);
        return this;
    }


    public RegistrationPage fillAdress(String value){
        getElement(By.cssSelector("input[id='customer.address.street']")).sendKeys(value);
        return  this;
    }

    public RegistrationPage fillCity(String value){
       getElement(By.cssSelector("input[id='customer.address.city']")).sendKeys(value);
        return this;
    }

    public RegistrationPage fillState(String value){
        getElement(By.cssSelector("input[id='customer.address.state']")).sendKeys(value);
        return this;
    }

    public RegistrationPage fillZipCode(String value){
        getElement(By.cssSelector("input[id='customer.address.zipCode']")).sendKeys(value);
        return this;
    }

    public RegistrationPage fillPhone(String value){
        getElement(By.cssSelector("input[id='customer.phoneNumber']")).sendKeys(value);
        return this;
    }

    public  RegistrationPage fillSSN(String value){
        getElement(By.cssSelector("input[id='customer.ssn']")).sendKeys(value);
        return this;
    }

    public RegistrationPage fillUserName(String value){
        getElement(By.cssSelector("input[id='customer.username']")).sendKeys(value);
        return this;
    }

    public RegistrationPage fillPass(String value){
        getElement(By.cssSelector("input[id='customer.password']")).sendKeys(value);
        return this;
    }

    public RegistrationPage fillConfirm(String value){
        getElement(By.cssSelector("#repeatedPassword")).sendKeys(value);
        return this;
    }

}
