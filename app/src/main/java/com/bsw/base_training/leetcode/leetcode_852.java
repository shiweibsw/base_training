package com.bsw.base_training.leetcode;

import java.io.File;

/**
 * 我们把符合下列属性的数组 A 称作山脉：
 * <p>
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：[0,2,1,0]
 * 输出：1
 *
 * @Author shiwei
 * @Date 2020/11/16-15:04
 * @Email shiweibsw@gmail.com
 */
class leetcode_852 {
    public int peakIndexInMountainArray(int[] arr) {
        //迭代搜索
//        int maxIndex = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] > arr[maxIndex]) {
//                maxIndex = i;
//            } else if (arr[i] < arr[maxIndex]) {
//                return maxIndex;
//            }
//        }
//        return maxIndex;

        int lo = 0, hi = arr.length - 1;
        while (lo < hi) {
            int mi = lo + (hi - lo) / 2;
            if (arr[mi] < arr[mi + 1])
                lo = mi + 1;
            else
                hi = mi;
        }
        return lo;
    }
}
