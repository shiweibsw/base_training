package com.bsw.base_training.leetcode;

import java.util.Stack;

/**
 * @Author shiwei
 * @Date 2020/12/14-19:04
 * @Email shiweibsw@gmail.com
 */
class leetcode_415 {
    public String addStrings(String num1, String num2) {
        int di = 0;
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        while (i >= 0 || j >= 0 || di == 1) {
            int s1 = i >= 0 ? num1.charAt(i--) - '0' : 0;
            int s2 = j >= 0 ? num2.charAt(j--) - '0' : 0;
            int s = s1 + s2 + di;
            if (s > 9) {
                di = 1;
                sb.append(s - 10);
            } else {
                di = 0;
                sb.append(s);
            }
        }
        return sb.reverse().toString();

    }
}
