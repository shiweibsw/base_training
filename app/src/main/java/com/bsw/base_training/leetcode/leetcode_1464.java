package com.bsw.base_training.leetcode;

/**
 * 给你一个整数数组 nums，请你选择数组的两个不同下标 i 和 j，使 (nums[i]-1)*(nums[j]-1) 取得最大值。
 * <p>
 * 请你计算并返回该式的最大值。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：nums = [3,4,5,2]
 * 输出：12
 * 解释：如果选择下标 i=1 和 j=2（下标从 0 开始），则可以获得最大值，(nums[1]-1)*(nums[2]-1) = (4-1)*(5-1) = 3*4 = 12 。
 * 示例 2：
 * <p>
 * 输入：nums = [1,5,4,5]
 * 输出：16
 * 解释：选择下标 i=1 和 j=3（下标从 0 开始），则可以获得最大值 (5-1)*(5-1) = 16 。
 * 示例 3：
 * <p>
 * 输入：nums = [3,7]
 * 输出：12
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= nums.length <= 500
 * 1 <= nums[i] <= 10^3
 *
 * @Author shiwei
 * @Date 2021/1/4-10:23
 * @Email shiweibsw@gmail.com
 */
class leetcode_1464 {
    public int maxProduct(int[] nums) {
        int fir = 0;
        int sec = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > nums[fir]) {
                sec = fir;
                fir = i;
            } else if (nums[i] > nums[sec] && i != fir) {
                sec = i;
            }
        }
        return (nums[fir] - 1) * (nums[sec] - 1);
    }
}
