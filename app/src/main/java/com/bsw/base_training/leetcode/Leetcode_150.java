package com.bsw.base_training.leetcode;

import java.util.Stack;

/**
 * @Author shiwei
 * @Date 2021/3/22-15:30
 * @Email shiweibsw@gmail.com
 */
class Leetcode_150 {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < tokens.length; i++) {
            if (isNum(tokens[i])) {
                stack.push(Integer.valueOf(tokens[i]));
            } else {
                int p2 = stack.pop();
                int p1 = stack.pop();
                switch (tokens[i]) {
                    case "+":
                        stack.push(p1 + p2);
                        break;
                    case "-":
                        stack.push(p1 - p2);
                        break;
                    case "*":
                        stack.push(p1 * p2);
                        break;
                    case "/":
                        stack.push(p1 / p2);
                        break;
                }
            }
        }
        return stack.pop();
    }

    private boolean isNum(String s) {
        return !s.equals("+") && !s.equals("-") && !s.equals("*") && !s.equals("/");
    }
}
