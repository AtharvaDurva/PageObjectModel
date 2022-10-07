package com.demo.nopcommerce;

import com.demo.nopcommece.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

public class BasePageTest {

    WebDriver driver;
    BasePage basePage;
    Properties prop;
    @BeforeMethod
    public void openBrowser(){
        basePage= new BasePage();
        prop = basePage.initialiaseProperties();
        String Webengine = prop.getProperty("Browser");
        driver = basePage.initialiseDriver(Webengine);
        driver.get(prop.getProperty("url"));


    }
}
