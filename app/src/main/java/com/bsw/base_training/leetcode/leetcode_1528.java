package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2020/11/11-19:53
 * @Email shiweibsw@gmail.com
 */
class leetcode_1528 {

    public String restoreString(String s, int[] indices) {

        char[] chars = s.toCharArray();
        char[] results = new char[chars.length];
        for (int i = 0; i < chars.length; i++) {
            int p = indices[i];
            results[indices[i]]=chars[i];
        }
        return String.valueOf(results);
    }
}
