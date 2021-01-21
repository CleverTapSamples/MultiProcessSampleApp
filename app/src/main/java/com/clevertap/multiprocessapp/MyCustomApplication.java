package com.clevertap.multiprocessapp;

import android.app.Application;
import android.os.Build.VERSION_CODES;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.ActivityLifecycleCallback;

public class MyCustomApplication extends Application {

    private static final String TAG = "MyCustomApplication";

    @RequiresApi(api = VERSION_CODES.P)
    @Override
    public void onCreate() {
        super.onCreate();
        String currentProcessName = Utils.getCurrentProcessName(this);
        ActivityLifecycleCallback.register(this);
        Log.d(TAG, "onCreate: " + currentProcessName);
    }
}
