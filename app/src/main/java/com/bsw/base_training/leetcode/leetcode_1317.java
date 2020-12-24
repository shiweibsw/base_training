package com.bsw.base_training.leetcode;

/**
 * 「无零整数」是十进制表示中 不含任何 0 的正整数。
 * <p>
 * 给你一个整数 n，请你返回一个 由两个整数组成的列表 [A, B]，满足：
 * <p>
 * A 和 B 都是无零整数
 * A + B = n
 * 题目数据保证至少有一个有效的解决方案。
 * <p>
 * 如果存在多个有效解决方案，你可以返回其中任意一个。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：[1,1]
 * 解释：A = 1, B = 1. A + B = n 并且 A 和 B 的十进制表示形式都不包含任何 0 。
 * 示例 2：
 * <p>
 * 输入：n = 11
 * 输出：[2,9]
 * 示例 3：
 * <p>
 * 输入：n = 10000
 * 输出：[1,9999]
 * 示例 4：
 * <p>
 * 输入：n = 69
 * 输出：[1,68]
 * 示例 5：
 * <p>
 * 输入：n = 1010
 * 输出：[11,999]
 *  
 * <p>
 * 提示：
 * <p>
 * 2 <= n <= 10^4
 *
 * @Author shiwei
 * @Date 2020/12/24-15:53
 * @Email shiweibsw@gmail.com
 */
class leetcode_1317 {
    public int[] getNoZeroIntegers(int n) {
        for (int i = 1; i < n; i++) {
            if (!hasZero(i) && !hasZero(n - i)) {
                return new int[]{i, n - i};
            }
        }
        return new int[]{-1, -1};
    }

    private boolean hasZero(int num) {
        int n = num;
        while (n != 0) {
            int x = n % 10;
            if (x == 0) {
                return true;
            } else {
                n /= 10;
            }
        }
        return false;
    }
}
