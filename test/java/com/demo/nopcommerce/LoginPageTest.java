package com.demo.nopcommerce;

import com.demo.nopcommece.Base.BasePage;
import com.demo.nopcommece.Pages.LoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class LoginPageTest {
    WebDriver driver;
    BasePage basePage;
    Properties prop;
    LoginPage loginPage;



    @BeforeMethod
    public void openbrowser(){
        basePage = new BasePage();
        prop = basePage.initialiaseProperties();
        String Webengine = prop.getProperty("Browser");
        driver = basePage.initialiseDriver(Webengine);
        driver.get(prop.getProperty("url"));
        loginPage = new LoginPage(driver);

    }
    @Test
    public void loginTest(){
        loginPage.clickonLoginLink();
        loginPage.doLogin(prop.getProperty("Email"), prop.getProperty("password"));

    }

    //@AfterMethod
   // public void teardown(){ driver.quit();}



}
