package com.bsw.base_training.leetcode;

import java.util.PriorityQueue;
import java.util.Stack;

/**
 * @Author shiwei
 * @Date 2021/12/1-10:25
 * @Email shiweibsw@gmail.com
 */
class leetcode_155 {
    /**
     * initialize your data structure here.
     */
    PriorityQueue<Integer> queue;
    Stack<Integer> stack;

    public leetcode_155() {
        queue = new PriorityQueue<>();
        stack = new Stack<>();
    }

    public void push(int x) {
        queue.offer(x);
        stack.push(x);
    }

    public void pop() {
        int x = stack.pop();
        queue.remove(x);
    }

    public int top() {
        return stack.peek();
    }

    public int min() {
        return queue.peek();
    }
}
