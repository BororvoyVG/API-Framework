package com.apiframework.pages;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

@Getter
@Slf4j
public class LoginPage extends AbstractPage {

    private static final String SIGN_IN_LINK = "//span[@id='gh-ug']//a[contains(@href,'signin.ebay.com')]";
    private static final String EMAIL_INPUT_FIELD = "//div[@class='textbox']//input[@id='userid']";
    private static final String PASS_INPUT_FIELD = "//input[@id='pass']";
    private static final String SIGN_IN_BUTTON = "//button[@id='sgnBt']";
    private static final String SIGN_IN_CONTINUE_BUTTON = "//button[@id='signin-continue-btn']";
    private static final String PROFILE_BUTTON = "//button[@class='gh-ua gh-control' and (contains(.,'Hi'))]";

    private void clickOnSingInLink() {
        $x(SIGN_IN_LINK).should(visible).click();
    }

    private void setEmail(final String login) {
        $x(EMAIL_INPUT_FIELD).shouldBe(visible).sendKeys(login);
    }

    private void setPassword(final String password) {
        $x(PASS_INPUT_FIELD).shouldBe(visible).sendKeys(password);
    }

    private void clickOnSignInButton() {
        $x(SIGN_IN_BUTTON).shouldBe(visible).click();
    }

    private void clickOnContinueButton() {
        $x(SIGN_IN_CONTINUE_BUTTON).shouldBe(visible).click();
    }

    public void logInToEbay(final String email, final String password) {
        clickOnSingInLink();
        setEmail(email);
        clickOnContinueButton();
        setPassword(password);
        clickOnSignInButton();
    }

    public boolean isUserSignedIn() {
        return $x(PROFILE_BUTTON).isDisplayed();
    }
}
