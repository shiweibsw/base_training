package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/1/21-13:59
 * @Email shiweibsw@gmail.com
 */
class leetcode_1370 {
    public String sortString(String s) {
        StringBuilder res = new StringBuilder();
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            ++arr[s.charAt(i) - 'a'];
        }
        while (res.length() < s.length()) {
            for (int i = 0; i < 26; i++) {
                if (arr[i] != 0) {
                    res.append((char) (i + 'a'));
                    arr[i]--;
                }
            }
            for (int i = 25; i >= 0; i--) {
                if (arr[i] != 0) {
                    res.append((char) (i + 'a'));
                    arr[i]--;
                }
            }
        }
        return res.toString();
    }
}
