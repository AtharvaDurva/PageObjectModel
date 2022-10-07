package com.demo.nopcommece.Pages;

import com.demo.nopcommece.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
    Utils utils;

    By loginlink = By.className("ico-login");
    By EmailId = By.id("Email");
    By Password = By.id("Password");
    By LoginButton = By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
        utils = new Utils(driver);

    }

    public void clickonLoginLink() {
        utils.doclick(loginlink);
    }

    public void doLogin(String Email, String password) {
        utils.dosendkey(EmailId, Email);
        utils.dosendkey(Password, password);
        utils.doclick(LoginButton);

    }

}
