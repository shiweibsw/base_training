package com.bsw.base_training.leetcode;

/**
 * 给定一个正整数 num，编写一个函数，如果 num 是一个完全平方数，则返回 True，否则返回 False。
 * <p>
 * 说明：不要使用任何内置的库函数，如  sqrt。
 * <p>
 * 示例 1：
 * <p>
 * 输入：16
 * 输出：True
 * 示例 2：
 * <p>
 * 输入：14
 * 输出：False
 *
 * @Author shiwei
 * @Date 2020/11/26-19:17
 * @Email shiweibsw@gmail.com
 */
class leetcode_367 {
    public boolean isPerfectSquare(int num) {
        if (num < 2) return true;
        long low = 2;
        long high = num / 2;
        while (low <= high) {
            long mid = low + ((high - low) >> 1);
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return false;
    }
}
