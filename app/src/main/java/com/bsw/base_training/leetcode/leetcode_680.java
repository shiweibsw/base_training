package com.bsw.base_training.leetcode;

/**
 * 给定一个非空字符串 s，最多删除一个字符。判断是否能成为回文字符串。
 * <p>
 * 示例 1:
 * <p>
 * 输入: "aba"
 * 输出: True
 * 示例 2:
 * <p>
 * 输入: "abca"
 * 输出: True
 * 解释: 你可以删除c字符。
 * 注意:
 * <p>
 * 字符串只包含从 a-z 的小写字母。字符串的最大长度是50000。
 *
 * @Author shiwei
 * @Date 2020/12/14-19:48
 * @Email shiweibsw@gmail.com
 */
class leetcode_680 {
    public boolean validPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        int t = 1;
        int p = 0;
        int q = 0;
        int r = 1;
        while (i < j) {
            if (s.charAt(i) == s.charAt(j)) {
                i++;
                j--;
            } else {
                if (t == 1) {
                    p = i;
                    q = j;
                    t = 0;
                    if (s.charAt(j - 1) == s.charAt(i)) {
                        j--;
                    } else if (s.charAt(i + 1) == s.charAt(j)) {
                        i++;
                    } else {
                        return false;
                    }
                } else {
                    if (r == 1) {//走这里说明上一次的岔路口选错了
                        r = 0;
                        i = p;
                        j = q;
                        t = 0;
                        if (s.charAt(i + 1) == s.charAt(j)) {
                            i++;
                        } else if (s.charAt(j - 1) == s.charAt(i)) {
                            j--;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
