package com.seleniumeasy.utils;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.seleniumeasy.webdrivers.BrowserEnum;
import com.seleniumeasy.webdrivers.DriverFactory;
import com.seleniumeasy.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;

@Listeners({ExtentITestListenerClassAdapter.class, Report.class})
public class BaseTest {

    @BeforeMethod
    public void setUp() {
        WebDriver driver = DriverFactory.createInstance(BrowserEnum.CHROME);
        DriverManager.setDriver(driver);
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        DriverManager.quitDriver();
    }
}