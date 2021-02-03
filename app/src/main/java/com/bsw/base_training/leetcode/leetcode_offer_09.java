package com.bsw.base_training.leetcode;

import java.util.Stack;

/**
 * @Author shiwei
 * @Date 2021/2/2-17:14
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_09 {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    public leetcode_offer_09() {
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
    }

    public void appendTail(int value) {
        s1.push(value);
    }

    public int deleteHead() {
        if (!s2.isEmpty()) {
            return s2.pop();
        } else {
            if (s1.isEmpty()) {
                return -1;
            } else {
                while (!s1.isEmpty()) {
                    s2.push(s1.pop());
                }
                return s2.pop();
            }
        }
    }


}
