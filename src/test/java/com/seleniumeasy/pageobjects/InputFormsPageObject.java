package com.seleniumeasy.pageobjects;

import com.seleniumeasy.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormsPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public InputFormsPageObject(WebDriver _driver) {
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

    public WebElement accessRadioButtonsDemosButton() {
        return waitElement.toBeClickable(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(3) > a"));
    }

    public WebElement genreCheckBox() {
        return waitElement.toBeClickable(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > label:nth-child(2) > input[type=radio]"));
    }

    public WebElement getCheckedValueButton() {
        return waitElement.toBeClickable(By.cssSelector("div[class='panel panel-default'] #buttoncheck"));
    }

    public WebElement validateClickOnRadioLabel() {
        return waitElement.visibilityOf(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(4) > div.panel-body > p.radiobutton"));
    }

    public WebElement groupRadioSexCheckbox() {
        return waitElement.toBeClickable(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(2) > label:nth-child(3) > input[type=radio]"));
    }

    public WebElement groupRadioAgeCheckbox() {
        return waitElement.toBeClickable(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > div:nth-child(3) > label:nth-child(4) > input[type=radio]"));
    }

    public WebElement getValuesGroupRadioButton() {
        return waitElement.toBeClickable(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > button"));
    }

    public WebElement validateGroupRadioGetValuesLabel() {
        return waitElement.toBeClickable(By.cssSelector("#easycont > div > div.col-md-6.text-left > div:nth-child(5) > div.panel-body > p.groupradiobutton"));
    }
}