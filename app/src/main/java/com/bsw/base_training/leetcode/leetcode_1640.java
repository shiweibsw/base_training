package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2020/11/12-14:00
 * @Email shiweibsw@gmail.com
 */
public class leetcode_1640 {
    public static boolean canFormArray(int[] arr, int[][] pieces) {
        int i = 0;
        int k = 0;
        for (; i < arr.length; i += k) {
            boolean flag = false;
            for (int j = 0; j < pieces.length; j++) {
                if (arr[i] == pieces[j][0]) {
                    for (k = 0; k < pieces[j].length; k++) {
                        if (arr[i + k] != pieces[j][k]) {
                            return false;
                        }
                    }
                    flag = true;
                    break;
                }
            }
            if (!flag) break;
        }
        return i == arr.length;
    }
}
