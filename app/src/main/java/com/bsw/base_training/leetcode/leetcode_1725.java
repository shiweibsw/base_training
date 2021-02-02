package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/2/2-15:05
 * @Email shiweibsw@gmail.com
 */
class leetcode_1725 {
    public int countGoodRectangles(int[][] rectangles) {
        int max = 0;
        int ans = 0;
        for (int i = 0; i < rectangles.length; i++) {
            int a = Math.min(rectangles[i][0], rectangles[i][1]);
            if (max >= a) {
                if (max == a) {
                    ans++;
                }
            } else {
                ans = 1;
                max = a;
            }
        }
        return ans;

    }
}
