package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * <p>
 * 示例:
 * <p>
 * 给定 nums = [2, 7, 11, 15], target = 9
 * <p>
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 *
 * @Author shiwei
 * @Date 2020/11/20-11:06
 * @Email shiweibsw@gmail.com
 */
class leetcode_1 {
    public int[] twoSum(int[] nums, int target) {


        Map<Integer, Integer> m = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (m.get(target - nums[i]) != null) {
                return new int[]{i, m.get(target - nums[i])};
            } else {
                m.put(nums[i], i);
            }
        }
        return new int[2];
    }
}
