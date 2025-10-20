package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenNewAccountPage extends Base_page {
    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }

    public OpenNewAccountPage selectAccountType(int index) {
        select(By.cssSelector("select[id='type']")).selectByIndex(index);
        return this;
    }

    public OpenNewAccountPage selectFromAccount(int index) {
        select(By.id("fromAccountId")).selectByIndex(index);
        return this;
    }

    public AccountOpenedPage clickOpenNewAccountButton() {
        click(By.cssSelector("input[value='Open New Account']"));
        return goTo(AccountOpenedPage.class);
    }
}