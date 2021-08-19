package com.seleniumeasy.widgets;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.seleniumeasy.utils.Screenshot;
import org.openqa.selenium.WebElement;

public class CloseAds {

    public static void adClosed(WebElement element) {
        if (element.isDisplayed()) {
            element.click();
            ExtentTestManager.getTest().log(Status.PASS, "AddThis is closed!");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "AddThis must be closed.", Screenshot.capture());
        }
    }
}