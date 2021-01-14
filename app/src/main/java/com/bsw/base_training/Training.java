package com.bsw.base_training;

import java.util.Arrays;

/**
 * @Author shiwei
 * @Date 2020/11/14-15:07
 * @Email shiweibsw@gmail.com
 */
class Training {

    /**
     * 0-1 背包(二维数组)
     *
     * @param weight 每个物品重量
     * @param n      物品个数
     * @param w      背包可承载重量
     * @return
     */
    public int knapsack(int[] weight, int n, int w) {
        boolean[][] states = new boolean[n][w + 1];
        states[0][0] = true;//第一个物品没有放入背包
        if (weight[0] <= w) {
            states[0][weight[0]] = true;//第一个物品放入背包
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < w - weight[i]; j++) {//第i个物品不往背包里放，states[i][j]直接继承上一个物品时的状态
                if (states[i - 1][j] == true) states[i][j] = states[i - 1][j];
            }
            for (int j = 0; j < w - weight[i]; j++) {//第i个物品放入背包
                if (states[i - 1][j] == true) states[i][j + weight[i]] = true;
            }
        }
        for (int i = w; i >= 0; i--) {//最后一行中最右边为true的一列就是满足条件的最终值
            if (states[n - 1][i] == true) return i;
        }
        return -1;

    }

    /**
     * 0-1 背包(一维数组)
     *
     * @param weight 每个物品重量
     * @param n      物品个数
     * @param w      背包可承载重量
     * @return
     */
    public int knapsack2(int[] weight, int n, int w) {
        boolean[] states = new boolean[w + 1];
        states[0] = true;
        if (weight[0] <= w) {
            states[weight[0]] = true;
        }
        for (int i = 1; i < n; i++) {
            for (int j = w - weight[i]; j >= 0; j--) {
                if (states[j] == true) states[j + weight[i]] = true;
            }
        }
        for (int i = w; i >= 0; i--) {
            if (states[i] == true) return i;
        }
        return -1;
    }


    /**
     * 0-1 背包(带价值)
     *
     * @param weight 每个物品的重量
     * @param value  每个物品的价值
     * @param n      物品个数
     * @param w      背包能够承载的最大重量
     * @return
     */
    public int knapsack3(int[] weight, int[] value, int n, int w) {
        int[][] states = new int[n][w + 1];
        states[0][0] = 0;
        if (weight[0] <= w) {
            states[0][weight[0]] = value[0];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < w; j++) {
                if (states[i - 1][j] > 0) {
                    states[i][j] = states[i - 1][j];
                }
            }
            for (int j = 0; j < w - weight[i]; j++) {
                if (states[i - 1][j] > 0) {
                    int v = states[i - 1][j] + value[i];
                    if (v > states[i][j + weight[i]]) {//保留价值最大的
                        states[i][j + weight[i]] = v;
                    }
                }
            }
        }
        int maxValue = -1;
        for (int j = 0; j <= w; j++) {
            if (states[n - 1][j] > maxValue) {
                maxValue = states[n - 1][j];
            }
        }
        return maxValue;
    }

    /**
     * 状态转移表法求从左上到右下的最短距离
     *
     * @param matrix
     * @param n
     * @return
     */
    private int minDistDP(int[][] matrix, int n) {
        int[][] states = new int[n][n];
        int sum = 0;
        for (int i = 0; i < n; i++) {// 初始化states的第一行数据
            sum += matrix[0][i];
            states[0][i] = sum;
        }
        sum = 0;
        for (int i = 0; i < n; i++) {// 初始化states的第一列数据
            sum += matrix[i][0];
            states[i][0] = sum;
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < n; j++) {
                states[i][j] = matrix[i][j] + Math.min(states[i - 1][j], states[i][j - 1]);
            }
        }
        return states[n - 1][n - 1];
    }

    private int[][] matrix = {{1, 3, 5, 9}, {2, 1, 3, 4}, {5, 2, 6, 7}, {6, 8, 4, 3}};
    private int n = 4;
    private int[][] dp = new int[4][4];

    private int minDist(int i, int j) {
        if (i == 0 && j == 0) {
            return matrix[0][0];
        }
        if (dp[i][j] > 0) return dp[i][j];
        int minLeft = Integer.MAX_VALUE;
        if (j - 1 >= 0) {
            minLeft = minDist(i, j - 1);
        }
        int minUp = Integer.MAX_VALUE;
        if (i - 1 >= 0) {
            minLeft = minDist(i - 1, j);
        }
        dp[i][j] = matrix[i][j] + Math.min(minLeft, minUp);
        return dp[i][j];
    }

}
