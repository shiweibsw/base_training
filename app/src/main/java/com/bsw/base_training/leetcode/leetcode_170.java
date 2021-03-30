package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @Author shiwei
 * @Date 2021/3/30-14:16
 * @Email shiweibsw@gmail.com
 */
class leetcode_170 {
    List<Integer> datas;
    int[] arr;
    int size = 0;

    /**
     * Initialize your data structure here.
     */
    public leetcode_170() {
        datas = new ArrayList();
    }

    /**
     * Add the number to an internal data structure..
     */
    public void add(int number) {
        datas.add(number);
        size++;
    }

    /**
     * Find if there exists any pair of numbers which sum is equal to the value.
     */
    public boolean find(int value) {
        if (size == 0) return false;
        if (arr == null || arr.length != size) {
            arr = null;
            arr = new int[size];
            int index = 0;
            for (int i : datas) {
                arr[index++] = i;
            }
            Arrays.sort(arr);
        }
        //有序数组中查找两数之后等于给定值
        int left = 0;
        int right = size - 1;
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum > value) {
                right--;
            } else if (sum < value) {
                left++;
            } else {
                return true;
            }
        }
        return false;
    }
}
