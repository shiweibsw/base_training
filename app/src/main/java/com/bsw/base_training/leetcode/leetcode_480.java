package com.bsw.base_training.leetcode;

import java.util.Arrays;

/**
 * @Author shiwei
 * @Date 2021/2/3-14:00
 * @Email shiweibsw@gmail.com
 */
class leetcode_480 {
    public double[] medianSlidingWindow(int[] nums, int k) {
        double[] ans = new double[nums.length - k + 1];
        if (k <= 1) {//特殊处理
            for (int i = 0; i < ans.length; i++) {
                ans[i] = nums[i];
            }
            return ans;
        }
        int[] arr = new int[k];
        System.arraycopy(nums, 0, arr, 0, k);
        Arrays.sort(arr);
        ans[0] = getCenterNum(arr, k);
        for (int i = 1; i <= nums.length - k; i++) {
            int add = nums[i + k - 1];//新添加进来的数字
            int del = nums[i - 1];//删除掉的数字
            boolean isDel = false;
            for (int j = 0; j < k; j++) {
                if (!isDel) {
                    if (arr[j] == del) {
                        isDel = true;
                    }
                } else {
                    arr[j - 1] = arr[j];
                }
            }
            int j = k - 2;
            for (; j >= 0; j--) {
                if (arr[j] > add) {
                    arr[j + 1] = arr[j];
                } else {
                    break;
                }
            }
            arr[j + 1] = add;
            ans[i] = getCenterNum(arr, k);
        }
        return ans;
    }

    private double getCenterNum(int[] arr, int k) {
        if (k % 2 == 0) {
            return (arr[k / 2] / 2.0 + arr[k / 2 - 1] / 2.0);
        } else {
            return (double) arr[k / 2];
        }
    }
}
