package com.bsw.base_training;

import java.util.Arrays;

/**
 * @Author shiwei
 * @Date 2020/11/14-8:43
 * @Email shiweibsw@gmail.com
 */
public class Utils {
    public static void swap(int a, int b) {
        int tmp = a;
        a = b;
        b = tmp;
    }

    /**
     * 二维数组升序排序()
     *
     * @param points
     */
    public static void sort(int[][] points) {
        Arrays.sort(points, (point1, point2) -> {
            if (point1[1] > point2[1]) {
                return 1;
            } else if (point1[1] < point2[1]) {
                return -1;
            } else {
                return 0;
            }
        });
    }
}
