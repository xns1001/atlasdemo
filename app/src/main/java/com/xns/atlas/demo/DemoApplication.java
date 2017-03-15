package com.xns.atlas.demo;

import android.app.Application;
import android.util.Log;

/**
 * Created by xiongningsheng on 2017/3/14.
 */

public class DemoApplication extends Application {
    private static final String TAG = "DemoApplication";
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG, "onCreate() called");
    }
}
