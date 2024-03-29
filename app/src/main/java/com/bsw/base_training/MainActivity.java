package com.bsw.base_training;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.bsw.base_training.test.CoinTest;

import java.util.ArrayList;


class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    int itemCount = 5;
    int currentItem = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(v -> {
            currentItem = (currentItem - 1 + itemCount) % 5;
            System.out.print(currentItem);
        });
    }
}