package com.bsw.base_training.leetcode;

/**
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 *
 *  
 *
 * 示例：
 *
 * 输入："Let's take LeetCode contest"
 * 输出："s'teL ekat edoCteeL tsetnoc"
 *  
 *
 * 提示：
 *
 * 在字符串中，每个单词由单个空格分隔，并且字符串中不会有任何额外的空格。
 *
 * @Author shiwei
 * @Date 2020/12/11-16:10
 * @Email shiweibsw@gmail.com
 */
class leetcode_557 {
    public String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        String s1 = reverseWord(s);
        String[] chars = s1.split(" ");
        int j = chars.length - 1;
        while (j >= 0) {
            res.append(chars[j]);
            if (j > 0) {
                res.append(" ");
            }
            j--;
        }
        return res.toString();
    }

    public String reverseWord(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        while (i < j) {
            char t = chars[i];
            chars[i] = chars[j];
            chars[j] = t;
            i++;
            j--;
        }
        return new String(chars);
    }
}
