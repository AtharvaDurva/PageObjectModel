package com.demo.nopcommerce;

import com.demo.nopcommece.Base.BasePage;
import com.demo.nopcommece.Pages.RegisterPage;
import com.demo.nopcommece.Utilities.Utils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Properties;

public class RegisterPageTest {

    WebDriver driver;
    BasePage basePage;
    Properties prop;
    RegisterPage registerPage;
    Utils utils;


    @BeforeMethod
    public void openbrowser(){
        basePage = new BasePage();
        prop = basePage.initialiaseProperties();
        String Webengine = prop.getProperty("browser");
        driver = basePage.initialiseDriver(Webengine);
        driver.get(prop.getProperty("url"));
        registerPage = new RegisterPage(driver);
    }
    @Test
    public void RegisterTest(){
        registerPage.clickonRegisterlink();
        registerPage.doRegister(prop.getProperty("Gender"), prop.getProperty("Firstname"), prop.getProperty("Lastname"), prop.getProperty("email"), prop.getProperty("Companyname"), prop.getProperty("PASSWORD"),prop.getProperty("confirmpassword"));



    }



}
