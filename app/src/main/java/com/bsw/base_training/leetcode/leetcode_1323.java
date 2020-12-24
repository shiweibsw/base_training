package com.bsw.base_training.leetcode;

/**
 * 给你一个仅由数字 6 和 9 组成的正整数 num。
 * <p>
 * 你最多只能翻转一位数字，将 6 变成 9，或者把 9 变成 6 。
 * <p>
 * 请返回你可以得到的最大数字。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：num = 9669
 * 输出：9969
 * 解释：
 * 改变第一位数字可以得到 6669 。
 * 改变第二位数字可以得到 9969 。
 * 改变第三位数字可以得到 9699 。
 * 改变第四位数字可以得到 9666 。
 * 其中最大的数字是 9969 。
 * 示例 2：
 * <p>
 * 输入：num = 9996
 * 输出：9999
 * 解释：将最后一位从 6 变到 9，其结果 9999 是最大的数。
 * 示例 3：
 * <p>
 * 输入：num = 9999
 * 输出：9999
 * 解释：无需改变就已经是最大的数字了。
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= num <= 10^4
 * num 每一位上的数字都是 6 或者 9 。
 *
 * @Author shiwei
 * @Date 2020/12/24-9:51
 * @Email shiweibsw@gmail.com
 */
class leetcode_1323 {
    public int maximum69Number(int num) {
        int l6 = 0;
        int len = 0;
        int n = num;
        while (n != 0) {
            int x = n % 10;
            len++;
            if (x == 6) {
                l6 = len;
            }
            n /= 10;
        }
        if (l6 == 1) {
            return num + 3;
        } else if (l6 == 2) {
            return num + 30;
        } else if (l6 == 3) {
            return num + 300;
        } else if (l6 == 4) {
            return num + 3000;
        } else {
            return num;
        }

    }
}
