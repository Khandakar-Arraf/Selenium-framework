package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login_page extends Base_page {
    Login_page(WebDriver driver){
        super(driver);

    }

    public Login_page fillname(String name){
        getElement(By.cssSelector("input[name='username']")).sendKeys(name);
        return this;
    }

    public Login_page fillpass(String pass){
        getElement(By.cssSelector("input[name='password']")).sendKeys(pass);
        return this;
    }

    public Login_page clickLoginBtn(){
        getElement(By.cssSelector("input[value='Log In']")).click();
        return this;
    }

    public RegistrationPage clickRegisterLink() {
        click(By.linkText("Register"));
        return goTo(RegistrationPage.class);
    }





}
