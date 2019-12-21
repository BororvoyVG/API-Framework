package com.apiframework.core.factory;

import com.apiframework.core.enums.SupportedBrowsers;
import com.apiframework.core.utils.properties.PropertyConfiguration;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class WebDriverFactory {
    public static WebDriver newWebDriver() throws MalformedURLException {
        SupportedBrowsers propertyBrower = SupportedBrowsers.valueOf(PropertyConfiguration.getBrowserName());
        return propertyBrower.getWebDriver().invokeWebDriver();
    }
}
