package com.bsw.base_training.leetcode;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * @Author shiwei
 * @Date 2020/12/2-13:31
 * @Email shiweibsw@gmail.com
 */
class leetcode_1089 {
    public void duplicateZeros(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == 0) {
                int j = arr.length - 1;
                for (; j >= i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;
            }
        }

//        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
//        for (int i : arr) {
//            queue.offer(i);
//        }
//        int i = 0;
//        while (i < arr.length) {
//            int q = queue.poll();
//            arr[i] = q;
//            if (q == 0 && i != arr.length - 1) {
//                arr[++i] = 0;
//            }
//            i++;
//        }


    }
}
