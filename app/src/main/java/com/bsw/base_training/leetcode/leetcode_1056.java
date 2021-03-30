package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/30-14:46
 * @Email shiweibsw@gmail.com
 * 给定一个数字 N，当它满足以下条件的时候返回 true：
 * <p>
 * 原数字旋转 180° 以后可以得到新的数字。
 * <p>
 * 如 0, 1, 6, 8, 9 旋转 180° 以后，得到了新的数字 0, 1, 9, 8, 6 。
 * <p>
 * 2, 3, 4, 5, 7 旋转 180° 后，得到的不是数字。
 * <p>
 * 易混淆数 (confusing number) 在旋转180°以后，可以得到和原来不同的数，且新数字的每一位都是有效的。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：6
 * 输出：true
 * 解释：
 * 把 6 旋转 180° 以后得到 9，9 是有效数字且 9!=6 。
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：89
 * 输出：true
 * 解释:
 * 把 89 旋转 180° 以后得到 68，86 是有效数字且 86!=89 。
 * 示例 3：
 * <p>
 * <p>
 * <p>
 * 输入：11
 * 输出：false
 * 解释：
 * 把 11 旋转 180° 以后得到 11，11 是有效数字但是值保持不变，所以 11 不是易混淆数字。
 * 示例 4：
 * <p>
 * <p>
 * <p>
 * 输入：25
 * 输出：false
 * 解释：
 * 把 25 旋转 180° 以后得到的不是数字。
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= N <= 10^9
 * 可以忽略掉旋转后得到的前导零，例如，如果我们旋转后得到 0008 那么该数字就是 8 。
 */
class leetcode_1056 {
    public boolean confusingNumber(int N) {
        int ori = N;
        int res = 0;
        while (N != 0) {
            int t = N % 10;
            if (t == 2 || t == 3 || t == 4 || t == 5 || t == 7) {
                return false;
            } else {
                if (t == 6) {
                    res = res * 10 + 9;
                } else if (t == 9) {
                    res = res * 10 + 6;
                } else {
                    res = res * 10 + t;
                }
            }
            N = N / 10;
        }
        return ori > 0 && res != ori;
    }
}
