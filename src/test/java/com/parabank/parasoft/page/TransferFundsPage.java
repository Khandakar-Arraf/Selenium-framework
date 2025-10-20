package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferFundsPage extends Base_page {
    public TransferFundsPage(WebDriver driver) {
        super(driver);
    }

    public TransferFundsPage fillAmount(int amount) throws InterruptedException {
        getElement(By.id("amount")).sendKeys(String.valueOf(amount));
        Thread.sleep(5);
        return this;
    }

    public TransferFundsPage selectFromAccount(int index) throws InterruptedException {
        Thread.sleep(5);
        select(By.id("fromAccountId")).selectByIndex(index);
        return this;
    }

    public TransferFundsPage selectToAccount(int index) throws InterruptedException {
        Thread.sleep(5);
        select(By.id("toAccountId")).selectByIndex(index);
        return this;
    }

    public TransferCompletePage clickTransferButton() {
        click(By.cssSelector("input[value='Transfer']"));
        return goTo(TransferCompletePage.class);
    }
}