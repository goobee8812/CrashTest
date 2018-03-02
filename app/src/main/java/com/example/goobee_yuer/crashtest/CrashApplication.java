package com.example.goobee_yuer.crashtest;

import android.app.Application;

/**
 * Created by Goobee_yuer on 2018/3/1.
 */

public class CrashApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler crashHandler = CrashHandler.getInstance();
        crashHandler.init(getApplicationContext());
    }
}