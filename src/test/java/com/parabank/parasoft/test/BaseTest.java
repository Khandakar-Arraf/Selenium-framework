package com.parabank.parasoft.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import com.parabank.parasoft.page.Page;
import com.parabank.parasoft.page.Base_page;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;


public class BaseTest {
    WebDriver driver;
    Page pg;
    Properties props;

    public WebDriver getWebDriver(){
        return driver;
    }

    public BaseTest() {
        String path = System.getProperty("user.dir") + "/src/test/resources/data.properties";
        props = new Properties();
        try {
            FileInputStream inputStream = new FileInputStream(path);
            props.load(inputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
    @BeforeMethod
    public void setUpBrowser() {
        String browser = props.getProperty("browserName");
        switch (browser.toLowerCase()) {
            case "edge" -> driver = new EdgeDriver();
            case "chrome" -> driver = new ChromeDriver();
            case "firefox" -> driver = new FirefoxDriver();
            default -> throw new RuntimeException("Unsupported browser: " + browser);
        }

        pg = new Base_page(driver);

    }

    @AfterMethod
    public void closeBrowser() {
        driver.quit();
    }
}
