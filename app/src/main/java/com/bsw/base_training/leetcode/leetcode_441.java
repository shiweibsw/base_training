package com.bsw.base_training.leetcode;

/**
 * 你总共有 n 枚硬币，你需要将它们摆成一个阶梯形状，第 k 行就必须正好有 k 枚硬币。
 * <p>
 * 给定一个数字 n，找出可形成完整阶梯行的总行数。
 * <p>
 * n 是一个非负整数，并且在32位有符号整型的范围内。
 * <p>
 * 示例 1:
 * <p>
 * n = 5
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第三行不完整，所以返回2.
 * 示例 2:
 * <p>
 * n = 8
 * <p>
 * 硬币可排列成以下几行:
 * ¤
 * ¤ ¤
 * ¤ ¤ ¤
 * ¤ ¤
 * <p>
 * 因为第四行不完整，所以返回3.
 *
 * @Author shiwei
 * @Date 2020/11/16-14:32
 * @Email shiweibsw@gmail.com
 */
class leetcode_441 {
    public int arrangeCoins(int n) {
        //暴力解法
        // int k=0;
        // while(n>=0){
        //     k++;
        //     n=n-k;
        // }
        // return k-1;
        //二分法
        int low = 0;
        int high = n;
        long mid, sum;
        while (low <= high) {
            mid = low + ((high - low) >> 1);
            sum = (mid * (mid + 1)) >> 1;
            if (sum == n) {
                return (int) mid;
            } else if (sum > n) {
                high = (int) mid - 1;
            } else {
                low = (int) mid + 1;
            }
        }
        return high;
    }
}
