package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组和一个整数 k，判断数组中是否存在两个不同的索引 i 和 j，使得 nums [i] = nums [j]，并且 i 和 j 的差的 绝对值 至多为 k。
 * <p>
 *  
 * <p>
 * 示例 1:
 * <p>
 * 输入: nums = [1,2,3,1], k = 3
 * 输出: true
 * 示例 2:
 * <p>
 * 输入: nums = [1,0,1,1], k = 1
 * 输出: true
 * 示例 3:
 * <p>
 * 输入: nums = [1,2,3,1,2,3], k = 2
 * 输出: false
 *
 * @Author shiwei
 * @Date 2020/11/18-15:21
 * @Email shiweibsw@gmail.com
 */
class leetcode_219 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        if (n <= 1) return false;
        Map<Integer, Integer> cache = new HashMap<Integer, Integer>();
        for (int i = 0; i < n; i++) {
            if (cache.get(nums[i]) != null) {
                if (Math.abs(i - cache.get(nums[i])) <= k) {
                    return true;
                } else {
                    cache.put(nums[i], i);
                }
            } else {
                cache.put(nums[i], i);
            }
        }
        return false;


        //暴力搜索
        // int n=nums.length;
        // if(n<=1) return false;

        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j]&&Math.abs(i-j)<=k){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
