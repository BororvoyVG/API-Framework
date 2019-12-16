package com.apiframework.stepdefs;

import com.apiframework.core.factory.WebDriverFactory;
import com.apiframework.pages.LoginPage;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.Assertions;

import io.cucumber.java.en.And;
import lombok.extern.slf4j.Slf4j;

import java.net.MalformedURLException;

import static com.apiframework.core.utils.properties.PropertyConfiguration.*;
import static com.apiframework.core.utils.properties.PropertyConfiguration.getUserPassword;

@Slf4j
public class LoginPageStepDefinition {

    private LoginPage loginPage = new LoginPage();

    @Before
    public void setUpTest() throws MalformedURLException {
        WebDriverRunner.setWebDriver(WebDriverFactory.newWebDriver());
    }

    @After
    public void AfterTest() {
        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        WebDriverRunner.getWebDriver().quit();
    }

    @And("Open home page")
    public void openHomePage() {
        String url = getHomeUrl();
        log.info("Open url: " + url);
        loginPage.openPage();
    }

    @And("User logs in with default credentials")
    public void userLogInWithDefaultCredentials() {
        String userName = getUserLogin();
        String userpassord = getUserPassword();
        log.info("Log in with userName: {} and password: {}", userName, userpassord);
        loginPage.logInToEbay(userName, userpassord);
    }

    @And("User verifies that he is logged in")
    public void userVerifiesThatHeIsLoggedIn() {
        Assertions.assertTrue(loginPage.isUserSignedIn(), "User is not logged in");
    }
}
