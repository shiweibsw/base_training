package com.bsw.base_training.leetcode;

/**
 * 给你一个整数数组 A，请你给数组中的每个元素 A[i] 都加上一个任意数字 x （-K <= x <= K），从而得到一个新数组 B 。
 * <p>
 * 返回数组 B 的最大值和最小值之间可能存在的最小差值。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：A = [1], K = 0
 * 输出：0
 * 解释：B = [1]
 * 示例 2：
 * <p>
 * 输入：A = [0,10], K = 2
 * 输出：6
 * 解释：B = [2,8]
 * 示例 3：
 * <p>
 * 输入：A = [1,3,6], K = 3
 * 输出：0
 * 解释：B = [3,3,3] 或 B = [4,4,4]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 10000
 * 0 <= K <= 10000
 *
 * @Author shiwei
 * @Date 2020/12/24-14:12
 * @Email shiweibsw@gmail.com
 */
class leetcode_908 {
    public int smallestRangeI(int[] A, int K) {
        if (A.length == 1) return 0;
        int min = 10000;
        int max = 0;
        for (int i = 0; i < A.length; i++) {
            if (min > A[i]) {
                min = A[i];
            }
            if (max < A[i]) {
                max = A[i];
            }
        }
        int maxCha = max - min;
        if (maxCha <= 2 * K) {
            return 0;
        } else {
            return maxCha - 2 * K;
        }
    }
}
