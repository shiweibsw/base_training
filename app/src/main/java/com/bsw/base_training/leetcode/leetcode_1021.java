package com.bsw.base_training.leetcode;

import java.util.Stack;

/**
 * @Author shiwei
 * @Date 2021/2/2-15:50
 * @Email shiweibsw@gmail.com
 */
class leetcode_1021 {
    public String removeOuterParentheses(String S) {
        int size = 0;
        StringBuilder sb = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            char c = S.charAt(i);
            sb.append(c);
            if (c == '(') {
                size++;
            } else {
                size--;
                if (size == 0) {
                    if (sb.length() > 2) {
                        ans.append(sb.substring(1, sb.length() - 1));
                    }
                    sb.setLength(0);
                }
            }
        }
        return ans.toString();
    }
}
