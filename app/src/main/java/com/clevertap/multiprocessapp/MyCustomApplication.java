package com.clevertap.multiprocessapp;

import android.app.Application;
import android.os.Build.VERSION_CODES;
import android.util.Log;
import androidx.annotation.RequiresApi;
import com.clevertap.android.sdk.ActivityLifecycleCallback;
import com.google.firebase.FirebaseApp;

public class MyCustomApplication extends Application {

    private static final String TAG = "MyCustomApplication";

    @RequiresApi(api = VERSION_CODES.P)
    @Override
    public void onCreate() {
        super.onCreate();
        String currentProcessName = Utils.getCurrentProcessName(this);
        if (Constant.MAIN_PROCESS_NAME.equalsIgnoreCase(currentProcessName)) {
            FirebaseApp.initializeApp(this);
        }
        ActivityLifecycleCallback.register(this);
        Log.d(TAG, "onCreate: " + currentProcessName);
    }
}
