package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Author shiwei
 * @Date 2020/12/7-10:42
 * @Email shiweibsw@gmail.com
 */
class leetcode_1338 {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int minSetSize(int[] arr) {
        int n = arr.length;
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet()); //转换为list
        list.sort((o1, o2) -> o2.getValue().compareTo(o1.getValue()));
        int count = 0;
        int size = 0;
        for (Map.Entry<Integer, Integer> mapping : list) {
            size += mapping.getValue();
            count++;
            if (size >= n / 2) {
                return count;
            }
        }
        return -1;
    }
}
