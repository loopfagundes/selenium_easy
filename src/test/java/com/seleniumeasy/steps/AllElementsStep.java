package com.seleniumeasy.steps;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.service.ExtentTestManager;
import com.github.javafaker.Faker;
import com.seleniumeasy.pageobjects.AllElementsPageObject;
import com.seleniumeasy.utils.CloseAds;
import com.seleniumeasy.utils.Screenshot;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class AllElementsStep {
    private final WebDriver driver;
    private final AllElementsPageObject allElementsPageObject;
    private Faker faker;

    public AllElementsStep(WebDriver _driver) {
        driver = _driver;
        allElementsPageObject = new AllElementsPageObject(_driver);
        faker = new Faker();
    }

    public AllElementsStep pageSeleniumEasy() {
        startPractising();
        simpleFormDemo();
        return this;
    }

    private AllElementsStep startPractising() {
        allElementsPageObject.startPractisingButton().click();
        return this;
    }

    private AllElementsStep simpleFormDemo() {
        String textMessagem = faker.chuckNorris().fact();
        CloseAds.autoCloseAds(allElementsPageObject.closeAddThisButton());
        allElementsPageObject.simpleFormDemoButton().click();
        allElementsPageObject.enterMessageTextField().sendKeys(textMessagem);
        allElementsPageObject.showMessageButton().click();
        Assert.assertEquals(allElementsPageObject.yourMessageLabel().getText(), textMessagem);
        return this;
    }
}