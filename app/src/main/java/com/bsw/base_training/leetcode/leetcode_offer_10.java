package com.bsw.base_training.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 写一个函数，输入 n ，求斐波那契（Fibonacci）数列的第 n 项。斐波那契数列的定义如下：
 * <p>
 * F(0) = 0,   F(1) = 1
 * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
 * 斐波那契数列由 0 和 1 开始，之后的斐波那契数就是由之前的两数相加而得出。
 * <p>
 * 答案需要取模 1e9+7（1000000007），如计算初始结果为：1000000008，请返回 1。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：n = 2
 * 输出：1
 * 示例 2：
 * <p>
 * 输入：n = 5
 * 输出：5
 *  
 * <p>
 * 提示：
 * <p>
 * 0 <= n <= 100
 *
 * @Author shiwei
 * @Date 2020/11/24-13:02
 * @Email shiweibsw@gmail.com
 */
class leetcode_offer_10 {
    Map<Integer, Integer> cache = new HashMap();

    public int fib(int n) {
        //动态规划
        if (n == 0) return 0;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
            dp[i] %= 1000000007;
        }
        return dp[n];
        //return fib1(n) % (1000000007);
    }

    public int fib1(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        int n1 = 0;
        int n2 = 0;
        if (cache.get(n - 1) != null) {
            n1 = cache.get(n - 1);
        } else {
            n1 = fib1(n - 1);
            cache.put(n - 1, n1);
        }
        if (cache.get(n - 2) != null) {
            n2 = cache.get(n - 2);
        } else {
            n2 = fib1(n - 2);
            cache.put(n - 2, n1);
        }
        return n1 % (1000000007) + n2 % (1000000007);
    }
}
