package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shiwei
 * @Date 2021/1/20-17:11
 * @Email shiweibsw@gmail.com
 * 给你一个整数数组 nums ，返回该数组所有可能的子集（幂集）。解集不能包含重复的子集。
 * <p>
 *  
 * 示例 1：
 * <p>
 * 输入：nums = [1,2,3]
 * 输出：[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]
 * 示例 2：
 * <p>
 * 输入：nums = [0]
 * 输出：[[],[0]]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= nums.length <= 10
 * -10 <= nums[i] <= 10
 */
class leetcode_78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        int n = nums.length;
        for (int mask = 0; mask < (1 << n); mask++) {
            List<Integer> t = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                if ((mask & (1 << i)) != 0) {
                    t.add(nums[i]);
                }
            }
            ans.add(t);
        }
        return ans;
    }
}
