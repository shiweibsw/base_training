package com.bsw.base_training.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author shiwei
 * @Date 2021/1/18-19:25
 * @Email shiweibsw@gmail.com
 * 给你一个 m 行 n 列的二维网格 grid 和一个整数 k。你需要将 grid 迁移 k 次。
 * <p>
 * 每次「迁移」操作将会引发下述活动：
 * <p>
 * 位于 grid[i][j] 的元素将会移动到 grid[i][j + 1]。
 * 位于 grid[i][n - 1] 的元素将会移动到 grid[i + 1][0]。
 * 位于 grid[m - 1][n - 1] 的元素将会移动到 grid[0][0]。
 * 请你返回 k 次迁移操作后最终得到的 二维网格。
 * <p>
 *  
 * <p>
 * 示例 1：
 * <p>
 * <p>
 * <p>
 * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 1
 * 输出：[[9,1,2],[3,4,5],[6,7,8]]
 * 示例 2：
 * <p>
 * <p>
 * <p>
 * 输入：grid = [[3,8,1,9],[19,7,2,5],[4,6,11,10],[12,0,21,13]], k = 4
 * 输出：[[12,0,21,13],[3,8,1,9],[19,7,2,5],[4,6,11,10]]
 * 示例 3：
 * <p>
 * 输入：grid = [[1,2,3],[4,5,6],[7,8,9]], k = 9
 * 输出：[[1,2,3],[4,5,6],[7,8,9]]
 *  
 * <p>
 * 提示：
 * <p>
 * 1 <= grid.length <= 50
 * 1 <= grid[i].length <= 50
 * -1000 <= grid[i][j] <= 1000
 * 0 <= k <= 100
 * <p>
 */
class leetcode_1260 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        int m = grid.length;
        int n = grid[0].length;
        while (k > 0) {
            int[] l = new int[m];
            for (int i = 0; i < m; i++) {
                l[i] = grid[i][n - 1];
            }
            if (n >= 2) {
                for (int i = n - 2; i >= 0; --i) {
                    for (int j = 0; j < m; j++) {
                        grid[j][i + 1] = grid[j][i];
                    }
                }
            }
            for (int j = 1; j < m; j++) {
                grid[j][0] = l[j - 1];
            }
            grid[0][0] = l[m - 1];
            k--;
        }
        for (int i = 0; i < m; i++) {
            List<Integer> t = new ArrayList();
            for (int j = 0; j < n; j++) {
                t.add(grid[i][j]);
            }
            res.add(t);
        }
        return res;
    }
}
