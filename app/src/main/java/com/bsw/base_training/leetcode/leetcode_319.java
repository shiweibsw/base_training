package com.bsw.base_training.leetcode;

import java.util.Arrays;

/**
 * @Author shiwei
 * @Date 2021/11/16-14:44
 * @Email shiweibsw@gmail.com
 */
class leetcode_319 {
    /**
     * 求完全平方数
     *
     * @param n
     * @return
     */
    public int bulbSwitch(int n) {
        return (int) Math.sqrt(n + 0.5);
    }


//    public int bulbSwitch(int n) {
//        int[] status = new int[n];
//        Arrays.fill(status, 1);
//        int curr = 2;//轮数
//        int step = 1;//步长
//        while (curr <= n) {
//            int index = 0;
//            while (index + step < n) {
//                if (status[index + step] == 1) {
//                    status[index + step] = 0;
//                } else {
//                    status[index + step] = 1;
//                }
//                index = index + step + 1;
//            }
//            step++;
//            curr++;
//        }
//        int res = 0;
//        for (int i : status) {
//            if (i == 1) {
//                res++;
//            }
//        }
//        return res;
//    }
}
