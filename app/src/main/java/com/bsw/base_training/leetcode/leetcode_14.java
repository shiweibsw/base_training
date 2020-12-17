package com.bsw.base_training.leetcode;

/**
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * <p>
 * 如果不存在公共前缀，返回空字符串 ""。
 * <p>
 * 示例 1:
 * <p>
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 * <p>
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 * <p>
 * 所有输入只包含小写字母 a-z 。
 *
 * @Author shiwei
 * @Date 2020/12/16-17:34
 * @Email shiweibsw@gmail.com
 */
class leetcode_14 {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        StringBuilder sb = new StringBuilder();
        int j = Integer.MAX_VALUE;
        for (int i = 0; i < strs.length; i++) {
            if (strs[i].length() < j) {
                j = strs[i].length();
            }
        }
        int p = 0;
        int curr = 0;
        char c = ' ';
        char last = ' ';
        while (p < j) {
            curr = 0;
            c = ' ';
            last = ' ';
            for (int i = 0; i < strs.length; i++) {
                c = strs[i].charAt(p);
                if (last == ' ') {
                    last = c;
                    curr++;
                } else if (last == c) {
                    curr++;
                } else {
                    break;
                }
            }
            if (curr != strs.length) {
                break;
            } else {
                sb.append(c);
                p++;
            }
        }
        return sb.toString();
    }
}
