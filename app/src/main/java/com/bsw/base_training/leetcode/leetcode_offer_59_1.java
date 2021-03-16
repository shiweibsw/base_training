package com.bsw.base_training.leetcode;

import android.os.Build;

import androidx.annotation.RequiresApi;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/**
 * @Author shiwei
 * @Date 2021/3/16-11:56
 * @Email shiweibsw@gmail.com
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * <p>
 * 示例:
 * <p>
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 * <p>
 * 滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 * 1 [3  -1  -3] 5  3  6  7       3
 * 1  3 [-1  -3  5] 3  6  7       5
 * 1  3  -1 [-3  5  3] 6  7       5
 * 1  3  -1  -3 [5  3  6] 7       6
 * 1  3  -1  -3  5 [3  6  7]      7
 *  
 * <p>
 * 提示：
 * <p>
 * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
 */
class leetcode_offer_59_1 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) return new int[0];
        int[] ans = new int[nums.length - k + 1];
        int index = 0;
        ans[index] = getMaxValue(nums, 0, k - 1);
        for (int i = k; i < nums.length; i++) {
            int max = ans[index];
            if (nums[i - k] != max) {
                if (max > nums[i]) {
                    ans[++index] = max;
                } else {
                    ans[++index] = nums[i];
                }
            } else {
                ans[++index] = getMaxValue(nums, i - k + 1, i);
            }
        }
        return ans;
    }

    private int getMaxValue(int[] nums, int start, int end) {
        int ans = nums[start];
        for (int i = start; i <= end; i++) {
            if (nums[i] > ans) {
                ans = nums[i];
            }
        }
        return ans;
    }
}
