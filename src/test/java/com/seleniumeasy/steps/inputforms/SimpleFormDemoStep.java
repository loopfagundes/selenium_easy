package com.seleniumeasy.steps.inputforms;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.github.javafaker.Faker;
import com.seleniumeasy.pageobjects.inputforms.SimpleFormDemoPageObject;
import com.seleniumeasy.utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SimpleFormDemoStep {
    private final WebDriver driver;
    private final SimpleFormDemoPageObject simpleFormDemoPageObject;
    private Faker faker;

    public SimpleFormDemoStep(WebDriver _driver) {
        driver = _driver;
        simpleFormDemoPageObject = new SimpleFormDemoPageObject(_driver);
        faker = new Faker();
    }

    public SimpleFormDemoStep simpleFormDemo() {
        startPractising();
        singleInputField();
        twoInputFields();
        return this;
    }

    private SimpleFormDemoStep startPractising() {
        simpleFormDemoPageObject.startPractisingButton().click();
        return this;
    }

    private SimpleFormDemoStep singleInputField() {
        String textMessagem = faker.chuckNorris().fact();
        if (simpleFormDemoPageObject.closeAddThisButton().isDisplayed()) {
            simpleFormDemoPageObject.closeAddThisButton().click();
            ExtentTestManager.getTest().log(Status.PASS, "AddThis is closed!");
        } else {
            ExtentTestManager.getTest().log(Status.FAIL, "AddThis must be closed.", Screenshot.capture());
        }
        simpleFormDemoPageObject.simpleFormDemoButton().click();
        simpleFormDemoPageObject.enterMessageTextField().sendKeys(textMessagem);
        simpleFormDemoPageObject.showMessageButton().click();
        Assert.assertEquals(simpleFormDemoPageObject.yourMessageLabel().getText(), textMessagem);
        return this;
    }

    private SimpleFormDemoStep twoInputFields() {
        simpleFormDemoPageObject.enterATextField().sendKeys(faker.number().digits(2));
        simpleFormDemoPageObject.enterBTextField().sendKeys(faker.number().digits(2));
        simpleFormDemoPageObject.getTotalButton().click();
        String numberTotal = simpleFormDemoPageObject.totalAandBLabel().getText();
        Assert.assertEquals(simpleFormDemoPageObject.totalAandBLabel().getText(), numberTotal);
        return this;
    }
}