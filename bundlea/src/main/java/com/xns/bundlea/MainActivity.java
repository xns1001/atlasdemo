package com.xns.bundlea;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

import com.xns.base.BaseActivity;
import com.xns.base.Utils;


/**
 * Created by xiongningsheng on 2017/3/14.
 */

public class MainActivity extends BaseActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
        ImageView iv1 = (ImageView) findViewById(R.id.iv1);
//        iv1.setBackgroundResource(com.xns.base.R.drawable.push);
        Utils.dosomething();
    }
}
