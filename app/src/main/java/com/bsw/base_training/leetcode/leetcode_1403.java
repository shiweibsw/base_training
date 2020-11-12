package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shiwei
 * @Date 2020/11/12-8:52
 * @Email shiweibsw@gmail.com
 */
class leetcode_1403 {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> result = new ArrayList<>();
        if (nums.length == 1) {
            result.add(nums[0]);
            return result;
        }
        int sum = 0;
        int resultSum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            int max = getMaxIndex(nums);
            resultSum+=nums[max];
            if (resultSum > sum - resultSum) {
                result.add(nums[max]);
                break;
            } else {
                result.add(nums[max]);
                nums[max]=0;
            }
        }
        return result;
    }

    private int getMaxIndex(int[] nums) {
        int maxIndex = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
