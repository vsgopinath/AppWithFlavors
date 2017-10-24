package com.example.gviswa200.myapplication.util;

import android.support.test.espresso.contrib.CountingIdlingResource;

import com.example.gviswa200.myapplication.support.util.CountingIdlingResourceListener;
/**
 * Generic implementation of the counting idling resource
 */
public class CountingIdlingResourceListenerImpl implements CountingIdlingResourceListener {

    private final CountingIdlingResource mCountingIdlingResource;

    public CountingIdlingResourceListenerImpl(final String idlingResourceName) {
        mCountingIdlingResource = new CountingIdlingResource(idlingResourceName);
    }

    public CountingIdlingResource getCountingIdlingResource() {
        return mCountingIdlingResource;
    }

    @Override
    public void increment() {
        mCountingIdlingResource.increment();
    }

    @Override
    public void decrement() {
        mCountingIdlingResource.decrement();
    }
}
