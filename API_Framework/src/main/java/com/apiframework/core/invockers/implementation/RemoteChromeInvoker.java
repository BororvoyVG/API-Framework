package com.apiframework.core.invockers.implementation;

import com.apiframework.core.invockers.WebDriverInvoker;
import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public class RemoteChromeInvoker implements WebDriverInvoker {

    @Override
    public WebDriver invokeWebDriver() {
        //TODO implement selenoid server and run wemote chrome on it
        return null;
    }
}
