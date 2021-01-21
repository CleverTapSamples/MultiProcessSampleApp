package com.clevertap.multiprocessapp;

import android.content.Context;
import android.util.Log;
import com.clevertap.android.sdk.CleverTapAPI;
import com.clevertap.android.sdk.CleverTapInstanceConfig;

public class CleverTapInstance {

    private static final String TAG = "CleverTapInstance";

    public static void initCleverTap(Context context) {
        String currentProcessName = Utils.getCurrentProcessName(context);
        Log.d(TAG, "initCleverTap on Process:" );
        CleverTapAPI.setDebugLevel(3);
        String accountId = "48Z-795-765Z";
        String accToken = "5ca-1b4";
        CleverTapInstanceConfig config = CleverTapInstanceConfig.createInstance(context, accountId, accToken);
        if(!Constant.MAIN_PROCESS_NAME.equalsIgnoreCase(currentProcessName)){
            config.setDisableAppLaunchedEvent(true);
        }
        CleverTapAPI cleverTapAPI = CleverTapAPI.instanceWithConfig(context, config);
        cleverTapAPI.pushEvent("Cover");
    }
}