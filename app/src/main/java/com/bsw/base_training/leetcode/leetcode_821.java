package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/3-15:11
 * @Email shiweibsw@gmail.com
 */
class leetcode_821 {
    public int[] shortestToChar(String s, char c) {
        int[] ans = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            if (c1 == c) {
                ans[i] = 0;
            } else {
                int id = 0;
                int distance = s.length();
                while (id != -1) {
                    id = s.indexOf(String.valueOf(c), id);
                    if (id == -1) {
                        break;
                    }
                    int d = Math.abs(i - id);
                    if (d < distance) {
                        distance = d;
                    }
                }
                ans[i] = distance;
            }
        }
        return ans;
    }
}
