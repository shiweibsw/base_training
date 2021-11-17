package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/11/16-15:41
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_72 {
    public int mySqrt(int x) {
        int low = 0;
        int high = x;
        int result = -1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid <= x) {
                result = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return result;
    }
}
