package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/4/16-11:45
 * @Email shiweibsw@gmail.com
 */
class leetcode_1071 {
    public String gcdOfStrings(String str1, String str2) {
        String str3 = str1.length() > str2.length() ? str1 : str2;
        String str4 = str1.length() > str2.length() ? str2 : str1;
        int index = str4.length();
        String ans = "";
        while (index >= 0) {
            String tmp = str4.substring(0, index);
            if (isYinzi(str3, tmp) && isYinzi(str4, tmp)) {
                ans = tmp;
                break;
            }
            index--;
        }
        return ans;

    }

    private boolean isYinzi(String str1, String str2) {
        return str1.split(str2).length == 0 || str1.equals(str2);
    }
}
