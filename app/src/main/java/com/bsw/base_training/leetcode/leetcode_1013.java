package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * 给你一个整数数组 A，只有可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
 * <p>
 * 形式上，如果可以找出索引 i+1 < j 且满足 A[0] + A[1] + ... + A[i] == A[i+1] + A[i+2] + ... + A[j-1] == A[j] + A[j-1] + ... + A[A.length - 1] 就可以将数组三等分。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[0,2,1,-6,6,-7,9,1,2,0,1]
 * 输出：true
 * 解释：0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
 * 示例 2：
 * <p>
 * 输入：[0,2,1,-6,6,7,9,-1,2,0,1]
 * 输出：false
 * 示例 3：
 * <p>
 * 输入：[3,3,6,5,-2,2,5,1,-9,4]
 * 输出：true
 * 解释：3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
 *  
 * <p>
 * 提示：
 * <p>
 * 3 <= A.length <= 50000
 * -10^4 <= A[i] <= 10^4
 *
 * @Author shiwei
 * @Date 2021/1/14-15:10
 * @Email shiweibsw@gmail.com
 */
class leetcode_1013 {
    public boolean canThreePartsEqualSum(int[] arr) {
        int sum1 = 0;
        int sum3 = 0;
        int sum = 0;
        int n = arr.length;
        int i = 0;
        int j = n - 1;
        for (int x : arr) {
            sum += x;
        }
        if (sum % 3 != 0) {
            return false;
        }
        int v = sum / 3;
        while (i < n) {
            sum1 += arr[i];
            if (sum1 != v) {
                i++;
            } else {
                break;
            }
        }
        if (i == n - 1) {
            return false;
        }
        while (j > i + 1) {
            sum3 += arr[j];
            if (sum3 != v) {
                j--;
            } else {
                break;
            }
        }
        if (sum3 != v) {
            return false;
        }
        if (sum - sum1 - sum3 == v) {
            return true;
        }
        return false;

    }
}
