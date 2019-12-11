package com.apiframework.stepdefs;

import com.apiframework.HomePage;
import com.apiframework.core.utils.LocalDriverInvoker;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;

public class HomePageStepDefinition {

    HomePage homePage =new HomePage();

    @And("Open home page")
    public void openHomePage() {
        WebDriver driver =LocalDriverInvoker.invokeWebDriver();
        driver.get("https://www.ebay.com/");
    }
}
