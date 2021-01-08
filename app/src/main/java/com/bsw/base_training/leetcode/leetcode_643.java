package com.bsw.base_training.leetcode;

/**
 * 给定 n 个整数，找出平均数最大且长度为 k 的连续子数组，并输出该最大平均数。
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：[1,12,-5,-6,50,3], k = 4
 * 输出：12.75
 * 解释：最大平均数 (12-5-6+50)/4 = 51/4 = 12.75
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= k <= n <= 30,000。
 * 所给数据范围 [-10,000，10,000]。
 *
 * @Author shiwei
 * @Date 2021/1/8-16:52
 * @Email shiweibsw@gmail.com
 */
class leetcode_643 {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length > k ? k : nums.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum += nums[i];
        }
        if (nums.length <= k) {
            return Double.valueOf(sum) / nums.length;
        }
        double max = sum;
        for (int i = 1; i <= nums.length - k; i++) {
            sum = sum - nums[i - 1] + nums[i + k - 1];
            max = Math.max(max, sum);
        }
        return Double.valueOf(max) / k;
    }
}
