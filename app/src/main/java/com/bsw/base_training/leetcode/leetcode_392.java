package com.bsw.base_training.leetcode;

/**
 * 给定字符串 s 和 t ，判断 s 是否为 t 的子序列。
 * <p>
 * 你可以认为 s 和 t 中仅包含英文小写字母。字符串 t 可能会很长（长度 ~= 500,000），而 s 是个短字符串（长度 <=100）。
 * <p>
 * 字符串的一个子序列是原始字符串删除一些（也可以不删除）字符而不改变剩余字符相对位置形成的新字符串。（例如，"ace"是"abcde"的一个子序列，而"aec"不是）。
 * <p>
 * 示例 1:
 * s = "abc", t = "ahbgdc"
 * <p>
 * 返回 true.
 * <p>
 * 示例 2:
 * s = "axc", t = "ahbgdc"
 * <p>
 * 返回 false.
 *
 * @Author shiwei
 * @Date 2020/11/23-9:36
 * @Email shiweibsw@gmail.com
 */
class leetcode_392 {
    public boolean isSubsequence(String s, String t) {
        //双指针
        int i = 0;
        int j = 0;
        int n = s.length();
        int m = t.length();
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == n;

        //暴力+哨兵
        // char[] s1 = s.toCharArray();
        // char[] t1 = t.toCharArray();
        // int lastIndex = -1;
        // for (char c : s1) {
        //     boolean flag = false;
        //     for (int i = lastIndex+1; i < t1.length; i++) {
        //         if (t1[i] == c && lastIndex <= i) {
        //             flag = true;
        //             lastIndex = i;
        //             break;
        //         }
        //     }
        //     if (!flag) return false;
        // }
        // return true;


    }
}
