package com.bsw.base_training;

import android.os.Bundle;
import android.util.Log;

import androidx.appcompat.app.AppCompatActivity;

import com.bsw.base_training.tree.TreeNode;

import java.util.Arrays;

import static com.bsw.base_training.leetcode.leetcode_1572.merge;
import static com.bsw.base_training.leetcode.leetcode_16.threeSumClosest;
import static com.bsw.base_training.leetcode.leetcode_167.twoSum;
import static com.bsw.base_training.leetcode.leetcode_844.backspaceCompare;
import static com.bsw.base_training.tree.Base.createTree;
import static com.bsw.base_training.tree.Base.inOrder;
import static com.bsw.base_training.tree.Base.postOrder;
import static com.bsw.base_training.tree.Base.preOrder;


public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.btn).setOnClickListener(v -> {
            int[][] a={{1,4},{0,2},{3,5}};
            merge(a);
        });
    }
}