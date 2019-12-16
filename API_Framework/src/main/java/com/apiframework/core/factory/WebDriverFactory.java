package com.apiframework.core.factory;

import com.apiframework.core.enums.SupportedBrowsers;
import com.apiframework.core.utils.properties.PropertyConfiguration;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class WebDriverFactory {
    public static WebDriver newWebDriver() throws MalformedURLException {
        SupportedBrowsers propertyBrower = SupportedBrowsers.valueOf(PropertyConfiguration.getBrowserName());
        return propertyBrower.getWebDriver().invokeWebDriver();
    }
}
