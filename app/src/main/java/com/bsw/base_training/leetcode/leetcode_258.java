package com.bsw.base_training.leetcode;

/**
 * 给定一个非负整数 num，反复将各个位上的数字相加，直到结果为一位数。
 * <p>
 * 示例:
 * <p>
 * 输入: 38
 * 输出: 2
 * 解释: 各位相加的过程为：3 + 8 = 11, 1 + 1 = 2。 由于 2 是一位数，所以返回 2。
 * 进阶:
 * 你可以不使用循环或者递归，且在 O(1) 时间复杂度内解决这个问题吗？
 *
 * @Author shiwei
 * @Date 2020/12/24-14:33
 * @Email shiweibsw@gmail.com
 */
class leetcode_258 {
    public int addDigits(int num) {
        int res = num;
        int n = 0;
        while (true) {
            n = res;
            res = 0;
            while (n != 0) {
                int x = n % 10;
                res += x;
                n /= 10;
            }
            if (res <= 9) {
                return res;
            }
        }
    }
}
