package com.bsw.base_training.leetcode;

import java.util.Stack;

/**
 * 给你一个正整数数组 arr，请你找出一个长度为 m 且在数组中至少重复 k 次的模式。
 * <p>
 * 模式 是由一个或多个值组成的子数组（连续的子序列），连续 重复多次但 不重叠 。 模式由其长度和重复次数定义。
 * <p>
 * 如果数组中存在至少重复 k 次且长度为 m 的模式，则返回 true ，否则返回  false 。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：arr = [1,2,4,4,4,4], m = 1, k = 3
 * 输出：true
 * 解释：模式 (4) 的长度为 1 ，且连续重复 4 次。注意，模式可以重复 k 次或更多次，但不能少于 k 次。
 * 示例 2：
 * <p>
 * 输入：arr = [1,2,1,2,1,1,1,3], m = 2, k = 2
 * 输出：true
 * 解释：模式 (1,2) 长度为 2 ，且连续重复 2 次。另一个符合题意的模式是 (2,1) ，同样重复 2 次。
 * 示例 3：
 * <p>
 * 输入：arr = [1,2,1,2,1,3], m = 2, k = 3
 * 输出：false
 * 解释：模式 (1,2) 长度为 2 ，但是只连续重复 2 次。不存在长度为 2 且至少重复 3 次的模式。
 * 示例 4：
 * <p>
 * 输入：arr = [1,2,3,1,2], m = 2, k = 2
 * 输出：false
 * 解释：模式 (1,2) 出现 2 次但并不连续，所以不能算作连续重复 2 次。
 * 示例 5：
 * <p>
 * 输入：arr = [2,2,2,2], m = 2, k = 3
 * 输出：false
 * 解释：长度为 2 的模式只有 (2,2) ，但是只连续重复 2 次。注意，不能计算重叠的重复次数。
 * <p>
 * 思路：
 * 题目要求我们找到一个连续出现 kk 次且长度为 mm 的子数组。也就是说如果这个子数组的左端点是 ll，那么对于任意 {\rm offset} \in [0, m \times k)offset∈[0,m×k)，都有 a[l + {\rm offset}] = a[l + ({\rm offset} \bmod m)]a[l+offset]=a[l+(offsetmodm)]。因此，我们可以枚举左端点 ll，对于每个 ll 枚举 {\rm offset} \in [0, m \times k)offset∈[0,m×k)，判断是否满足条件即可。
 *
 * @Author shiwei
 * @Date 2020/12/2-14:25
 * @Email shiweibsw@gmail.com
 */
class leetcode_1566 {
    public int maxProfit(int[] prices) {
        int result = 0;
        Stack<Integer> s = new Stack<Integer>();
        for (int i = 0; i < prices.length; i++) {
            if (s.isEmpty()) {
                s.push(prices[i]);
                continue;
            }
            if (prices[i] <= s.peek()) {
                s.pop();
                s.push(prices[i]);
            } else {
                if (i + 1 < prices.length) {
                    if (prices[i] > prices[i + 1]) {
                        result += prices[i] - s.pop();
                        s.push(prices[i + 1]);
                    }
                } else {
                    result += prices[i] - s.pop();
                }
            }
        }
        return result;
    }


    public boolean containsPattern(int[] arr, int m, int k) {
        int n = arr.length;
        for (int l = 0; l <= n - m * k; l++) {
            int offset = 0;
            for (offset = 0; offset < m * k; offset++) {
                if (arr[l + offset] != arr[l + offset % m]) {
                    break;
                }
            }
            if (offset == m * k) {
                return true;
            }
        }
        return false;
    }
}
