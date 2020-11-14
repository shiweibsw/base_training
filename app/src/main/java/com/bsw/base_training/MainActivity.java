package com.bsw.base_training;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Arrays;

import static com.bsw.base_training.leetcode.leetcode_167.twoSum;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] a = new int[]{2, 3, 4};
//        int[] b = new int[]{22,33,48,4};
        findViewById(R.id.btn).setOnClickListener(v -> {
            Log.i(TAG, "onCreate: " + Arrays.toString(twoSum(a, 6)));
        });
    }
}