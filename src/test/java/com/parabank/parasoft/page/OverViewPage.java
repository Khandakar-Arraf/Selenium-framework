package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OverViewPage extends Base_page {
    public OverViewPage(WebDriver driver) {
        super(driver);
    }


    public OpenNewAccountPage clickOpenNewAccountLink() {
        click(By.cssSelector("a[href='openaccount.htm']"));
        return goTo(OpenNewAccountPage.class);
    }

    public TransferFundsPage clickTransferFundsLink() {
        click(By.cssSelector("a[href='transfer.htm']"));
        return goTo(TransferFundsPage.class);
    }
}