package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。键盘如下图所示。
 *
 *
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *  
 *
 * 注意：
 *
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 *
 * @Author shiwei
 * @Date 2020/12/29-10:57
 * @Email shiweibsw@gmail.com
 */
class leetcode_500 {
    public String[] findWords(String[] words) {
        int[] arr = new int[26];
        char[] chars = new char[]{
                'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
        };
        for (char c : chars) {
            if (c == 'a' || c == 's' || c == 'd' || c == 'f' || c == 'g' || c == 'h' || c == 'j' || c == 'k' || c == 'l') {
                arr[c - 'a'] = 1;
            } else if (c == 'q' || c == 'w' || c == 'e' || c == 'r' || c == 't' || c == 'y' || c == 'u' || c == 'i' || c == 'o' || c == 'p') {
                arr[c - 'a'] = 2;
            } else {
                arr[c - 'a'] = 3;
            }
        }
        List<String> res = new ArrayList<>();
        for (String s : words) {
            char[] cs = s.toLowerCase().toCharArray();
            int t = 0;
            boolean flag = true;
            for (char c : cs) {
                if (t == 0) {
                    t = arr[c - 'a'];
                } else {
                    if (t != arr[c - 'a']) {

                        flag = false;
                        break;
                    }
                }
            }
            if (flag) {
                res.add(s);
            }
        }
        return res.toArray(new String[]{});
    }
}
