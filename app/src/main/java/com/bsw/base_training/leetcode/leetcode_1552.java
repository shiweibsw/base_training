package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author shiwei
 * @Date 2021/1/20-8:36
 * @Email shiweibsw@gmail.com
 */
class leetcode_1552 {
    public int maxDistance(int[] position, int m) {
        int n = position.length;
        Arrays.sort(position);
        if (m == 2) {
            return position[n - 1] - position[0];
        }
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - 02;
            }
        });
        for (int i = 0; i < position.length - 1; i++) {
            queue.offer(position[i + 1] - position[i]);
        }
        int res = 0;
        while (m > 2) {
            res = queue.poll();
            m--;
        }
        return res;
    }
}
