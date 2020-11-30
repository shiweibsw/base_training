package com.bsw.base_training.leetcode;

/**
 * 给你一个 m * n 的矩阵 grid，矩阵中的元素无论是按行还是按列，都以非递增顺序排列。 
 * <p>
 * 请你统计并返回 grid 中 负数 的数目。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * 输入：grid = [[4,3,2,-1],[3,2,1,-1],[1,1,-1,-2],[-1,-1,-2,-3]]
 * 输出：8
 * 解释：矩阵中共有 8 个负数。
 * 示例 2：
 * <p>
 * 输入：grid = [[3,2],[1,0]]
 * 输出：0
 * 示例 3：
 * <p>
 * 输入：grid = [[1,-1],[-1,-1]]
 * 输出：3
 * 示例 4：
 * <p>
 * 输入：grid = [[-1]]
 * 输出：1
 *
 * @Author shiwei
 * @Date 2020/11/30-19:28
 * @Email shiweibsw@gmail.com
 */
class leetcode_1351 {
    public int countNegatives(int[][] grid) {
        if (grid.length == 0 || grid[0].length == 0)
            return 0;
        int count = 0;
        for (int i = 0, j = grid[0].length - 1; i < grid.length && j >= 0; ) {
            if (grid[i][j] >= 0) {
                i++;
            } else {
                count += grid.length - i;
                j--;
            }
        }
        return count;
    }
}
