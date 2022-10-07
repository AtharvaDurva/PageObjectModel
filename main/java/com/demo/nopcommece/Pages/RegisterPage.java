package com.demo.nopcommece.Pages;

import com.demo.nopcommece.Utilities.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage {
    WebDriver driver;
    Utils utils;
    By RegiserPagelink = By.className("ico-register");
    By Gender = By.id("gender-male");
    By Firstname = By.id("FirstName");
    By Lastname = By.id("LastName");
    By Email = By.id("email");
    By Componyname = By.id("Company");
    By passWord = By.id("Password");
    By confirmpassWord = By.id("ConfirmPassword");
    By RegisterButton = By.xpath("//*[@id=\"register-button\"]");





    public RegisterPage(WebDriver driver){
        this.driver =driver;
        utils = new Utils(driver);
    }
    public void clickonRegisterlink(){
        utils.doclick(RegiserPagelink);
    }
    public void doRegister(String firstname, String lastname, String email, String Companyname, String Password, String Confirmpassword, String confirmpassword){

        utils.doclick(Gender);
        utils.dosendkey(Firstname,firstname);
        utils.dosendkey(Lastname,lastname);
        utils.dosendkey(Email,email);
        utils.dosendkey(Componyname,Companyname);
        utils.dosendkey(passWord,Password);
        utils.dosendkey(confirmpassWord,Confirmpassword);
        utils.doclick(RegisterButton);




    }


}
