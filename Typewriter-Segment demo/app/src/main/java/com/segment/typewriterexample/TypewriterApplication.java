package com.segment.typewriterexample;

import android.app.Application;

import com.segment.analytics.Analytics;

public class TypewriterApplication extends Application {
    private static final String SEGMENT_WRITE_KEY = "0CpLpP0r4EprAXXb8b8mppH1VegstEin";

    @Override
    public void onCreate() {
        super.onCreate();

        Analytics analytics = new Analytics.Builder(this, SEGMENT_WRITE_KEY)
                .trackApplicationLifecycleEvents()
                .recordScreenViews()
                .build();
        Analytics.setSingletonInstance(analytics);
    }
}
