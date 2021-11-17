package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/17-14:44
 * @Email shiweibsw@gmail.com
 * 给你字符串 s 和整数 k 。
 * <p>
 * 请返回字符串 s 中长度为 k 的单个子字符串中可能包含的最大元音字母数。
 * <p>
 * 英文中的 元音字母 为（a, e, i, o, u）。
 */
class leetcode_1465 {
    //思路：滑动窗口
    public int maxVowels(String s, int k) {
        char[] chars = s.toCharArray();
        int l = 0;
        int r = 0;
        int curr = 0;
        int res = 0;
        while (r < chars.length) {
            if (isVaild(chars[r])) {
                curr++;
            }
            if (r - l >= k) {
                if (isVaild(chars[l])) {
                    curr--;
                }
                l++;
            }
            res = Math.max(res, curr);
            r++;
        }
        return res;
    }

    private boolean isVaild(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}
