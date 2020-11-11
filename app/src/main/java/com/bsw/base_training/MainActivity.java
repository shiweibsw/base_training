package com.bsw.base_training;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import static com.bsw.base_training.sort.Training_sort_quick.quickSort;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        int[] a = new int[]{4, 2, 8, 1, 9, 4, 6, 7, 0};
        findViewById(R.id.btn).setOnClickListener(v -> {
            quickSort(a, a.length);
            for (int i = 0; i < a.length; i++) {
                Log.i(TAG, "onCreate: "+a[i]);
            }
        });
    }
}