package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/5-13:34
 * @Email shiweibsw@gmail.com
 * 给定一个整数 n，返回 n! 结果尾数中零的数量。
 * <p>
 * 示例 1:
 * <p>
 * 输入: 3
 * 输出: 0
 * 解释: 3! = 6, 尾数中没有零。
 * 示例 2:
 * <p>
 * 输入: 5
 * 输出: 1
 * 解释: 5! = 120, 尾数中有 1 个零.
 * 说明: 你算法的时间复杂度应为 O(log n) 。
 */
class leetcode_172 {
    public int trailingZeroes(int n) {
        int ans = 0;
        while (n >= 5) {
            ans += n / 5;
            n /= 5;
        }
        return ans;
    }
}
