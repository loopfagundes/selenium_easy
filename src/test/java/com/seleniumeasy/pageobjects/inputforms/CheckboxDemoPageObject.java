package com.seleniumeasy.pageobjects.inputforms;

import com.seleniumeasy.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxDemoPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public CheckboxDemoPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement menuInputFormsButton() {
        return waitElement.toBeClickable(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
    }

    public WebElement accessCheckboxDemoButton() {
        return waitElement.toBeClickable(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(2) > a"));
    }

    public WebElement singleCheckboxDemoCheckBox() {
        return waitElement.toBeClickable(By.id("isAgeSelected"));
    }

    public WebElement successCheckBoxLabel() {
        return waitElement.visibilityOf(By.id("txtAge"));
    }

    public WebElement multiCheckAllButton() {
        return waitElement.toBeClickable(By.id("check1"));
    }
}