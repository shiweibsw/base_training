package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shiwei
 * @Date 2020/12/11-15:18
 * @Email shiweibsw@gmail.com
 */
class leetcode_1544 {
    public String makeGood(String s) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        sb.append(s);
        while (i < sb.length() - 1) {
            int c1 = sb.charAt(i);
            int c2 = sb.charAt(i + 1);
            if (Math.abs(c1 - c2) == 32) {
                sb.deleteCharAt(i);
                sb.deleteCharAt(i);
                if (i > 0) {
                    i--;
                }
            } else {
                i++;
            }
        }
        return sb.toString();
    }
}
