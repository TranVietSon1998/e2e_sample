package com.qa.stepdef;

import com.qa.pages.LandingPage;
import com.qa.pages.SettingPage;
import io.cucumber.java.en.When;

public class landingPageStepDef {

    @When("User navigate to setting page")
    public void userNavigateToSettingPage() {
      new LandingPage().navigateToSettingPage();

    }

    @When("User change language to {string}")
    public void userChangeLanguageTo(String language){
       new SettingPage().changeLanguageTo(language);
    }

    @When("User input  test user with {string}")
    public void userInputTestUserWith(String testUser) {
       new SettingPage().inputTestUser(testUser);
    }

    @When("User navigate back to landing page")
    public void userNavigateBackToLandingPage() {
       new SettingPage().navigateBackToLandingPage();

    }

    @When("User swipe down to get the list of orders")
    public void  userSwipeDownToGetOrders() {
        new LandingPage().swipeDownToGetTheListOfOrders().inputMobiAccount();
    }


}
