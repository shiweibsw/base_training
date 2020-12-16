package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2020/12/16-14:00
 * @Email shiweibsw@gmail.com
 */
class leetcode_1309 {
    public String freqAlphabets(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i) - '0';
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                int n = s.charAt(i + 1) - '0';
                sb.append((char) (c * 10 + n + 96));
                i += 2;
            } else {
                sb.append((char) (c + 96));
            }
        }
        return sb.toString();
    }
}
