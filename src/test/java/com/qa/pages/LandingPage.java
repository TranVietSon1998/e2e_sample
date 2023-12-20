package com.qa.pages;

import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import org.openqa.selenium.WebElement;

public class LandingPage extends BasePage {

    public LandingPage() {

    }

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"banner\"`]/XCUIElementTypeButton[1]")
    private WebElement settingToBtn;

    @iOSXCUITFindBy(iOSNsPredicate = "label == \"vorname.nachname@mobi.ch\"")
    private WebElement mobiAccount;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Go\"]")
    private WebElement nextBtn;

    @iOSXCUITFindBy(xpath = "//XCUIElementTypeButton[@name=\"Continue\"]")
    private WebElement continueBtn;

    @iOSXCUITFindBy(iOSClassChain = "**/XCUIElementTypeOther[`label == \"main\"`]/XCUIElementTypeOther[3]")
    private WebElement text;


    public LandingPage navigateToSettingPage() {
        click(settingToBtn, "click button to navigate setting page");
        return this;
    }

    public LandingPage swipeDownToGetTheListOfOrders() {
        swipeDown();
        return this;
    }

    public LandingPage inputMobiAccount() {
        click(mobiAccount);
        clear(mobiAccount);
        sendKeys(mobiAccount, "son.tran@mobi.ch");
        return this;
    }

    public LandingPage clickNextBtn() throws InterruptedException {
        click(nextBtn);
        Thread.sleep(5000);
        click(continueBtn);
        wait(text);
        return this;


    }
}
