package com.bsw.base_training.leetcode;


import java.util.Stack;

public class leetcode_1472 {
    private Stack<String> backs = new Stack<String>();
    private Stack<String> forwards = new Stack<String>();

    public leetcode_1472(String homepage) {
        backs.push(homepage);
    }

    public void visit(String url) {
        forwards.clear();
        backs.push(url);
    }

    public String back(int steps) {
        if (backs.size() == 1) {
            return backs.peek();
        }
        int n = Math.min(steps, backs.size() - 1);
        while (n > 0) {
            String url = backs.pop();
            forwards.push(url);
            n--;
        }
        return backs.peek();
    }

    public String forward(int steps) {
        int n = Math.min(steps, forwards.size());
        while (n > 0) {
            String url = forwards.pop();
            backs.push(url);
            n--;
        }
        return backs.peek();
    }
}
