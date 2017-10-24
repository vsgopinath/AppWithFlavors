package com.example.gviswa200.myapplication.cucumber.pages;

import com.example.gviswa200.myapplication.cucumber.steps.HelperSteps;

/**
 * Contain the basic behavior logic and checks shared across all pages/views
 */
public class BasePage {

    protected static final String SCREENSHOT_TAG = "invalid-page";

    public <T extends BasePage> T is(Class<T> type) {
        if (type.isInstance(this)) {
            return type.cast(this);
        } else {
            HelperSteps.takeScreenshot(SCREENSHOT_TAG);
            throw new InvalidPageException("Invalid page type. Expected: " + type.getSimpleName() + ", but got: " + this.getClass().getSimpleName());
        }
    }

    public static class InvalidPageException extends RuntimeException {

        public InvalidPageException(final String message) {
            super(message);
        }
    }
}
