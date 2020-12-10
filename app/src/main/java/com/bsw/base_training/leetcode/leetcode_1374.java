package com.bsw.base_training.leetcode;

/**
 * 给你一个整数 n，请你返回一个含 n 个字符的字符串，其中每种字符在该字符串中都恰好出现 奇数次 。
 * <p>
 * 返回的字符串必须只含小写英文字母。如果存在多个满足题目要求的字符串，则返回其中任意一个即可。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 4
 * 输出："pppz"
 * 解释："pppz" 是一个满足题目要求的字符串，因为 'p' 出现 3 次，且 'z' 出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ohhh" 和 "love"。
 * 示例 2：
 * <p>
 * 输入：n = 2
 * 输出："xy"
 * 解释："xy" 是一个满足题目要求的字符串，因为 'x' 和 'y' 各出现 1 次。当然，还有很多其他字符串也满足题目要求，比如："ag" 和 "ur"。
 * 示例 3：
 * <p>
 * 输入：n = 7
 * 输出："holasss"
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= n <= 500
 *
 * @Author shiwei
 * @Date 2020/12/10-14:15
 * @Email shiweibsw@gmail.com
 */
class leetcode_1374 {
    public String generateTheString(int n) {
        char[] c = new char[n];
        if (n % 2 == 1) {
            for (int i = 0; i < n; i++) {
                c[i] = 'a';
            }
        } else {
            for (int i = 0; i < n - 1; i++) {
                c[i] = 'a';
            }
            c[n - 1] = 'b';
        }
        return new String(c);
    }
}
