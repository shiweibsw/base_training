package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * @Author shiwei
 * @Date 2021/2/20-11:27
 * @Email shiweibsw@gmail.com
 */
class leetcode_1004 {
    public int longestOnes(int[] A, int K) {
        int N = A.length;
        int res = 0;
        int left = 0, right = 0;
        int zeros = 0;
        while (right < N) {
            if (A[right] == 0)
                zeros++;
            while (zeros > K) {
                if (A[left++] == 0)
                    zeros--;
            }
            res = Math.max(res, right - left + 1);
            right++;
        }
        return res;


        // int k = K;
        // int ans = 0;
        // int curr = 0;
        // Queue<Integer> queue = new LinkedList();
        // for (int i = 0; i < A.length; i++) {
        //     if (A[i] == 1) {
        //         curr++;
        //     } else {
        //         if (k > 0) {
        //             curr++;
        //             k--;
        //             queue.offer(i);//记录0的位置
        //         } else {
        //             if (queue.isEmpty()) {//K==0
        //                 curr = 0;
        //             } else {
        //                 curr = i - queue.poll();
        //                 queue.offer(i);
        //             }
        //         }
        //     }
        //     if(ans<curr){
        //         ans=curr;
        //     }
        // }
        // return ans;
    }
}
