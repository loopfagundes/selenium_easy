package com.seleniumeasy.steps.inputforms;

import com.seleniumeasy.pageobjects.inputforms.RadioButtonsDemoPageObject;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class RadioButtonsDemoStep {
    private final WebDriver driver;
    private final RadioButtonsDemoPageObject radioButtonsDemoPageObject;

    public RadioButtonsDemoStep(WebDriver _driver) {
        driver = _driver;
        radioButtonsDemoPageObject = new RadioButtonsDemoPageObject(_driver);
    }

    public RadioButtonsDemoStep radioButtonsDemo() {
        radioGenreButtonDemo();
        groupRadioButtonsDemo();
        return this;
    }

    private RadioButtonsDemoStep radioGenreButtonDemo() {
        radioButtonsDemoPageObject.menuInputFormsButton().click();
        radioButtonsDemoPageObject.accessRadioButtonsDemosButton().click();
        radioButtonsDemoPageObject.genreCheckBox().click();
        radioButtonsDemoPageObject.getCheckedValueButton().click();
        Assert.assertEquals(radioButtonsDemoPageObject.validateClickOnRadioLabel().getText(), "Radio button 'Male' is checked");
        return this;
    }

    private RadioButtonsDemoStep groupRadioButtonsDemo() {
        radioButtonsDemoPageObject.groupRadioSexCheckbox().click();
        radioButtonsDemoPageObject.groupRadioAgeCheckbox().click();
        radioButtonsDemoPageObject.getValuesGroupRadioButton().click();
        Assert.assertEquals(radioButtonsDemoPageObject.validateGroupRadioGetValuesLabel().getText().replaceAll("\\n", " "), "Sex : Female Age group: 15 - 50");
        return this;
    }
}