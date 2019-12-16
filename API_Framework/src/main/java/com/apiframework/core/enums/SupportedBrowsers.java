package com.apiframework.core.enums;

import com.apiframework.core.invockers.WebDriverInvoker;
import com.apiframework.core.invockers.implementation.LocalChromeInvoker;
import com.apiframework.core.invockers.implementation.RemoteChromeInvoker;

public enum SupportedBrowsers {
    REMOTE_CHROME(new RemoteChromeInvoker()),
    LOCAL_CHROME(new LocalChromeInvoker());

    private WebDriverInvoker invoker;

    SupportedBrowsers(WebDriverInvoker webDriverInvoker) {
        this.invoker = webDriverInvoker;
    }

    public WebDriverInvoker getWebDriver() {
        return invoker;
    }
}
