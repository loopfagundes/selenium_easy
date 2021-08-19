package com.seleniumeasy.pageobjects;

import com.seleniumeasy.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AllElementsPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public AllElementsPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement startPractisingButton() {
        return waitElement.toBeClickable(By.id("btn_basic_example"));
    }

    public WebElement closeAddThisButton() {
        return waitElement.toBeClickable(By.id("at-cv-lightbox-close"));
    }

    public WebElement simpleFormDemoButton() {
        return waitElement.toBeClickable(By.cssSelector("#basic > div > a:nth-child(1)"));
    }

    public WebElement enterMessageTextField() {
        return waitElement.toBeClickable(By.cssSelector("form[id='get-input'] input[id='user-message']"));
    }

    public WebElement showMessageButton() {
        return waitElement.toBeClickable(By.cssSelector("#get-input > button"));
    }

    public WebElement yourMessageLabel() {
        return waitElement.toBeClickable(By.id("display"));
    }
}
