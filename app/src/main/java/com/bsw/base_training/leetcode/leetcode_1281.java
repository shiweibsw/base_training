package com.bsw.base_training.leetcode;

/**
 * 给你一个整数 n，请你帮忙计算并返回该整数「各位数字之积」与「各位数字之和」的差。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 234
 * 输出：15
 * 解释：
 * 各位数之积 = 2 * 3 * 4 = 24
 * 各位数之和 = 2 + 3 + 4 = 9
 * 结果 = 24 - 9 = 15
 * 示例 2：
 * <p>
 * 输入：n = 4421
 * 输出：21
 * 解释：
 * 各位数之积 = 4 * 4 * 2 * 1 = 32
 * 各位数之和 = 4 + 4 + 2 + 1 = 11
 * 结果 = 32 - 11 = 21
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 10^5
 *
 * @Author shiwei
 * @Date 2020/12/24-9:01
 * @Email shiweibsw@gmail.com
 */
class leetcode_1281 {
    public int subtractProductAndSum(int n) {
        int ji = 1;
        int sum = 0;
        while (n != 0) {
            int l = n % 10;
            ji *= l;
            sum += l;
            n /= 10;
        }
        return ji - sum;
    }
}
