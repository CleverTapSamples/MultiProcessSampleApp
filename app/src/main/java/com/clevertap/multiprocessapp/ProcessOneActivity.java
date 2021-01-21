package com.clevertap.multiprocessapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.clevertap.multiprocessapp.R;

public class ProcessOneActivity extends AppCompatActivity {

    private static final String TAG = "ProcessOneActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_one);
        CleverTapInstance.initCleverTap(this);
    }
}