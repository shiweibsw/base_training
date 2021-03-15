package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/15-15:22
 * @Email shiweibsw@gmail.com
 */
class leetcode_45 {
    public int jump(int[] nums) {
        int len = nums.length;
        int step = 0;
        int maxPosition = 0;
        int end = 0;
        for (int i = 0; i < len - 1; i++) {
            maxPosition = Math.max(maxPosition, i + nums[i]);
            if (i == end) {
                end = maxPosition;
                step++;
            }
        }
        return step;
    }
}
