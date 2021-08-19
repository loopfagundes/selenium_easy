package com.seleniumeasy.utils;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import org.openqa.selenium.WebElement;

public class CloseAds {

    public static void autoCloseAds(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
            ExtentTestManager.getTest().log(Status.PASS, "AddThis is closed!");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "AddThis must be closed.", Screenshot.capture());
        }
    }
}