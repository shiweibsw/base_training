package com.bsw.base_training;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

import static com.bsw.base_training.leetcode.leetcode_16.threeSumClosest;
import static com.bsw.base_training.leetcode.leetcode_167.twoSum;
import static com.bsw.base_training.leetcode.leetcode_844.backspaceCompare;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(v -> {
            backspaceCompare("ab#c","ad#c");

        });
    }
}