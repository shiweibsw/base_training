package com.bsw.base_training.leetcode;

/**
 * @Author shiwei
 * @Date 2021/1/26-14:57
 * @Email shiweibsw@gmail.com
 */
class leetcode_766 {
    public boolean isToeplitzMatrix(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        //检查行
        for (int i = 0; i < m - 1; i++) {
            int row = i + 1;
            int col = 1;
            int c = matrix[i][0];
            while (row < m && col < n) {
                if (matrix[row][col] == c) {
                    row++;
                    col++;
                } else {
                    return false;
                }
            }
        }
        //检查列
        for (int i = 1; i < n - 1; i++) {
            int row = 1;
            int col = i + 1;
            int c = matrix[0][i];
            while (row < m && col < n) {
                if (matrix[row][col] == c) {
                    row++;
                    col++;
                } else {
                    return false;
                }
            }
        }
        return true;
    }
}
