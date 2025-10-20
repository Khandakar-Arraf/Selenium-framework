package com.parabank.parasoft.page;

import org.openqa.selenium.WebDriver;

public class Services extends Base_page {
    Services(WebDriver driver){
        super(driver);
        driver.get("https://parabank.parasoft.com/parabank/about.htm;jsessionid=A5D00634F65494DE44A7EBEBF724DA11");
    }
}
