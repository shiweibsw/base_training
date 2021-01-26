package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author shiwei
 * @Date 2021/1/26-14:13
 * @Email shiweibsw@gmail.com
 */
class leetcode_1128 {
    public int numEquivDominoPairs(int[][] dominoes) {
        int[] num = new int[100];
        int ret = 0;
        for (int[] domino : dominoes) {
            int val = domino[0] < domino[1] ? domino[0] * 10 + domino[1] : domino[1] * 10 + domino[0];
            ret += num[val];
            num[val]++;
        }
        return ret;
    }
}
