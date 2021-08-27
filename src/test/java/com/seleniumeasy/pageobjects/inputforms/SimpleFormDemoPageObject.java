package com.seleniumeasy.pageobjects.inputforms;

import com.seleniumeasy.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SimpleFormDemoPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public SimpleFormDemoPageObject(WebDriver _driver) {
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
        return waitElement.visibilityOf(By.id("display"));
    }

    public WebElement enterATextField() {
        return waitElement.toBeClickable(By.id("sum1"));
    }

    public WebElement enterBTextField() {
        return waitElement.toBeClickable(By.id("sum2"));
    }

    public WebElement getTotalButton() {
        return waitElement.toBeClickable(By.cssSelector("#gettotal > button"));
    }

    public WebElement totalAandBLabel() {
        return waitElement.visibilityOf(By.id("displayvalue"));
    }
}