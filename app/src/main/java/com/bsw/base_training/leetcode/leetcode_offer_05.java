package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/2/2-16:33
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_05 {
    public String replaceSpace(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c != ' ') {
                sb.append(c);
            } else {
                sb.append("%20");
            }
        }
        return sb.toString();
    }
}
