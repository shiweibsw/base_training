package com.bsw.base_training.leetcode;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 使用队列实现栈的下列操作：
 * <p>
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 * <p>
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 *
 * @Author shiwei
 * @Date 2020/11/27-13:39
 * @Email shiweibsw@gmail.com
 */
class leetcode_252 {

    private Queue<Integer> queue = null;
    private Queue<Integer> acahe = null;
    private int size = 0;
    private int lastVal = -1;

    /**
     * Initialize your data structure here.
     */
    public leetcode_252() {
        queue = new ConcurrentLinkedQueue<>();
        acahe = new ConcurrentLinkedQueue<>();
    }

    /**
     * Push element x onto stack.
     */
    public void push(int x) {
        size++;
        lastVal = x;
        queue.offer(x);
    }

    /**
     * Removes the element on top of the stack and returns that element.
     */
    public int pop() {
        size--;
        int top = -1;
        while (queue.size() > 1) {
            acahe.offer(queue.poll());
        }
        top = queue.poll();
        while (!acahe.isEmpty()) {
            lastVal = acahe.poll();
            queue.offer(lastVal);
        }
        return top;
    }

    /**
     * Get the top element.
     */
    public int top() {
        return lastVal;
    }

    /**
     * Returns whether the stack is empty.
     */
    public boolean empty() {
        return size == 0;
    }
}
