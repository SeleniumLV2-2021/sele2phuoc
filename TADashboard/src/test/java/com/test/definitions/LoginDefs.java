package com.test.definitions;

import com.test.Constant.Constant;
import com.test.Page.GeneralPage;
import com.test.Page.LoginPage;
import com.test.common.AlertHelper;
import cucumber.api.java8.En;
import org.testng.Assert;

public class LoginDefs implements En {

    LoginPage loginPage = new LoginPage();
    GeneralPage generalPage = new GeneralPage();
    public LoginDefs() {
        Given("^I navigate to the Dashboard login page$", () -> {
            generalPage.goTo();
        });

        When("^I enter valid username$", () -> {
            loginPage.inputUsername(Constant.USERNAME);

        });

        And("^I enter valid password$", () -> {
            loginPage.inputPassWord(Constant.PASSWORD);
        });

        And("^I click on Login button$", () -> {
            loginPage.clickLoginBtn();
        });

        Then("^The Dashboard Main page appears$", () -> {
            Assert.assertTrue(loginPage.isLogoutBtnExist());

        });
        When("^I click Login button without entering data into Username and Password field$", () -> {
            loginPage.clickLoginBtn();
        });
        Then("^A message \"([^\"]*)\" is displayed$", (String warningMessage) -> {
            Assert.assertEquals(AlertHelper.getTextAlert(), "Please enter username!");
        });
    }
}