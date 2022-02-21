package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author shiwei
 * @Date 2021/12/2-9:10
 * @Email shiweibsw@gmail.com
 */
class leetcode_506 {

    public String[] findRelativeRanks(int[] score) {

        int len = score.length;
        String[] result = new String[len];
        int[] tmp = new int[len];
        System.arraycopy(score, 0, tmp, 0, len);
        Arrays.sort(tmp);
        for (int i = 0; i < len; i++) {
            int s = score[i];
            int index = bsearch(tmp, s);
            if (index == len - 1) {
                result[i] = "Gold Medal";
            } else if (index == len - 2) {
                result[i] = "Silver Medal";
            } else if (len == len - 3) {
                result[i] = "Bronze Medal";
            } else {
                result[i] = String.valueOf(len - 1 - index);
            }
        }
        return result;
    }

    private int bsearch(int[] a, int t) {
        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (a[mid] == t) {
                return mid;
            } else if (a[mid] > t) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
}
