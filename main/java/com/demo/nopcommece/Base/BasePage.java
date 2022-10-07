package com.demo.nopcommece.Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class BasePage {
    WebDriver driver;
    Properties prop;
    FileInputStream file;


    public WebDriver initialiseDriver(String BrowserName) {
        if (BrowserName.equals("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (BrowserName.equals("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else if (BrowserName.equals("firefox")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();

        } else {
            System.out.println("browser not found");
        }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();

        return driver;

    }

    public Properties initialiaseProperties() {
        prop = new Properties();
        try {
            file = new FileInputStream("C:\\Users\\Margi\\IdeaProjects\\PageObjectModel\\src\\test\\resources\\Testdata\\config.properties");
            prop.load(file);
        } catch (FileNotFoundException e) {
            System.out.println("Config file is not found please check");

        } catch (IOException e) {
            System.out.println("Properties could not be loaded");
        }
        return prop;
    }
}
