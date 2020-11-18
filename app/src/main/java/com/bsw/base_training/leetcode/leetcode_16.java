package com.bsw.base_training.leetcode;

import android.util.Log;

import java.util.Arrays;
import java.util.Stack;

/**
 * @Author shiwei
 * @Date 2020/11/16-16:04
 * @Email shiweibsw@gmail.com
 */
public class leetcode_16 {
    public static int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1, k = nums.length - 1;
            while (j < k) {
                sum = nums[i] + nums[j] + nums[k];
                if (Math.abs(sum - target) < result) {
                    Log.i("MainActivity", "i: =" + i + "--j:=" + j + "--k:=" + k + "--sum:=" + sum + "--sum - target:=" + (sum - target));
                    result = Math.abs(sum - target);
                }
                if (sum == target) {
                    return sum;
                } else if (sum > target) {
                    k--;
                } else {
                    j++;
                }
            }
        }
        return sum;
    }
}
