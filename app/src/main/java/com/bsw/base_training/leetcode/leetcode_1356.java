package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author shiwei
 * @Date 2021/1/23-13:57
 * @Email shiweibsw@gmail.com
 */
class leetcode_1356 {
    public int[] sortByBits(int[] arr) {
        int len = arr.length;
        int[][] a1 = new int[len][2];
        for (int i = 0; i < len; i++) {
            int value = arr[i];
            a1[i][0] = value;
            a1[i][1] = get1Count(value);
        }
        Arrays.sort(a1, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] == o2[1] ? o1[0] - o2[0] : o1[1] - o2[1];
            }
        });
        for (int i = 0; i < a1.length; i++) {
            arr[i] = a1[i][0];
        }
        return arr;

    }

    private int get1Count(int a) {
        int count = 0;
        while (a != 0) {
            count++;
            a = a & (a - 1);
        }
        return count;
    }
}
