package com.bsw.base_training.leetcode;

import java.util.Arrays;

/**
 * 给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。
 * 异位词是指两个字符串的长度相等并且每个字母出现的次数也相等。
 *
 * @Author shiwei
 * @Date 2020/11/11-19:23
 * @Email shiweibsw@gmail.com
 */
class leetcode_242 {
    public boolean isAnagram(String s, String t) {
        if (s == null || t == null) return false;
        if (s.length() != t.length()) return false;
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        for (int i = 0; i < cs.length; i++) {
            if (cs[i] != ct[i]) {
                return false;
            }
        }
        return true;
    }
}
