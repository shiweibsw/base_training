package com.bsw.base_training.leetcode;

/**
 * 实现 strStr() 函数。
 * <p>
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 * <p>
 * 示例 1:
 * <p>
 * 输入: haystack = "hello", needle = "ll"
 * 输出: 2
 * 示例 2:
 * <p>
 * 输入: haystack = "aaaaa", needle = "bba"
 * 输出: -1
 * 说明:
 * <p>
 * 当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。
 * <p>
 * 对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与C语言的 strstr() 以及 Java的 indexOf() 定义相符。
 *
 * @Author shiwei
 * @Date 2020/11/27-14:09
 * @Email shiweibsw@gmail.com
 */
class leetcode_28 {
    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        int i = 0;
        int j = 0;
        int p = -1;
        while (i < haystack.length() && j < needle.length()) {
            if (p == -1) {
                p = i;
            }
            if (haystack.charAt(p) != needle.charAt(j)) {
                i++;
                p = -1;
                j = 0;
            } else {
                p++;
                j++;
            }
        }
        if (j == (needle.length())) {
            return i;
        }
        return -1;
//        if (needle.isEmpty()) {
//            return 0;
//        }
//        for (int i = 0; i < haystack.length(); i++) {
//            if (haystack.charAt(i) == needle.charAt(0)) {
//                for (int j = 0; j < needle.length(); j++) {
//                    if (i + j < haystack.length()) {
//                        if (haystack.charAt(i + j) != needle.charAt(j)) {
//                            i += j - 1;
//                            break;
//                        } else {
//                            if (j == needle.length() - 1) {
//                                return i;
//                            }
//                        }
//                    } else {
//                        return -1;
//                    }
//                }
//            }
//        }
//        return -1;
    }
}
