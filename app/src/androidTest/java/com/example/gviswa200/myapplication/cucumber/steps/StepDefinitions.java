package com.example.gviswa200.myapplication.cucumber.steps;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Debug;
import android.os.PowerManager;
import android.support.test.InstrumentationRegistry;
import android.support.test.espresso.Espresso;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;


import com.example.gviswa200.myapplication.MainActivity;
import com.example.gviswa200.myapplication.cucumber.pages.BasePage;
import com.example.gviswa200.myapplication.cucumber.pages.MainPage;

import org.junit.Rule;
import org.junit.runner.RunWith;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.junit.Assert.assertNotNull;

/**
 * This defines all the translations from Gherkin (semi-English) sentences to Java
 */
@SuppressWarnings("JUnitTestCaseWithNoTests")
@RunWith(AndroidJUnit4.class)
public class StepDefinitions {

    private BasePage mCurrentPage;
    private Activity mActivity;
    @Rule
    private ActivityTestRule<MainActivity> mActivityRule = new ActivityTestRule<>(MainActivity.class,
            true, true);

    @Given("^I see the login page$")
    public void iSeeTheLoginPage() throws Throwable {
        mActivity = mActivityRule.launchActivity(new Intent());
        Thread.sleep(2000);
        mCurrentPage = new MainPage();
        mCurrentPage = mCurrentPage.is(MainPage.class);
    }

}
