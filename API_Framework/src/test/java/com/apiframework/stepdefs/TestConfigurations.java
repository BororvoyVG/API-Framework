package com.apiframework.stepdefs;

import com.apiframework.core.factory.WebDriverFactory;
import com.codeborne.selenide.WebDriverRunner;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.restassured.RestAssured;
import io.restassured.config.LogConfig;

import java.net.MalformedURLException;

import static io.restassured.RestAssured.config;

public class TestConfigurations {

    @Before
    public void setUpTest() throws MalformedURLException {
        WebDriverRunner.setWebDriver(WebDriverFactory.newWebDriver());
        RestAssured.config = config().logConfig(LogConfig.logConfig().enablePrettyPrinting(false));
    }

    @After
    public void AfterTest() {

        WebDriverRunner.getWebDriver().manage().deleteAllCookies();
        WebDriverRunner.getWebDriver().quit();
    }
}
