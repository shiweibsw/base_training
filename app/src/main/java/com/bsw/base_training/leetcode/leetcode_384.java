package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * @Author shiwei
 * @Date 2021/11/23-15:16
 * @Email shiweibsw@gmail.com
 */
class leetcode_384 {
    private int[] origins;

    public leetcode_384(int[] nums) {
        origins = nums;
    }

    public int[] reset() {
        return origins;
    }

    public int[] shuffle() {

        Random r = new Random();
        int[] result = new int[origins.length];
        System.arraycopy(origins, 0, result, 0, origins.length);
        for (int i = origins.length; i >= 1; i--) {
            int n1 = result[i - 1];
            int index2 = r.nextInt(i);
            result[i - 1] = result[index2];
            result[index2] = n1;
        }
        return result;
    }

}
