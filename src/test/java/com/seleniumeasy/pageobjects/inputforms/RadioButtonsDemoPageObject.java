package com.seleniumeasy.pageobjects.inputforms;

import com.seleniumeasy.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButtonsDemoPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public RadioButtonsDemoPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement menuInputFormsButton() {
        return waitElement.toBeClickable(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
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