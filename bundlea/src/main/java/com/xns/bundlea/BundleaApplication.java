package com.xns.bundlea;

import android.app.Application;

/**
 * Created by xiongningsheng on 2017/3/14.
 */

public class BundleaApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        System.out.println("bundleaApplication oncreate called");
    }
}
