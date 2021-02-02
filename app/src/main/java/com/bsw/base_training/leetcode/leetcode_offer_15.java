package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/2/2-16:49
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_15 {
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans++;
            n = n & (n - 1);
        }
        return ans;
    }
}
