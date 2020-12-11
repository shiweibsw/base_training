package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2020/12/11-13:34
 * @Email shiweibsw@gmail.com
 */
class leetcode_434 {
    public int countSegments(String s) {
        int res = 0;
        int len = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                len++;
            } else {
                if (len > 0) {
                    res += 1;
                    len = 0;
                }
            }
        }
        if (len > 0) {
            res += 1;
        }
        return res;
    }
}
