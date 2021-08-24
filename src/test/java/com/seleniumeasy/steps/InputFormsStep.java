package com.seleniumeasy.steps;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.github.javafaker.Faker;
import com.seleniumeasy.pageobjects.InputFormsPageObject;
import com.seleniumeasy.utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class InputFormsStep {
    private final WebDriver driver;
    private final InputFormsPageObject inputFormsPageObject;
    private Faker faker;

    public InputFormsStep(WebDriver _driver) {
        driver = _driver;
        inputFormsPageObject = new InputFormsPageObject(_driver);
        faker = new Faker();
    }

    public InputFormsStep simpleFormDemo() {
        startPractising();
        singleInputField();
        twoInputField();
        return this;
    }

    private InputFormsStep startPractising() {
        inputFormsPageObject.startPractisingButton().click();
        return this;
    }

    private InputFormsStep singleInputField() {
        String textMessagem = faker.chuckNorris().fact();
        if (inputFormsPageObject.closeAddThisButton().isDisplayed()) {
            inputFormsPageObject.closeAddThisButton().click();
            ExtentTestManager.getTest().log(Status.PASS, "AddThis is closed!");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "AddThis must be closed.", Screenshot.capture());
        }
        inputFormsPageObject.simpleFormDemoButton().click();
        inputFormsPageObject.enterMessageTextField().sendKeys(textMessagem);
        inputFormsPageObject.showMessageButton().click();
        Assert.assertEquals(inputFormsPageObject.yourMessageLabel().getText(), textMessagem);
        return this;
    }

    private InputFormsStep twoInputField() {
        inputFormsPageObject.enterATextField().sendKeys(faker.number().digits(2));
        inputFormsPageObject.enterBTextField().sendKeys(faker.number().digits(2));
        inputFormsPageObject.getTotalButton().click();
        String numberTotal = inputFormsPageObject.totalAandBLabel().getText();
        Assert.assertEquals(inputFormsPageObject.totalAandBLabel().getText(), numberTotal);
        return this;
    }

    public InputFormsStep checkboxDemo() {
        singleCheckbox();
        multiCheckBox();
        return this;
    }

    private InputFormsStep singleCheckbox() {
        inputFormsPageObject.menuInputFormsButton().click();
        inputFormsPageObject.accessCheckboxDemoButton().click();
        inputFormsPageObject.singleCheckboxDemoCheckBox().click();
        Assert.assertEquals(inputFormsPageObject.successCheckBoxLabel().getText(), "Success - Check box is checked");
        return this;
    }

    private InputFormsStep multiCheckBox() {
        inputFormsPageObject.multiCheckAllButton().click();
        inputFormsPageObject.menuInputFormsButton().click();
        return this;
    }

    public InputFormsStep radioButtonsDemo() {
        radioGenreButtonDemo();
        groupRadioButtonsDemo();
        return this;
    }

    private InputFormsStep radioGenreButtonDemo() {
        inputFormsPageObject.accessRadioButtonsDemosButton().click();
        inputFormsPageObject.genreCheckBox().click();
        inputFormsPageObject.getCheckedValueButton().click();
        Assert.assertEquals(inputFormsPageObject.validateClickOnRadioLabel().getText(), "Radio button 'Male' is checked");
        return this;
    }

    private InputFormsStep groupRadioButtonsDemo() {
        inputFormsPageObject.groupRadioSexCheckbox().click();
        inputFormsPageObject.groupRadioAgeCheckbox().click();
        inputFormsPageObject.getValuesGroupRadioButton().click();
        Assert.assertEquals(inputFormsPageObject.validateGroupRadioGetValuesLabel().getText().replaceAll("\\n", " "), "Sex : Female Age group: 15 - 50");
        return this;
    }
}