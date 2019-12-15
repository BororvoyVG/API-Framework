package com.apiframework.stepdefs;

import com.apiframework.HomePage;
import com.apiframework.core.utils.LocalDriverInvoker;
import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.And;
import lombok.extern.slf4j.Slf4j;

import static com.apiframework.core.utils.PropertyConfiguration.*;

@Slf4j
public class HomePageStepDefinition {

    HomePage homePage = new HomePage();

    @And("Open home page")
    public void openHomePage() {

        WebDriver driver = LocalDriverInvoker.invokeWebDriver();
        String url = getHomeUrl();
        log.info("Open url: " + url);
        log.info(getUserLogin() + getUserPassword());
        driver.get(url);
        driver.quit();
    }
}
