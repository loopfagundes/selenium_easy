package com.seleniumeasy.steps.inputforms;

import com.seleniumeasy.pageobjects.inputforms.CheckboxDemoPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CheckboxDemoStep {
    private final WebDriver driver;
    private final CheckboxDemoPageObject checkboxDemoPageObject;

    public CheckboxDemoStep(WebDriver _driver) {
        driver = _driver;
        checkboxDemoPageObject = new CheckboxDemoPageObject(_driver);
    }

    public CheckboxDemoStep checkboxDemo() {
        singleCheckbox();
        multiCheckBox();
        return this;
    }

    private CheckboxDemoStep singleCheckbox() {
        checkboxDemoPageObject.menuInputFormsButton().click();
        checkboxDemoPageObject.accessCheckboxDemoButton().click();
        checkboxDemoPageObject.singleCheckboxDemoCheckBox().click();
        Assert.assertEquals(checkboxDemoPageObject.successCheckBoxLabel().getText(), "Success - Check box is checked");
        return this;
    }

    private CheckboxDemoStep multiCheckBox() {
        checkboxDemoPageObject.multiCheckAllButton().click();
        return this;
    }
}