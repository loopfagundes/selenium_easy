package com.seleniumeasy.steps.inputforms;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.github.javafaker.Faker;
import com.seleniumeasy.pageobjects.inputforms.SelectDropdownListPageObject;
import com.seleniumeasy.utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class SelectDropdownListStep {
    private final WebDriver driver;
    private final SelectDropdownListPageObject selectDropdownListPageObject;
    private Faker faker;

    public SelectDropdownListStep(WebDriver _driver) {
        driver = _driver;
        selectDropdownListPageObject = new SelectDropdownListPageObject(_driver);
        faker = new Faker();
    }

    public SelectDropdownListStep selectDropdownList() {
        selectListDemo();
        multiSelectListDemo();
        return this;
    }

    private SelectDropdownListStep selectListDemo() {
        selectDropdownListPageObject.menuInputFormsButton().click();
        selectDropdownListPageObject.accessSelectDropdownListButton().click();
        selectDropdownListPageObject.selectListDayCombobox().selectByValue("Tuesday");
        return this;
    }

    private SelectDropdownListStep multiSelectListDemo() {
        selectDropdownListPageObject.multiSelectListComboBox().selectByValue("California");
        selectDropdownListPageObject.multiSelectListComboBox().selectByValue("New Jersey");
        selectDropdownListPageObject.multiSelectListComboBox().selectByValue("Ohio");
        selectDropdownListPageObject.multiSelectListComboBox().selectByValue("Pennsylvania");

        List<WebElement> optionList = selectDropdownListPageObject.multiSelectListComboBox().getAllSelectedOptions();
        for(int i=0;i<optionList.size();i++) {
            if (optionList.get(i).getText().equals("New Jersey")) {
                optionList.get(i).click();
                selectDropdownListPageObject.getAllSelectedButton().click();
                break;
            }
        }
        Assert.assertEquals(selectDropdownListPageObject.validateAllSelectedLabel().getText(), "Options selected are : New Jersey");
        boolean result = selectDropdownListPageObject.multiSelectListComboBox().isMultiple();
        Assert.assertTrue(result,"Result: ");
        return this;
    }
}