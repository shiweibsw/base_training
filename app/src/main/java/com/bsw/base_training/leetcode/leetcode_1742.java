package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author shiwei
 * @Date 2021/2/1-14:20
 * @Email shiweibsw@gmail.com
 */
class leetcode_1742 {
    public int countBalls(int lowLimit, int highLimit) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = lowLimit; i <= highLimit; i++) {
            int s = getSumNum(i);
            map.put(s, map.getOrDefault(s, 0) + 1);
        }
        int max = 0;
        for (Map.Entry<Integer, Integer> e : map.entrySet()) {
            max = Math.max(max, e.getValue());
        }
        return max;

    }

    private int getSumNum(int a) {
        int sum = 0;
        while (a != 0) {
            sum += a % 10;
            a /= 10;
        }
        return sum;
    }
}
