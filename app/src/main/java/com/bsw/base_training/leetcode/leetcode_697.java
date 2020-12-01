package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author shiwei
 * @Date 2020/12/1-16:18
 * @Email shiweibsw@gmail.com
 */
class leetcode_697 {
    @RequiresApi(api = Build.VERSION_CODES.N)
    public int findShortestSubArray(int[] nums) {
        Map<Integer, Integer> left = new HashMap<>(),
                right = new HashMap<>(), count = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (left.get(nums[i]) == null) left.put(nums[i], i);
            right.put(nums[i], i);
            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }
        int ans = nums.length;
        int degree = Collections.max(count.values());
        for (int x : count.keySet()) {
            if (count.get(x) == degree) {
                ans = Math.min(ans, right.get(x) - left.get(x) + 1);
            }
        }
        return ans;
    }
}
