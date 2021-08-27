package com.seleniumeasy.testcases;

import com.seleniumeasy.steps.inputforms.CheckboxDemoStep;
import com.seleniumeasy.steps.inputforms.SelectDropdownListStep;
import com.seleniumeasy.steps.inputforms.RadioButtonsDemoStep;
import com.seleniumeasy.steps.inputforms.SimpleFormDemoStep;
import com.seleniumeasy.utils.BaseTest;
import com.seleniumeasy.utils.Property;
import com.seleniumeasy.webdrivers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class AllElementsTestCase extends BaseTest {

    @Test
    public void practiceSuccessfullyTest() {
        WebDriver driver = DriverManager.getDriver();
        driver.get(Property.get("url"));
        SimpleFormDemoStep simpleFormDemoStep = new SimpleFormDemoStep(driver);
        simpleFormDemoStep.simpleFormDemo();
        CheckboxDemoStep checkboxDemoStep = new CheckboxDemoStep(driver);
        checkboxDemoStep.checkboxDemo();
        RadioButtonsDemoStep radioButtonsDemoStep = new RadioButtonsDemoStep(driver);
        radioButtonsDemoStep.radioButtonsDemo();
        SelectDropdownListStep selectDropdownListStep = new SelectDropdownListStep(driver);
        selectDropdownListStep.selectDropdownList();
    }
}