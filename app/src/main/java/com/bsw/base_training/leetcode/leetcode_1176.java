package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/27-11:54
 * @Email shiweibsw@gmail.com
 */
class leetcode_1176 {
    public int dietPlanPerformance(int[] calories, int k, int lower, int upper) {
        int score = 0;
        int curr = 0;
        for (int i = 0; i <= calories.length - k; i++) {
            int t = 0;
            if (curr == 0) {
                while (t < k) {
                    curr += calories[i + t];
                    t++;
                }
            } else {
                curr += calories[i + k - 1];
                curr -= calories[i - 1];
            }
            if (curr > upper) {
                score++;
            } else if (curr < lower) {
                score--;
            }
        }
        return score;
    }
}
