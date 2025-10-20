package com.parabank.parasoft.test;

import com.parabank.parasoft.page.*;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TransferFundsTest extends BaseTest {
    @Test
    public void transferFundsV1ShouldSucceed() {
        Login_page loginPg = pg.goTo(Login_page.class);

        OverViewPage overViewPg = loginPg
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn();
        Assert.assertTrue(overViewPg.isLogOutLinkDisplayed());

        TransferFundsPage openNewAccountPg = overViewPg
                .clickTransferFundsLink();

        int amount = 1000;
        TransferCompletePage transferCompletePg = openNewAccountPg
                .fillAmount(amount)
                .clickTransferButton();

        Assert.assertTrue(transferCompletePg.isTransferComplete(amount));
    }

    @Test
    public void transferFundsV2ShouldSucceed() {
        int amount = 1000;
        TransferCompletePage transferCompletePg = pg.goTo(LoginPage.class)
                .fillUsername(getUsername())
                .fillPassword(getPassword())
                .clickLoginBtn()
                .clickTransferFundsLink()
                .fillAmount(amount)
                .clickTransferButton();
        Assert.assertTrue(transferCompletePg.isTransferComplete(amount));
    }


    @Test
    public void transferFundsV3ShouldSucceed() {
        int amount = 1000;
        TransferCompletePage transferCompletePg = pg.goTo(LoginPage.class)
                .clickRegisterLink()
                .doRegister()
                .clickTransferFundsLink()
                .fillAmount(amount)
                .clickTransferButton();
        Assert.assertTrue(transferCompletePg.isTransferComplete(amount));
    }
}
