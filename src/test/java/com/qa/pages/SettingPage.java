package com.qa.pages;

import com.qa.utils.DriverManager;
import com.qa.utils.TestUtils;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class SettingPage extends BasePage{
    private AppiumDriver driver;
    TestUtils utils = new TestUtils();
    public SettingPage() {
        this.driver = new DriverManager().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver), this);
    }

    public SettingPage navigateBackToLandingPage(){
        WebElement backToOverview = driver.findElement(By.cssSelector("#backToOverview-btn"));
        click(backToOverview, "navigate back to landing page");
        return this;
    }

    public SettingPage changeLanguageTo(String language) {
        WebElement languageDropdown = driver.findElement(By.cssSelector("#languagesDropdown ion-select"));

        click(languageDropdown, "open language selection");

        WebElement englishLanguage = driver.findElement(By.xpath("//ion-radio[contains(text(),'English')]"));
        WebElement germanLanguage = driver.findElement(By.xpath("//ion-radio[contains(text(),'Deutsch')]"));
        WebElement frenchLanguage = driver.findElement(By.xpath("//ion-radio[contains(text(),'Français')]"));
        WebElement italiaLanguage = driver.findElement(By.xpath("//ion-radio[contains(text(),'Italiano')]"));
        switch (language){
            case "English":
                click(englishLanguage, "change language to English");
                break;
            case "French":
                click(frenchLanguage, "change language to French");
                break;
            case "Italia":
                click(italiaLanguage, "change language to Italia");
                break;

            default:
                click(germanLanguage, "change language to German");
                break;
        }

        return this;
    }

    public SettingPage inputTestUser(String testUser) {
        WebElement testUserInput = driver.findElement(By.cssSelector("#test-user input"));
        clear(testUserInput);
        sendKeys(testUserInput,testUser,"input test user");
        return this;
    }


}
