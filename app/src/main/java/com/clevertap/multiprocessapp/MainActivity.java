package com.clevertap.multiprocessapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import com.clevertap.multiprocessapp.Constant.PROCESS;
import com.clevertap.multiprocessapp.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button process1 = findViewById(R.id.btn_process_one);
        final Button process2 = findViewById(R.id.btn_process_two);
        final Button process3 = findViewById(R.id.btn_process_three);

        process1.setOnClickListener(v -> {
            startActivity(PROCESS.ONE);
        });
        process2.setOnClickListener(v -> {
            startActivity(PROCESS.TWO);
        });
        process3.setOnClickListener(v -> {
            startActivity(PROCESS.THREE);
        });

        CleverTapInstance.initCleverTap(this);
    }

    private void startActivity(PROCESS process) {
        Intent intent = new Intent();
        switch (process) {
            case ONE:
                intent.setClass(this, ProcessOneActivity.class);
                break;

            case TWO:
                intent.setClass(this, ProcessTwoActivity.class);
                break;

            case THREE:
                intent.setClass(this, ProcessThreeActivity.class);
                break;
        }
        startActivity(intent);
    }
}