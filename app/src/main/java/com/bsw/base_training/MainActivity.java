package com.bsw.base_training;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import static com.bsw.base_training.search.Training_Search_bsearch.besarch;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        int[] a = new int[]{33,22,48,4,39,36,41,47,15,45};
//        int[] b = new int[]{22,33,48,4};
        findViewById(R.id.btn).setOnClickListener(v -> {
            int[] a = new int[]{4, 5, 6,7,9, 1, 2, 3};
            Log.i(TAG, "==========" + besarch(a, a.length, 1));
        });
    }
}