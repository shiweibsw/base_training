package com.bsw.base_training.leetcode;

import java.util.Arrays;

/**
 *
 * @Author shiwei
 * @Date 2020/11/11-19:23
 * @Email shiweibsw@gmail.com
 */
class leetcode_1491 {
    public double average(int[] salary) {
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < salary.length; i++) {
            if (salary[i] >= salary[maxIndex]) {
                maxIndex = i;
            }
            if (salary[i] <= salary[minIndex]) {
                minIndex = i;
            }
        }
        int sum = 0;
        for (int i = 0; i < salary.length; i++) {
            if (i != maxIndex && i != minIndex) {
                sum += salary[i];
            }
        }
        return sum /  Double.valueOf(salary.length - 2);
    }
}
