package com.seleniumeasy.pageobjects.inputforms;

import com.seleniumeasy.utils.WaitElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownListPageObject {
    private final WebDriver driver;
    private final WaitElement waitElement;

    public SelectDropdownListPageObject(WebDriver _driver) {
        driver = _driver;
        waitElement = new WaitElement(_driver);
    }

    public WebElement menuInputFormsButton() {
        return waitElement.toBeClickable(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > a"));
    }

    public WebElement accessSelectDropdownListButton() {
        return waitElement.toBeClickable(By.cssSelector("#treemenu > li > ul > li:nth-child(1) > ul > li:nth-child(4) > a"));
    }

    public Select selectListDayCombobox() {
        return new Select(waitElement.toBeClickable(By.cssSelector("div[class='panel panel-default'] div[class='panel-body'] select[id='select-demo']")));
    }

    public Select multiSelectListComboBox() {
        return new Select(waitElement.toBeClickable(By.cssSelector("div[class='panel panel-default'] select[id='multi-select']")));
    }

    public WebElement getAllSelectedButton() {
        return waitElement.toBeClickable(By.cssSelector("div[class='panel-body'] button[id='printAll']"));
    }

    public WebElement validateAllSelectedLabel() {
        return waitElement.visibilityOf(By.cssSelector(".panel-body .getall-selected"));
    }
}