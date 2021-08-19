package com.seleniumeasy.testcases;

import com.seleniumeasy.utils.BaseTest;
import com.seleniumeasy.utils.Property;
import com.seleniumeasy.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AllElementsTestCase extends BaseTest {

    @Test
    public void allElementsTest() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
    }
}