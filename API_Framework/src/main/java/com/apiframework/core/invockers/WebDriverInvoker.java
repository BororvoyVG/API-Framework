package com.apiframework.core.invockers;

import org.openqa.selenium.WebDriver;

import java.net.MalformedURLException;

public interface WebDriverInvoker {

    WebDriver invokeWebDriver() throws MalformedURLException;
}
