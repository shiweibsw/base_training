package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/22-16:14
 * @Email shiweibsw@gmail.com
 */
class leetcode_1701 {
    public double averageWaitingTime(int[][] customers) {
        double waitTime = customers[0][1];//第一位顾客的等待时间
        double startTime = customers[0][1] + customers[0][0];
        for (int i = 1; i < customers.length; i++) {
            int time = customers[i][0];
            int need = customers[i][1];
            waitTime += need;
            if (startTime > time) {
                waitTime += startTime - time;
                startTime += need;
            } else {
                startTime = time + need;
            }
        }
        return waitTime / customers.length;
    }
}
