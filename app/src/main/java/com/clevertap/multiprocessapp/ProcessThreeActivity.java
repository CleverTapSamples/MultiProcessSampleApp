package com.clevertap.multiprocessapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.clevertap.multiprocessapp.R;

public class ProcessThreeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_process_three);
        CleverTapInstance.initCleverTap(this);
    }
}