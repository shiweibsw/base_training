package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/3/5-14:36
 * @Email shiweibsw@gmail.com
 */
class leetcode_482 {
    public String licenseKeyFormatting(String S, int K) {
        String newS = S.replace("-", "").toUpperCase();
        int letterSize = S.length();
        int firstSize = letterSize % K;
        int n = letterSize / K;
        StringBuilder ans = new StringBuilder();
        int index = 0;
        if(firstSize>0){
            ans.append(newS.substring(index, firstSize));
            if(n!=0){
                ans.append("-");
            }
        }
        index = firstSize;
        while (n != 0) {
            ans.append(newS.substring(index, index + K));
            index += K;
            n--;
            if (n != 0) {
                ans.append("-");
            }
        }
        return ans.toString();

    }
}
