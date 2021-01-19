package com.bsw.base_training.leetcode;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Author shiwei
 * @Date 2021/1/19-9:34
 * @Email shiweibsw@gmail.com
 * 给你一个由 不同 整数组成的整数数组 arr 和一个整数 k 。
 * <p>
 * 每回合游戏都在数组的前两个元素（即 arr[0] 和 arr[1] ）之间进行。比较 arr[0] 与 arr[1] 的大小，较大的整数将会取得这一回合的胜利并保留在位置 0 ，较小的整数移至数组的末尾。当一个整数赢得 k 个连续回合时，游戏结束，该整数就是比赛的 赢家 。
 * <p>
 * 返回赢得比赛的整数。
 * <p>
 * 题目数据 保证 游戏存在赢家。
 * <p>
 *  提示：
 * <p>
 * 2 <= arr.length <= 10^5
 * 1 <= arr[i] <= 10^6
 * arr 所含的整数 各不相同 。
 * 1 <= k <= 10^9
 */
class leetcode_1535 {
    public int getWinner(int[] arr, int k) {
        // Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        // for (int i = 0; i < arr.length; i++) {
        //     queue.offer(arr[i]);
        // }
        // int res =0;
        // int big = queue.poll();
        // int num2 = 0;
        // if(k>arr.length){
        //     k=arr.length;
        // }
        // while (res != k) {
        //     num2 = queue.poll();
        //     if (big > num2) {
        //         res++;
        //         queue.offer(num2);
        //     } else {
        //         queue.offer(big);
        //         big = num2;
        //         res = 1;
        //     }
        // }
        // return big;
        int prev = Math.max(arr[0], arr[1]);
        if (k == 1) {
            return prev;
        }
        int consecutive = 1;
        int maxNum = prev;
        int length = arr.length;
        for (int i = 2; i < length; i++) {
            int curr = arr[i];
            if (prev > curr) {
                consecutive++;
                if (consecutive == k) {
                    return prev;
                }
            } else {
                prev = curr;
                consecutive = 1;
            }
            maxNum = Math.max(maxNum, curr);
        }
        return maxNum;
    }
}
