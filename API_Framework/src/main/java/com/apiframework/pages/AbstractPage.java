package com.apiframework.pages;

import static com.apiframework.core.utils.properties.PropertyConfiguration.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class AbstractPage {

    public void openPage() {
        getWebDriver().get(getHomeUrl());
    }

    public void openPage(String pageUrl) {
        getWebDriver().get(getHomeUrl() + pageUrl);
    }
}
