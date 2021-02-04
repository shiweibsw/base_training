package com.bsw.base_training.leetcode;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author shiwei
 * @Date 2021/2/4-14:33
 * @Email shiweibsw@gmail.com
 */
class leetcode_973 {
    public int[][] kClosest(int[][] points, int K) {
        int m = points.length;
        if (K == m) {
            return points;
        }
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return (o1[0] * o1[0] + o1[1] * o1[1]) - (o2[0] * o2[0] + o2[1] * o2[1]);
            }
        });
        return Arrays.copyOfRange(points,0,K);
    }
}
