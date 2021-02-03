package com.bsw.base_training.leetcode;

import java.util.Arrays;

/**
 * @Author shiwei
 * @Date 2021/2/3-14:00
 * @Email shiweibsw@gmail.com
 * 中位数是有序序列最中间的那个数。如果序列的长度是偶数，则没有最中间的数；此时中位数是最中间的两个数的平均数。
 * <p>
 * 例如：
 * <p>
 * [2,3,4]，中位数是 3
 * [2,3]，中位数是 (2 + 3) / 2 = 2.5
 * 给你一个数组 nums，有一个长度为 k 的窗口从最左端滑动到最右端。窗口中有 k 个数，每次窗口向右移动 1 位。你的任务是找出每次窗口移动后得到的新窗口中元素的中位数，并输出由它们组成的数组。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 给出 nums = [1,3,-1,-3,5,3,6,7]，以及 k = 3。
 * <p>
 * 窗口位置                      中位数
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       1
 * 1 [3  -1  -3] 5  3  6  7      -1
 * 1  3 [-1  -3  5] 3  6  7      -1
 * 1  3  -1 [-3  5  3] 6  7       3
 * 1  3  -1  -3 [5  3  6] 7       5
 * 1  3  -1  -3  5 [3  6  7]      6
 *  因此，返回该滑动窗口的中位数数组 [1,-1,-1,3,5,6]。
 * 提示：
 * <p>
 * 你可以假设 k 始终有效，即：k 始终小于输入的非空数组的元素个数。
 * 与真实值误差在 10 ^ -5 以内的答案将被视作正确答案。
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
