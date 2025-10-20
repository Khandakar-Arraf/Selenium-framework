package com.parabank.parasoft.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TransferCompletePage extends Base_page {
    public TransferCompletePage(WebDriver driver) {
        super(driver);
    }

    public boolean isTransferComplete(int amount) throws InterruptedException {
        Thread.sleep(4);
        return getElement(By.id("amountResult")).getText().contains(String.valueOf(amount));
    }
}