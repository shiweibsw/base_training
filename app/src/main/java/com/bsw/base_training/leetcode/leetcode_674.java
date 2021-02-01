package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/2/1-14:47
 * @Email shiweibsw@gmail.com
 */
class leetcode_674 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int curr = 0;
        int max = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] < nums[i + 1]) {
                curr++;
                max = Math.max(max, curr);
            } else {
                curr = 0;
            }
        }
        return max + 1;
    }
}
