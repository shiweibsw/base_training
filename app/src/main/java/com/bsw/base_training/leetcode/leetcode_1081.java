package com.bsw.base_training.leetcode;

import java.util.Stack;

/**
 * @Author shiwei
 * @Date 2020/12/21-10:44
 * @Email shiweibsw@gmail.com
 */
class leetcode_1081 {
    public String smallestSubsequence(String s) {
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < sb.length(); i++) {
            char c = sb.charAt(i);
            int id = sb.indexOf(String.valueOf(c), i + 1);
            if (id != -1) {
                boolean flag = false;
                for (int j = i + 1; j < sb.length(); j++) {
                    if (c - sb.charAt(j) > 0) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {//后边有小于当前元素的c
                    sb.deleteCharAt(i);
                    i--;
                } else {//后边都是大的，删除后边所有的c
                    while (id != -1) {
                        sb.deleteCharAt(id);
                        id = sb.indexOf(String.valueOf(c), id + 1);
                    }
                }
            }
        }
        return sb.toString();
    }
}
