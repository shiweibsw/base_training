package com.bsw.base_training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import static com.bsw.base_training.leetcode.leetcode_1122.relativeSortArray;
import static com.bsw.base_training.sort.Training_sort_quick.quickSort;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] a = new int[]{33,22,48,4,39,36,41,47,15,45};
        int[] b = new int[]{22,33,48,4};
        findViewById(R.id.btn).setOnClickListener(v -> {
            relativeSortArray(a, b);
        });
    }
}