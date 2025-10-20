package com.parabank.parasoft.test;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.parabank.parasoft.page.RegistrationPage;

public class RegisterTest extends BaseTest {

    @Test
    public void checkRegisterPageTitle(){
        RegistrationPage rp = pg.goTo(RegistrationPage.class);
        Assert.assertEquals(rp.getTitle(), "ParaBank | Register for Free Online Account Access");
    }
    @Test
    public void checkFormTitle(){
        RegistrationPage rp = pg.goTo(RegistrationPage.class);
        String title = driver.findElement(By.cssSelector(".title")).getText();
        Assert.assertEquals(title,"Signing up is easy!");
    }

}
