package com.bsw.base_training.leetcode;

/**
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 * <p>
 * 如果不存在最后一个单词，请返回 0 。
 * <p>
 * 说明：一个单词是指仅由字母组成、不包含任何空格字符的 最大子字符串。
 * <p>
 *  
 * <p>
 * 示例:
 * <p>
 * 输入: "Hello World"
 * 输出: 5
 *
 * @Author shiwei
 * @Date 2020/12/16-14:23
 * @Email shiweibsw@gmail.com
 */
class leetcode_58 {
    public int lengthOfLastWord(String s) {
        int i = s.length() - 1;
        int c = 0;
        boolean begin = false;
        while (i >= 0) {
            if (Character.isLetter(s.charAt(i))) {
                c++;
                begin = true;
            } else {
                if (begin)
                    break;
            }
            i--;
        }
        return c;
    }
}
