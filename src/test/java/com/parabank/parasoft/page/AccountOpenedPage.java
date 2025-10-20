package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOpenedPage extends Base_page {
    public AccountOpenedPage(WebDriver driver) {
        super(driver);
    }

    public boolean hasAccountOpenedId() {
        return getElements(By.cssSelector("a[id='newAccountId']")).size() > 0;
    }
}